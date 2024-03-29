package com.indtel.mcf.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.indtel.mcf.di.annotation.ApiService;
import com.indtel.mcf.di.annotation.DatabaseInfo;
import com.indtel.mcf.di.annotation.PassPhraseField;
import com.indtel.mcf.di.annotation.PreferenceInfo;
import com.indtel.mcf.data.AppDataManager;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.local.db.AppDatabase;
import com.indtel.mcf.data.local.db.Database;
import com.indtel.mcf.data.local.db.DatabaseService;
import com.indtel.mcf.data.local.prefs.AppPreferences;
import com.indtel.mcf.data.local.prefs.PreferencesService;
import com.indtel.mcf.data.remote.APIService;
import com.indtel.mcf.data.remote.APIs;
import com.indtel.mcf.utils.AppConstants;
import com.indtel.mcf.utils.rx.AppSchedulerProvider;
import com.indtel.mcf.utils.rx.SchedulerProvider;
import com.indtel.mcf.utils.tasks.Task;
import com.indtel.mcf.utils.tasks.Tasks;
import com.indtel.mcf.utils.util.Resource;
import com.indtel.mcf.utils.util.ResourceUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static com.indtel.mcf.BuildConfig.BASE_URL;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
 * Email        : arvindo@aiprog.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.aiprog.in
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    //Preferences------------------------------------------------

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesService providePreferencesService(AppPreferences appPreferences) {
        return appPreferences;
    }
    //Database----------------------------------------------------

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @PassPhraseField
    String providePassPhraseField() {
        return AppConstants.PASS_PHRASE_FIELD;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context, @PassPhraseField String passPhraseField) {
//        SafeHelperFactory factory = SafeHelperFactory.fromUser(passphraseField.getText());
//        SafeHelperFactory factory = SafeHelperFactory.fromUser(new SpannableStringBuilder(passPhraseField),
//                SafeHelperFactory.POST_KEY_SQL_V3);

        return Room.databaseBuilder(context, AppDatabase.class, dbName).fallbackToDestructiveMigration()
//                .openHelperFactory(factory)
                .build();
    }

    @Provides
    @Singleton
    DatabaseService provideDbHelper(Database database) {
        return database;
    }

    //Network module----------------------------------------------------

    @Provides
    @Singleton
    APIService provideAPIService(APIs APIs) {
        return APIs;
    }

    @Provides
    @Singleton
    @ApiService
    APIs provideAPIHeader(@Named("APP") Retrofit retrofit, @Named("UTILS") Retrofit retrofitUtils) {
        return new APIs(retrofit, retrofitUtils);
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @Singleton
    Cache provideHttpCache(Application application) {
//        int cacheSize = 10 * 1024 * 1024;
        return new Cache(application.getCacheDir(), 10485760);
    }

    @Provides
    @Singleton
    OkHttpClient provideOkhttpClient(Cache cache) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient
                .Builder()
                .cache(cache)
                .addInterceptor(interceptor)
                .readTimeout(300, TimeUnit.SECONDS)
                .connectTimeout(300, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @Singleton
    @Named("APP")
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    @Named("UTILS")
    Retrofit provideRetrofitUtils(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(okHttpClient)
                .build();
    }

    //Additional task----------------------------------------------

    @Provides
    @Singleton
    Task provideTaskViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new Tasks(dataManager, schedulerProvider);
    }

    @Provides
    @Singleton
    Resource provideResource() {
        return new ResourceUtils();
    }

    //------------------------end-----------------------------------
}
