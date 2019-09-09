package com.indtel.mcf.utils.tasks;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.model.db.flag.Flag;

import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 22-05-2019
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
public interface Task {

    void getFlagApi();

    <V extends BaseViewModel> void getFlagApi(V viewModel);

    void saveFlagDb(List<Flag> list, String flagBaseUrl);

    <V extends BaseViewModel> void getFlagDb(V viewModel);

}
