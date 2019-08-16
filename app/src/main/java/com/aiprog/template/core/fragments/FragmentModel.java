package com.aiprog.template.core.fragments;

import android.os.Parcel;
import android.os.Parcelable;

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
public class FragmentModel implements Parcelable {
    private int _id;
    private String id;
    private String data;
    private String remark;

    public FragmentModel(int _id, String data){
        this._id = _id;
        this.data = data;
    }

    public FragmentModel(String id, String data){
        this.id = id;
        this.data = data;
    }

    public FragmentModel(String id, String data, String remark){
        this.id = id;
        this.data = data;
        this.remark = remark;
    }

    public int get_id() {
        return _id;
    }

    public String getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getRemark() {
        return remark;
    }

    protected FragmentModel(Parcel in) {
        _id = in.readInt();
        id = in.readString();
        data = in.readString();
        remark = in.readString();
    }

    public static final Creator<FragmentModel> CREATOR = new Creator<FragmentModel>() {
        @Override
        public FragmentModel createFromParcel(Parcel in) {
            return new FragmentModel(in);
        }

        @Override
        public FragmentModel[] newArray(int size) {
            return new FragmentModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(_id);
        dest.writeString(id);
        dest.writeString(data);
        dest.writeString(remark);
    }
}
