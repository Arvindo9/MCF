package com.indtel.mcf.core.fragments.dashboard;

import com.indtel.mcf.core.fragments.dashboard.adapter.DashboardAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
@Module
public class DashboardModule {

    @Provides
    DashboardAdapter provideDashboardAdapter() {
        return new DashboardAdapter(new ArrayList<>());
    }
}
