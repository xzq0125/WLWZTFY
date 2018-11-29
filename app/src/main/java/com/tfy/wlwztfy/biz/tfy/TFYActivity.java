package com.tfy.wlwztfy.biz.tfy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.biz.FeedbackActivity;

public class TFYActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, TFYActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_tfy;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        initToolbar("同福宴");
    }

    public void viewQuestion(View view) {
        ViewQuestionActivity.start(this);
    }

    public void course(View view) {
        CourseActivity.start(this);
    }

    public void contactMe(View view) {
        FeedbackActivity.start(this);
    }
}
