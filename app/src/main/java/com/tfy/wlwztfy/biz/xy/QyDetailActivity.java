package com.tfy.wlwztfy.biz.xy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.bean.QyDetailBean;
import com.tfy.wlwztfy.bean.XYBean;
import com.tfy.wlwztfy.sp.CacheSPManager;
import com.tfy.wlwztfy.utils.EntitySerializer;
import com.tfy.wlwztfy.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

public class QyDetailActivity extends BaseActivity implements View.OnClickListener {

    public static void start(Activity context, String json) {
        Intent starter = new Intent(context, QyDetailActivity.class);
        starter.putExtra("json", json);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_qy_detail;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        json = getIntent().getStringExtra("json");
        findViewById(R.id.btn_qy_save).setOnClickListener(this);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

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
            }
        }

        if (!hasAdded && detailBean != null && detailBean.list != null && !detailBean.list.isEmpty()) {
            cacheList.add(0, detailBean);
        }

        adapter.setData(cacheList);
    }

    @Override
    public void onClick(View v) {
        if (detailBean != null && detailBean.list != null && !detailBean.list.isEmpty()) {
            CacheSPManager.putQyList(this, cacheList);
            ToastUtils.showToastAtCenter("保存成功");
        }
    }

    ViewPager viewPager;
    QyDetailAdapter adapter = new QyDetailAdapter();
    QyDetailBean detailBean;
    String json;
    List<QyDetailBean> cacheList;

}
