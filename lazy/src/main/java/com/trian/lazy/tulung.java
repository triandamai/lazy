package com.trian.lazy;

import android.content.Context;
import android.widget.Toast;

public class tulung {
    Context context;
    public tulung(Context context){
        this.context = context;
    }
    public void gawe_toast(String pesan,boolean gawe_suwe){
        if (gawe_suwe){
            Toast.makeText(context,pesan,Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(context,pesan,Toast.LENGTH_SHORT).show();
        }
    }
}
