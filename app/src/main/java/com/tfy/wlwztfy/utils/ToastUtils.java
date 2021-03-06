package com.tfy.wlwztfy.utils;

import android.content.Context;
import android.support.annotation.StringRes;
import android.view.Gravity;
import android.widget.Toast;

import com.tfy.wlwztfy.App;

import static android.widget.Toast.makeText;

/**
 * Toast工具，(防止多次触发，一直弹toast)
 * Created by sean on 2016/8/8.
 */
public class ToastUtils {

    /**
     * 默认位置的toast
     */
    private static Toast mDefaultToast;

    /**
     * 顶部位置的toast
     */
    private static Toast mTopToast;

    /**
     * 中间位置的toast
     */
    private static Toast mCenterToast;

    /**
     * 在默认位置toast
     *
     * @param context Context
     * @param text    文本
     */
    public static void showToast(Context context, CharSequence text) {
        if (mDefaultToast == null) {
            mDefaultToast = makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
        } else {
            mDefaultToast.setText(text);
        }
        mDefaultToast.show();
    }

    /**
     * 在默认位置toast
     *
     * @param context Context
     * @param resId   文本资源ID
     */
    public static void showToast(Context context, @StringRes int resId) {
        if (mDefaultToast == null) {
            mDefaultToast = makeText(context.getApplicationContext(), resId, Toast.LENGTH_SHORT);
        } else {
            mDefaultToast.setText(resId);
        }
        mDefaultToast.show();
    }

    /**
     * 在屏幕顶部toast
     *
     * @param context Context
     * @param text    文本
     */
    public static void showToastAtTop(Context context, CharSequence text) {
        if (mTopToast == null) {
            mTopToast = makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
            mTopToast.setGravity(Gravity.TOP, 0, 0);
        } else {
            mTopToast.setText(text);
        }
        mTopToast.show();
    }

    /**
     * 在屏幕顶部toast
     *
     * @param context Context
     * @param resId   文本资源ID
     */
    public static void showToastAtTop(Context context, @StringRes int resId) {
        if (mTopToast == null) {
            mTopToast = makeText(context.getApplicationContext(), resId, Toast.LENGTH_SHORT);
            mTopToast.setGravity(Gravity.TOP, 0, 0);
        } else {
            mTopToast.setText(resId);
        }
        mTopToast.show();
    }

    /**
     * 在屏幕中间toast
     *
     * @param context Context
     * @param text    文本
     */
    public static void showToastAtCenter(Context context, CharSequence text) {
        if (mCenterToast == null) {
            mCenterToast = makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
            mCenterToast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mCenterToast.setText(text);
        }
        mCenterToast.show();
    }

    /**
     * 在屏幕中间toast
     *
     * @param context Context
     * @param resId   文本资源ID
     */
    public static void showToastAtCenter(Context context, @StringRes int resId) {
        if (mCenterToast == null) {
            mCenterToast = makeText(context.getApplicationContext(), resId, Toast.LENGTH_SHORT);
            mCenterToast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mCenterToast.setText(resId);
        }
        mCenterToast.show();
    }

    /**
     * 在默认位置toast
     *
     * @param text 文本
     */
    public static void showToast(CharSequence text) {
        if (mDefaultToast == null) {
            mDefaultToast = makeText(App.myApp, text, Toast.LENGTH_SHORT);
        } else {
            mDefaultToast.setText(text);
        }
        mDefaultToast.show();
    }

    /**
     * 在默认位置toast
     *
     * @param resId 文本资源ID
     */
    public static void showToast(@StringRes int resId) {
        if (mDefaultToast == null) {
            mDefaultToast = makeText(App.myApp, resId, Toast.LENGTH_SHORT);
        } else {
            mDefaultToast.setText(resId);
        }
        mDefaultToast.show();
    }

    /**
     * 在屏幕中间toast
     *
     * @param text 文本
     */
    public static void showToastAtCenter(CharSequence text) {
        if (mCenterToast == null) {
            mCenterToast = makeText(App.myApp, text, Toast.LENGTH_SHORT);
            mCenterToast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mCenterToast.setText(text);
        }
        mCenterToast.show();
    }

}
