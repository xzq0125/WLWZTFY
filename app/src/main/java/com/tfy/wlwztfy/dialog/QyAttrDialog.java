package com.tfy.wlwztfy.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.Window;
import android.widget.TextView;

import com.tfy.wlwztfy.R;

/**
 * 情缘属性对话框
 * Created by xzq on 2018/11/29.
 */

public class QyAttrDialog extends Dialog {

    private TextView tvAttr;
    private TextView tvName;

    public QyAttrDialog(@NonNull Context context) {
        super(context, R.style.FadeTransparentDialogStyle);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_qy_attr);
        getWindow().setGravity(Gravity.CENTER);
        tvAttr = findViewById(R.id.tv_qy_attr);
        tvName = findViewById(R.id.tv_name);
    }

    public void setAttr(String name, String attr) {
        tvName.setText(name);
        tvAttr.setText(attr);
    }
}
