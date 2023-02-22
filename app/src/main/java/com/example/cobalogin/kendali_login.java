package com.example.cobalogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class kendali_login {
    private SharedPreferences sp;
    private SharedPreferences.Editor spe;
    public void setpref(Context ctx, String key , String value){
        sp= PreferenceManager.getDefaultSharedPreferences(ctx);
        spe=sp.edit();
        spe.putString(key,value);
        spe.commit();
    }
    public String getpref(Context ctx, String key){
        sp= PreferenceManager.getDefaultSharedPreferences(ctx);
        return sp.getString(key,null);
    }
    public  boolean islogin(Context ctx, String key){
        if(this.getpref(ctx,key)!=null){
            return true;
        }
        else {
            return false;
        }
    }
}
