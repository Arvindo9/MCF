package com.indtel.mcf.utils.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author       : Arvindo Mondal
 * Created on   : 17-06-2019
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
public class JObject {

    private JObject(){}

    public static String getParamsData(String... params){
        char c = 160;
        String spaceCode = String.valueOf(c);
        StringBuilder buffer = new StringBuilder();

        for(int i=0; i < params.length-1; i++){
            buffer.append(params[i]);
            buffer.append(spaceCode);
        }

        if(params.length > 0)
        buffer.append(params[params.length-1]);

        return buffer.toString();
    }

    public static String getParamsData(ArrayList<String> list){
        char c = 160;
        String spaceCode = String.valueOf(c);
        StringBuilder buffer = new StringBuilder();

        for(int i=0; i < list.size()-1; i++){
            buffer.append(list.get(i));
            buffer.append(spaceCode);
        }

        if(!list.isEmpty())
        buffer.append(list.get(list.size()-1));

        return buffer.toString();
    }

    public static JSONObject getJsonObject(HashMap<String, String> map) throws JSONException {
        JSONObject jsonObject = new JSONObject();

        if(map != null && !map.isEmpty()){
            for(Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                jsonObject.put(key, value);
            }
        }

        return jsonObject;
    }

    public static JSONArray getJsonObjectArray(List<HashMap<String, String>> mapList) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        for(HashMap<String, String> map: mapList) {
            for(Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                jsonObject.put(key, value);
            }
        }

        return jsonArray.put(jsonObject);
    }

}
