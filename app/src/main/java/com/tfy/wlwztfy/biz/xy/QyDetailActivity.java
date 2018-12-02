package com.tfy.wlwztfy.biz.xy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.bean.QyDetailBean;
import com.tfy.wlwztfy.bean.XYBean;
import com.tfy.wlwztfy.sp.CacheSPManager;
import com.tfy.wlwztfy.utils.EntitySerializer;
import com.tfy.wlwztfy.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class QyDetailActivity extends BaseActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    public static void start(Context context, String json, String title) {
        Intent starter = new Intent(context, QyDetailActivity.class);
        starter.putExtra("json", json);
        starter.putExtra("title", title);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_qy_detail;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        initToolbar("我的情缘方案");
        json = getIntent().getStringExtra("json");
        title = getIntent().getStringExtra("title");
        findViewById(R.id.btn_qy_save).setOnClickListener(this);
        tvPoint = findViewById(R.id.tv_point);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);

        try {
            detailBean = EntitySerializer.deserializerEntity(json, QyDetailBean.class);
        } catch (Exception e) {
            detailBean = null;
        }

        cacheList = CacheSPManager.getQyList(this);
        if (cacheList == null) {
            cacheList = new ArrayList<>();
        }

        boolean hasAdded = false;
        List<Integer> idList = new ArrayList<>();
        if (detailBean != null && detailBean.list != null) {
            for (XYBean xy :
                    detailBean.list) {
                idList.add(xy.id);
            }
        }

        List<Integer> cacheIdList = new ArrayList<>();
        for (QyDetailBean b :
                cacheList) {
            if (b.list != null) {
                for (XYBean bb :
                        b.list) {
                    cacheIdList.add(bb.id);
                }
                if (cacheIdList.equals(idList)) {
                    hasAdded = true;
                    break;
                }
                cacheIdList.clear();
            }
        }

        if (!hasAdded && detailBean != null && detailBean.list != null && !detailBean.list.isEmpty()) {
            cacheList.add(0, detailBean);
        }

        adapter.setData(cacheList);
        int currentIndex = findIndex();
        viewPager.setCurrentItem(currentIndex, false);
        onPageSelected(currentIndex);
    }

    private int findIndex() {
        for (int index = 0; index < cacheList.size(); index++) {
            QyDetailBean b = cacheList.get(index);
            if (TextUtils.equals(b.name, title)) {
                return index;
            }
        }
        return 0;
    }

    @Override
    public void onClick(View v) {
        if (detailBean != null && detailBean.list != null && detailBean.list.size() == 6) {
            CacheSPManager.putQyList(this, cacheList);
            ToastUtils.showToastAtCenter("保存成功");
        }
    }

    TextView tvPoint;
    ViewPager viewPager;
    QyDetailAdapter adapter = new QyDetailAdapter();
    QyDetailBean detailBean;
    String json;
    String title;
    List<QyDetailBean> cacheList;

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tvPoint.setText(String.format(Locale.getDefault(), FORMAT, position + 1, cacheList.size()));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    static final String FORMAT = "%1$s/%2$s";
}
