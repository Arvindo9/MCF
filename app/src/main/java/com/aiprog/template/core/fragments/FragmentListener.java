package com.indtel.template.core.fragments;

import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 10-08-2019
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
public interface FragmentListener {
    void onSuccessResponse(String tag, String... params);

    void onFailureResponse(String tag, int errorCode, String message, Throwable throwable);

    interface FragmentListenerModelList{
        void onSuccessResponse(String tag, List<FragmentModel> modelList);

        void onFailureResponse(String tag, int errorCode, String message, Throwable throwable);
    }

    interface FragmentListenerModel{
        void onSuccessResponse(String tag, FragmentModel model);

        void onFailureResponse(String tag, int errorCode, String message, Throwable throwable);
    }
}
