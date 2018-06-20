package com.tfy.wlwztfy.bean;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;


/**
 * QaADto
 * Created by Wesley on 2018/6/20.
 */
public class QaADto {

    public String question;
    public String answer;

    public String getQueryStr() {
        return question + answer;
    }

    public void setText(TextView textView) {

        String str = question + "\n答：" + answer;

        final Context context = textView.getContext();

        SpannableString ss = new SpannableString(str);
        int startIndex = str.indexOf("答：") + 2;
        int endIndex = str.length();
        ss.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.colorAccent)),
                startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ss.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                //PhoneUtils.openDial(context, phone);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                ds.setUnderlineText(false);
            }
        }, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
