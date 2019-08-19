package com.aiprog.template.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.aiprog.template.core.dialogs.deficiencies.DeficienciesViewModel;
import com.aiprog.template.core.fragments.FragmentHandlerViewModel;
import com.aiprog.template.core.fragments.statusOfApplication.StatusOfApplicationViewModel;
import com.aiprog.template.core.fragments.viewItem.ViewItemViewModel;
import com.aiprog.template.data.DataManager;
import com.aiprog.template.ui.home.vendor.VendorHomeViewModel;
import com.aiprog.template.ui.launcher.credential.LoginViewModel;
import com.aiprog.template.ui.launcher.splash.SplashViewModel;
import com.aiprog.template.ui.launcher.welcome.WelcomeViewModel;
import com.aiprog.template.utils.rx.SchedulerProvider;
import com.aiprog.template.utils.tasks.Task;
import com.aiprog.template.utils.tasks.Tasks;

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

        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
