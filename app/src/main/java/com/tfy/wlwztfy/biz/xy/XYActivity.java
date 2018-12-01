package com.tfy.wlwztfy.biz.xy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.bean.QyDetailBean;
import com.tfy.wlwztfy.bean.XYBean;
import com.tfy.wlwztfy.utils.EntitySerializer;
import com.xzq.divider.Divider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class XYActivity extends BaseActivity implements TextWatcher, View.OnClickListener {

    public static void start(Context context) {
        Intent starter = new Intent(context, XYActivity.class);
        context.startActivity(starter);
    }

    private final XYAdapter xyAdapter = new XYAdapter();
    EditText edtKeyword;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_xy;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        edtKeyword = findViewById(R.id.edt_keyword);
        findViewById(R.id.btn_qy_list).setOnClickListener(this);
        edtKeyword.addTextChangedListener(this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager = new LinearLayoutManager(this));
        recyclerView.addItemDecoration(Divider.create(this));
        recyclerView.setAdapter(xyAdapter);
        List<XYBean> list = XyFactory.getXyList();
        Collections.sort(list, new Comparator<XYBean>() {
            @Override
            public int compare(XYBean o1, XYBean o2) {
                return o1.lev == o2.lev ? 0 : (o1.lev > o2.lev ? 1 : -1);
            }
        });
        xyAdapter.setData(list);
        recyclerView.post(new Runnable() {
            @Override
            public void run() {
                if (sLastFirstCompletePosition > 0) {
                    linearLayoutManager.scrollToPositionWithOffset(sLastFirstCompletePosition, sTop);
                }
            }
        });
        initToolbar("侠影列表（" + list.size() + "）");
    }

    public void show(View view) {
        QyDetailBean detailBean = new QyDetailBean();
        detailBean.list = xyAdapter.getSelectedXyList();
        String title = null;
        StringBuilder names = new StringBuilder();
        if (detailBean.list != null && !detailBean.list.isEmpty()) {
            for (int i = 0; i < detailBean.list.size(); i++) {
                XYBean xyBean = detailBean.list.get(i);
                names.append(xyBean.name).append("、");
            }
            title = names.deleteCharAt(names.length() - 1).toString();
        }
        QyDetailActivity.start(this, EntitySerializer.serializerEntity(detailBean), title);
    }

    public void reset(View view) {
        xyAdapter.reset();
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        xyAdapter.query(s.toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_qy_list:
                QyListActivity.start(this);
                break;
            default:
                break;
        }
    }

    //上次结束页面时完全可见的第一个pos
    static int sLastFirstCompletePosition = 0;
    //上次结束页面时完全可见的第一个View的getTop
    static int sTop = 0;

    @Override
    protected void onDestroy() {
        int firstCompletePos = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        sLastFirstCompletePosition = firstCompletePos;
        View view = linearLayoutManager.findViewByPosition(firstCompletePos);
        if (view != null) {
            sTop = view.getTop();
        }
        super.onDestroy();
    }
}
