package com.tfy.wlwztfy.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.biz.tfy.TFYActivity;
import com.tfy.wlwztfy.biz.xy.XYActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {

    }

    public void tfy(View view) {
        TFYActivity.start(this);
    }

    public void xy(View view) {
        XYActivity.start(this);
    }
}
