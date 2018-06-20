package com.tfy.wlwztfy.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.biz.FeedbackActivity;
import com.tfy.wlwztfy.biz.ViewQuestionActivity;
import com.tfy.wlwztfy.utils.ToastUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewQuestion(View view) {
        ViewQuestionActivity.start(this);
    }

    public void answerQuestion(View view) {
        ToastUtils.showToastAtCenter("敬请期待~~");
    }

    public void contactMe(View view) {
        FeedbackActivity.start(this);
    }
}
