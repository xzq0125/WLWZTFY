package com.tfy.wlwztfy.biz.tfy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;

public class CourseActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, CourseActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_course;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        initToolbar("使用说明");
    }
}
