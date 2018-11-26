package com.tfy.wlwztfy.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.biz.xy.XYActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tfy(View view) {
        TFYActivity.start(this);
    }

    public void xy(View view) {
        XYActivity.start(this);
    }
}
