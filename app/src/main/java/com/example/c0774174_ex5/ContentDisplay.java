package com.example.c0774174_ex5;

import android.os.Parcel;
import android.os.Parcelable;

public class ContentDisplay implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public ContentDisplay createFromParcel(Parcel in) {
            return new ContentDisplay(in);
        }

        public ContentDisplay[] newArray(int size) {
            return new ContentDisplay[size];
        }
    };


    private static String firstName;
    private static String lastName;
    private static String address;

    public static String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Constructor
    public ContentDisplay(String firstName, String lastName,String address){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public ContentDisplay(){}
    // Parcelling part
    public ContentDisplay(Parcel in){
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.address =  in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.address);
    }

    @Override
    public String toString() {
        return "Content{" +
                "First Name='" + firstName + '\'' +
                ",Last Name='" + lastName + '\'' +
                ", Address ='" + address + '\'' +
                '}';
    }
}

