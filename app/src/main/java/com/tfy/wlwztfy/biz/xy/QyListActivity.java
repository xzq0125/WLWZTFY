package com.tfy.wlwztfy.biz.xy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;

public class QyListActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, QyListActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_qy_list;
    }

    ViewPager viewPager;

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        viewPager = findViewById(R.id.viewpager);
    }
}
