package com.example.lee.customlistview.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class AddressPreference {
    private SharedPreferences sp;

    public AddressPreference(Context context) {
        sp = context.getSharedPreferences("address", Context.MODE_PRIVATE);
    }

    public void putIp(String ip) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("ip",ip);
        editor.apply();
    }

    public String getIP() {
        String ip = sp.getString("ip",null);
        return ip;
    }

    public void putPort(int port) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("port",port);
        editor.apply();
    }

    public int getPort() {
        int port = sp.getInt("port",0);
        return port;
    }


    public void putpub(String pub) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("pub",pub);
        editor.apply();
    }

    public String getpub() {
        String pub = sp.getString("pub", null);
        return pub;
    }

    public void putsub(String sub) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("sub",sub);
        editor.apply();
    }

    public String getsub() {
        String sub = sp.getString("sub", null);
        return sub;
    }
}