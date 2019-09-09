package com.indtel.mcf.data.model.db.login;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author       : Arvindo Mondal
 * Created on   : 05-08-2019
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
@Entity(tableName = "loginTb")
public class LoginDb implements Parcelable {
    @Expose
    @PrimaryKey
    public Long _id;

    @SerializedName("VENDOR_ID")
    @Expose
    private Integer vendorId;
    @SerializedName("VENDOR_NAME")
    @Expose
    private String vendorName = "";
    @SerializedName("VENDOR_CODE")
    @Expose
    private String vendorCode = "";
    @SerializedName("ADDRESS")
    @Expose
    private String address = "";
    @SerializedName("MOBILE")
    @Expose
    private Long mobile;
    @SerializedName("EMAIL")
    @Expose
    private String email = "";
    @SerializedName("USER_ID")
    @Expose
    private String userId = "";
    @SerializedName("PASSWORD")
    @Expose
    private String password = "";

    @SerializedName("ID")
    @Expose
    private Integer Id;
    @SerializedName("USER_NAME")
    @Expose
    private String userName = "";
    @SerializedName("DESIGNATION")
    @Expose
    private String designation = "";
    @SerializedName("USER_TYPE")
    @Expose
    private String userType = "";
    @SerializedName("DIRECTORATE")
    @Expose
    private String directorate = "";

    public LoginDb(){}

    protected LoginDb(Parcel in) {
        if (in.readByte() == 0) {
            _id = null;
        } else {
            _id = in.readLong();
        }
        if (in.readByte() == 0) {
            vendorId = null;
        } else {
            vendorId = in.readInt();
        }
        vendorName = in.readString();
        address = in.readString();
        if (in.readByte() == 0) {
            mobile = null;
        } else {
            mobile = in.readLong();
        }
        email = in.readString();
        userId = in.readString();
        password = in.readString();
        if (in.readByte() == 0) {
            Id = null;
        } else {
            Id = in.readInt();
        }
        userName = in.readString();
        designation = in.readString();
        userType = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (_id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(_id);
        }
        if (vendorId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(vendorId);
        }
        dest.writeString(vendorName);
        dest.writeString(address);
        if (mobile == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(mobile);
        }
        dest.writeString(email);
        dest.writeString(userId);
        dest.writeString(password);
        if (Id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(Id);
        }
        dest.writeString(userName);
        dest.writeString(designation);
        dest.writeString(userType);
        if(directorate !=null){
            dest.writeString(directorate);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LoginDb> CREATOR = new Creator<LoginDb>() {
        @Override
        public LoginDb createFromParcel(Parcel in) {
            return new LoginDb(in);
        }

        @Override
        public LoginDb[] newArray(int size) {
            return new LoginDb[size];
        }
    };

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDirectorate() {
        return directorate;
    }

    public void setDirectorate(String directorate) {
        this.directorate = directorate;
    }
}
