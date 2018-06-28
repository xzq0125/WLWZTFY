package com.tfy.wlwztfy.base;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;


/**
 * Activity基类
 * 实现一些通用逻辑
 * Created by Wesley on 2017/12/13.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private ActivityState mState = ActivityState.CREATE;//Activity生命周期

    /**
     * Activity生命周期
     */
    private enum ActivityState {
        CREATE, START, RESTART, RESUME, PAUSE, STOP, DESTROY
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mState = ActivityState.CREATE;
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initViews(savedInstanceState);
    }

    @Override
    protected void onStart() {
        mState = ActivityState.START;
        super.onStart();
    }

    @Override
    protected void onRestart() {
        mState = ActivityState.RESTART;
        super.onRestart();
    }

    @Override
    protected void onResume() {
        mState = ActivityState.RESUME;
        super.onResume();
    }

    @Override
    protected void onPause() {
        mState = ActivityState.PAUSE;
        super.onPause();
    }

    @Override
    protected void onStop() {
        mState = ActivityState.STOP;
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mState = ActivityState.DESTROY;
        super.onDestroy();
    }

    /**
     * 获取布局ID
     *
     * @return 布局ID
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 初始化资源
     *
     * @param savedInstanceState savedInstanceState
     */
    protected abstract void initViews(@Nullable Bundle savedInstanceState);

    /**
     * 设置Toolbar 为ActionBar
     *
     * @param toolbarId Toolbar资源ID
     */
    @SuppressWarnings("all")
    public Toolbar setSupportActionBar(@IdRes final int toolbarId) {
        Toolbar toolbar = (Toolbar) findViewById(toolbarId);
        setSupportActionBar(toolbar);
        return toolbar;
    }

    /**
     * 设置Toolbar 为ActionBar
     *
     * @param toolbarId Toolbar资源ID
     */
    @SuppressWarnings("all")
    public void setSupportActionBar(Toolbar toolbar) {
        if (toolbar != null) {
            super.setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackClick();
                }
            });
            //设置ActionBar的标题和子标题不显示
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    public Toolbar initToolbar(String titleText,
                               String rightIconText) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            //标题
            TextView titleView = (TextView) toolbar.findViewById(R.id.toolbar_title);
            if (titleView != null) {
                titleView.setText(titleText);
            }
            //是否显示右文字
            View rightText = toolbar.findViewById(R.id.toolbar_right_text);
            if (rightText != null) {
                if (!TextUtils.isEmpty(rightIconText)) {
                    rightText.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            onRightIconTextClick();
                        }
                    });
                    //设置文字
                    ((TextView) rightText).setText(rightIconText);
                }
            }
            setSupportActionBar(toolbar);
        }
        return toolbar;
    }

    public Toolbar initToolbar(String title) {
        return initToolbar(title, null);
    }

    /**
     * Toolbar右边文字点击
     */
    protected void onRightIconTextClick() {

    }

    /**
     * Toolbar 返回按钮点击,若要做返回逻辑，子Activity需重写onBackPressed()
     */
    protected void onBackClick() {
        onBackPressed();
    }

    private AlertDialog doubleButtonAlertDialog;

    public void showDeleteAlertDialog() {
        showDoubleAlertDialog("确定删除吗?");
    }

    public void showDoubleAlertDialog(String msg) {
        if (doubleButtonAlertDialog == null) {
            doubleButtonAlertDialog = new AlertDialog.Builder(this)
                    .setMessage(msg)
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            onAlertDialogPositiveButtonClick();
                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            onAlertDialogNegativeButtonClick();
                        }
                    })
                    .setCancelable(true)
                    .show();
        } else {
            doubleButtonAlertDialog.setMessage(msg);
            doubleButtonAlertDialog.show();
        }
    }

    /**
     * 点击确定
     */
    protected void onAlertDialogPositiveButtonClick() {
    }

    /**
     * 点击取消
     */
    protected void onAlertDialogNegativeButtonClick() {
    }
}
