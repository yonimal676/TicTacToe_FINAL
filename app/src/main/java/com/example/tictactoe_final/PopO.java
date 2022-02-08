package com.example.tictactoe_final;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;


public class PopO extends Activity
{


    protected void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindowoooooooooo);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels,
                height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.6),(int) (height * 0.6) );
    }

}
