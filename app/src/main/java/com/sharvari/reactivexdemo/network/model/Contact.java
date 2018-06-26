package com.sharvari.reactivexdemo.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sharvari on 22-Jun-18.
 */

public class Contact {

    String name;

    @SerializedName("image")
    String profileImage;

    String phone;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && (obj instanceof Contact)){
            return ((Contact) obj).getEmail().equalsIgnoreCase(email);
        }
        return false;
    }
}
