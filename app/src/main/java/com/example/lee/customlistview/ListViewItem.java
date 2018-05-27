package com.example.lee.customlistview;


import android.os.Parcel;
import android.os.Parcelable;

public class ListViewItem{
    private String pubStr ;
    private String subStr ;


    public void setPub(String Pub) {
        pubStr = Pub ;
    }
    public void setSub(String Sub) {
        subStr = Sub ;
    }

    public String getPub() {
        return this.pubStr ;
    }
    public String getSub() {
        return this.subStr ;
    }
}

