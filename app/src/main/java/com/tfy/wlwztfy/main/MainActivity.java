package com.tfy.wlwztfy.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.biz.CourseActivity;
import com.tfy.wlwztfy.biz.FeedbackActivity;
import com.tfy.wlwztfy.biz.ViewQuestionActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
