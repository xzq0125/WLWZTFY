package com.tfy.wlwztfy.biz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;


public class FeedbackActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, FeedbackActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_feedback;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        initToolbar("联系我");
    }
}
