package com.indtel.mcf.utils.tasks;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.model.db.flag.Flag;
import com.indtel.mcf.utils.Logger;
import com.indtel.mcf.utils.rx.SchedulerProvider;

import java.util.List;

import javax.inject.Singleton;

import static com.indtel.mcf.utils.AppConstants.RESULT_SUCCESS;

/**
 * Author       : Arvindo Mondal
 * Created on   : 13-05-2019
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
@Singleton
public class Tasks extends BaseViewModel<Task> implements Task{

    public Tasks(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    //Callable methods---------------------

    @Override
    public void getFlagApi() {
        _getFlagApi();
    }

    @Override
    public <V extends BaseViewModel> void getFlagApi(V viewModel) {
        _getFlagApi(viewModel);
    }

    @Override
    public void saveFlagDb(List<Flag> list,  String flagBaseUrl) {
        _saveFlagDb(list, flagBaseUrl);
    }

    @Override
    public <V extends BaseViewModel> void getFlagDb(V viewModel) {
        _getFlagDb(viewModel);
    }

    //Flag----------------------------------


    private <V extends BaseViewModel> void  _getFlagApi(V viewModel) {
        getCompositeDisposable().add(getDataManager()
                .countryCode()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().newThread())
                .subscribe(response -> {
                    if (response != null && response.getStatus() == RESULT_SUCCESS) {
                        _saveFlagDb( response.getData().getFlag(), response.getData().getFlagBaseUrl());
                    }
                }, Throwable::printStackTrace));
    }

    private void _getFlagApi(){
        getCompositeDisposable().add(getDataManager()
                .countryCode()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().newThread())
                .subscribe(response -> {
                    if (response != null && response.getStatus() == RESULT_SUCCESS) {
                        _saveFlagDb( response.getData().getFlag(), response.getData().getFlagBaseUrl());
                    }
                }, Throwable::printStackTrace));
    }

    private void _saveFlagDb(List<Flag> list, String flagBaseUrl){
        getCompositeDisposable().add(getDataManager()
                .saveFlagsListDb(list)
                .doOnComplete(() -> Logger.d("Success save flag"))
                .doOnError(Logger::e)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().newThread())
                .subscribe(response -> {
                    if(response != null && response){
                        updateFlagBaseUrlDb( flagBaseUrl);
                    }
                }, Throwable::printStackTrace));
    }

    private void updateFlagBaseUrlDb(String flagBaseUrl){
        getCompositeDisposable().add(getDataManager()
                .updateFlagBaseUrlDb(flagBaseUrl)
                .doOnComplete(() -> Logger.d("Success save flag"))
                .doOnError(Logger::e)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().newThread())
                .subscribe(response -> {
                }, Throwable::printStackTrace));
    }


    private <V extends BaseViewModel> void _getFlagDb(V viewModel) {
        getCompositeDisposable().add(getDataManager()
                .getAllFlagsDb()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if(response != null && !response.isEmpty()){
//                        viewModel.onResponse(FLAG_GET_SUCCESS_DB, response);
                    }
                    //Inserted
                }, Throwable::printStackTrace));
    }

}
