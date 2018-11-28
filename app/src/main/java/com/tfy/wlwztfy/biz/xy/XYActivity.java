package com.tfy.wlwztfy.biz.xy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.bean.QyDetailBean;
import com.tfy.wlwztfy.utils.EntitySerializer;
import com.xzq.divider.Divider;

public class XYActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, XYActivity.class);
        context.startActivity(starter);
    }

    private XYAdapter xyAdapter = new XYAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xy);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(Divider.create(this));
        recyclerView.setAdapter(xyAdapter);
        xyAdapter.setData(XyFactory.getXyList());
    }

    public void show(View view) {
        QyDetailBean detailBean = new QyDetailBean();
        detailBean.list = xyAdapter.getSelectedXyList();
        QyDetailActivity.start(this, EntitySerializer.serializerEntity(detailBean));
    }
}
