package com.indtel.mcf.core.fragments.scrutinyOfdocuments;

import com.indtel.mcf.core.fragments.scrutinyOfdocuments.adapter.ScrutinyOfDocumentAdapter;

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
public class ScrutinyOfDocumentModule {

    @Provides
    ScrutinyOfDocumentAdapter provideScrutinyOfDocumentAdapter() {
        return new ScrutinyOfDocumentAdapter(new ArrayList<>());
    }
}
