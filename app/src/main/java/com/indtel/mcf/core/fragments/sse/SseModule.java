package com.indtel.mcf.core.fragments.sse;

import com.indtel.mcf.core.fragments.scrutinyOfdocuments.adapter.ScrutinyOfDocumentAdapter;
import com.indtel.mcf.core.fragments.sse.adapter.SseAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Author       : Arvindo Mondal
 * Created on   : 10-09-2019
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
public class SseModule {

    @Provides
    SseAdapter provideSseAdapter() {
        return new SseAdapter(new ArrayList<>());
    }
}
