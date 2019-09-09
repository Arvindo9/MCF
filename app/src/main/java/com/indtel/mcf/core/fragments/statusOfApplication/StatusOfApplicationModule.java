package com.indtel.mcf.core.fragments.statusOfApplication;

import com.indtel.mcf.core.fragments.statusOfApplication.adapter.StatusOfApplicationAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
 * Email        : arvindo@indtel.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.indtel.in
 */
@Module
public class StatusOfApplicationModule {

    @Provides
    StatusOfApplicationAdapter provideStatusOfApplicationAdapter() {
        return new StatusOfApplicationAdapter(new ArrayList<>());
    }
}
