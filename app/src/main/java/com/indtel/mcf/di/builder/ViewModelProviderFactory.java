package com.indtel.mcf.di.builder;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.indtel.mcf.core.fragments.dashboard.DashboardViewModel;
import com.indtel.mcf.core.fragments.scrutinyOfdocuments.ScrutinyOfDocumentViewModel;
import com.indtel.mcf.core.fragments.sse.SseViewModel;
import com.indtel.mcf.ui.home.ao.AoHomeViewModel;
import com.indtel.mcf.ui.home.sse.SseHomeViewModel;
import com.indtel.mcf.ui.home.vendor.VendorHomeViewModel;
import com.indtel.mcf.ui.launcher.credential.LoginViewModel;
import com.indtel.mcf.ui.launcher.splash.SplashViewModel;
import com.indtel.mcf.ui.launcher.welcome.WelcomeViewModel;
import com.indtel.mcf.core.dialogs.cases.CasesViewModel;
import com.indtel.mcf.core.dialogs.deficiencies.DeficienciesViewModel;
import com.indtel.mcf.core.dialogs.vendorWise.VendorWiseViewModel;
import com.indtel.mcf.core.fragments.FragmentHandlerViewModel;
import com.indtel.mcf.core.fragments.casesAfterAssessment.CasesAfterAssessmentViewModel;
import com.indtel.mcf.core.fragments.statusOfApplication.StatusOfApplicationViewModel;
import com.indtel.mcf.core.fragments.viewItem.ViewItemViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.rx.SchedulerProvider;
import com.indtel.mcf.utils.tasks.Task;
import com.indtel.mcf.utils.tasks.Tasks;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Author       : Arvindo Mondal
 * Created on   : 10-05-2019
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
public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory  {

    private final DataManager dataManager;
    private final SchedulerProvider schedulerProvider;
    private final Task task;

    @Inject
    public ViewModelProviderFactory(DataManager dataManager,
                                    SchedulerProvider schedulerProvider, Task task) {
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
        this.task = task;
    }

    @NotNull
    @Override
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(Tasks.class)) {
            //noinspection unchecked
            return (T) new Tasks(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(SplashViewModel.class)) {
            //noinspection unchecked
            return (T) new SplashViewModel(dataManager,schedulerProvider, task);
        }
        else if (modelClass.isAssignableFrom(WelcomeViewModel.class)) {
            //noinspection unchecked
            return (T) new WelcomeViewModel(dataManager,schedulerProvider, task);
        }
        else if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            //noinspection unchecked
            return (T) new LoginViewModel(dataManager,schedulerProvider, task);
        }
        else if (modelClass.isAssignableFrom(VendorHomeViewModel.class)) {
            //noinspection unchecked
            return (T) new VendorHomeViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(FragmentHandlerViewModel.class)) {
            //noinspection unchecked
            return (T) new FragmentHandlerViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(StatusOfApplicationViewModel.class)) {
            //noinspection unchecked
            return (T) new StatusOfApplicationViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(ViewItemViewModel.class)) {
            //noinspection unchecked
            return (T) new ViewItemViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(DeficienciesViewModel.class)) {
            //noinspection unchecked
            return (T) new DeficienciesViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(SseHomeViewModel.class)) {
            //noinspection unchecked
            return (T) new SseHomeViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(CasesViewModel.class)) {
            //noinspection unchecked
            return (T) new CasesViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(VendorWiseViewModel.class)) {
            //noinspection unchecked
            return (T) new VendorWiseViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(DashboardViewModel.class)) {
            //noinspection unchecked
            return (T) new DashboardViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(ScrutinyOfDocumentViewModel.class)) {
            //noinspection unchecked
            return (T) new ScrutinyOfDocumentViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(CasesAfterAssessmentViewModel.class)) {
            //noinspection unchecked
            return (T) new CasesAfterAssessmentViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(SseViewModel.class)) {
            //noinspection unchecked
            return (T) new SseViewModel(dataManager,schedulerProvider);
        }
        else if (modelClass.isAssignableFrom(AoHomeViewModel.class)) {
            //noinspection unchecked
            return (T) new AoHomeViewModel(dataManager,schedulerProvider);
        }

        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
