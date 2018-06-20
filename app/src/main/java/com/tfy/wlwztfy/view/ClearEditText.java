package com.tfy.wlwztfy.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.utils.ToastUtils;


/**
 * Created by Shaomeng on 2017/12/18.
 * 带删除功能的Edittext
 */

public class ClearEditText extends android.support.v7.widget.AppCompatEditText {

    private Drawable mDeleteImage;// 删除的按钮
    private boolean showDeleteButton = false;//是否显示删除按钮

    public ClearEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public ClearEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ClearEditText(Context context) {
        this(context, null);
    }

    private void setDrawables(String text) {
        Drawable deleteImage = !TextUtils.isEmpty(text) ? mDeleteImage : null;
        showDeleteButton = !TextUtils.isEmpty(text);
        Drawable[] drawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(drawables[0], drawables[1], deleteImage, drawables[3]);//添加drawable ， position = right
    }

    private int inputType = 0;

    private void init() {
        inputType = getInputType();
        if (mDeleteImage == null) {
            mDeleteImage = getContext().getResources().getDrawable(R.drawable.ic_clear);
        }
        setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    String s = ((TextView) v).getText().toString();
                    setDrawables(s);
                } else {
                    setDrawables(null);
                }
            }
        });

        addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (hasFocus())
                    setDrawables(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = s.toString();
                //当输入方式为numberDecimal的时候限制小数点后面最多两位小数
                if (inputType == 8194 && str.contains(".")) {
                    String[] st = str.split("\\.");
                    if (st.length > 1 && st[1].length() > 2) {
                        ToastUtils.showToastAtCenter("最多两位小数");
                        String text = st[0] + "." + st[1].charAt(0) + st[1].charAt(1);
                        setText(text);
                        setSelection(text.length());
                    }
                }
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                if (showDeleteButton && !TextUtils.isEmpty(getText())) {//如果删除图片显示，并且输入框有内容
                    if (event.getX() > (getWidth() - getTotalPaddingRight()) &&
                            event.getX() < (getWidth() - getPaddingRight()))
                        //只有在这区域能触发清除内容的效果
                        getText().clear();
                }
                break;
        }
        return super.onTouchEvent(event);
    }

}
