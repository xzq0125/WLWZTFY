package com.tfy.wlwztfy.biz.tfy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.EditText;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.utils.ToastUtils;

public class DetailActivity extends BaseActivity {

    public static void start(Activity context, String question, String answer) {
        Intent starter = new Intent(context, DetailActivity.class);
        starter.putExtra("question", question);
        starter.putExtra("answer", answer);
        context.startActivityForResult(starter, 88);
    }

    private EditText edtQuestion, edtAnswer;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        initToolbar("新增/编辑", "保存");
        String question = getIntent().getStringExtra("question");
        String answer = getIntent().getStringExtra("answer");
        edtQuestion = findViewById(R.id.edt_question);
        edtAnswer = findViewById(R.id.edt_answer);
        edtQuestion.setText(question);
        edtAnswer.setText(answer);
    }

    @Override
    protected void onRightIconTextClick() {
        super.onRightIconTextClick();
        String question = edtQuestion.getText().toString();
        if (TextUtils.isEmpty(question)) {
            ToastUtils.showToastAtCenter("请输入题目~~");
            return;
        }
        String answer = edtAnswer.getText().toString();
        if (TextUtils.isEmpty(answer)) {
            ToastUtils.showToastAtCenter("请输入答案~~");
            return;
        }


        Intent intent = new Intent();
        intent.putExtra("question", question);
        intent.putExtra("answer", answer);
        setResult(RESULT_OK, intent);
        finish();

    }
}
