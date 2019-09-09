/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.indtel.mcf.utils;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
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

public enum  AppConstants {

    INSTANCE;

    public static final String FIREBASE_NOTIFICATION_TOPIC = "NOTIFICATION_TOPIC_GENERAL";
    AppConstants() {
        // This utility class is not publicly instantiable
    }

    public static final String DB_NAME = "aiprog.db";

    public static final String PASS_PHRASE_FIELD = "PASS_PHRASE_FIELD.db";

    public static final String PREF_NAME = "aiprog_pref";

    public static final String GENERAL_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

    public static final String DATE_TIME_NAME_FORMAT = "yyyyMMdd_HHmmss";

    public static final String DATE_FORMAT_INTEGER = "yyyyMMdd";

    public static final String STANDARD_DATE_FORMAT = "dd MMM, yyyy";

    public static final String GENERAL_DATE_FORMAT = "yyyy/MM/dd";

    public static final int LOG_DELETE_DATE_INCREMENT = 1;

    //Default initialisation-----------

    public static final int GALLERY_ADAPTER_ITEM_SIZE = 6;

    //API result code-----------------

    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_FAILURE = 0;

    //Format-----------------------------

    public static final String GALLERY_MEDIA_STORAGE_PATH = "file://";
    public static final String IMAGE_NAME_DEFAULT = "Happly_Img_";
    public static final String JPG = "jpg";
    public static final String JPEG = "jpeg";
    public static final String PNG = "png";

    //userType-----------------------------

    public static final String USER_TYPE_VENDOR = "VENDOR";
    public static final String USER_TYPE_SSE = "SSE";

    //Extra--------------------------------

    public static final String DEFICIENCY_AFTER_SCRUTINY = "deficiencyAfterScrutiny";
    public static final String DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY = "deficiencyAfterAssessmentScrutiny";
    public static final String FRESH_CASES = "freshCases";
    public static final String CASES_REVERTED_BY_AME_VDC = "casesRevertedByAmeVdc";
    public static final String CASE_IN_PROGRASS = "caseInProgress";
    public static final String APPROVED = "approved";
    public static final String CLOSED = "closed";

}