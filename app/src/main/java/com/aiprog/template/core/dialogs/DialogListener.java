package com.aiprog.template.core.dialogs;

import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 13-08-2019
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
public interface DialogListener {

    /**
     * Default response method of a dialog
     * @param tag class name from which the response is getting
     * @param params string array with relative data
     */
    void onSuccessDialogResponse(String tag, String... params);

    interface DialogListenerModelList{
        /**
         *
         * Default response method of a dialog Model list
         * @param tag class name from which the response is getting
         * @param modelList DialogModel list with relative data
         */
        void onSuccessDialogResponse(String tag, List<DialogModel> modelList);
    }

    interface DialogtListenerModel{
        /**
         *
         * Default response method of a dialog Model list
         * @param tag class name from which the response is getting
         * @param model DialogModel with relative data
         */
        void onSuccessDialogResponse(String tag, DialogModel model);
    }
}
