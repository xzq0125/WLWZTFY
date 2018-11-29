package com.tfy.wlwztfy.biz.xy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.base.BaseRecyclerAdapter;
import com.tfy.wlwztfy.base.BaseRecyclerViewHolder;
import com.tfy.wlwztfy.bean.QyDetailBean;
import com.tfy.wlwztfy.sp.CacheSPManager;
import com.xzq.divider.Divider;

import java.util.List;

public class QyListActivity extends BaseActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, QyListActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_qy_list;
    }

    RecyclerView recyclerView;
    List<QyDetailBean> list;
    QyAdapter adapter;
    QyDetailBean currentData;

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        initToolbar("历史情缘");
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(Divider.create(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new QyAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setData(list = CacheSPManager.getQyList(this));
    }

    @Override
    protected void onAlertDialogPositiveButtonClick() {
        if (currentData != null) {
            int index = adapter.removeItem(currentData);
            if (index != -1) {
                CacheSPManager.putQyList(this, adapter.getData());
                adapter.notifyItemRemoved(index);
            }
        }
    }

    class QyViewHolder extends BaseRecyclerViewHolder<QyDetailBean> implements View.OnClickListener, View.OnLongClickListener {

        TextView tvName;

        QyViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_xyName);
            tvName.setOnClickListener(this);
            tvName.setOnLongClickListener(this);
        }

        @Override
        public void setData(QyDetailBean data) {
            data.setText(tvName, null);
        }

        @Override
        public void onClick(View v) {
            QyDetailActivity.start(v.getContext(), null, data.name);
        }

        @Override
        public boolean onLongClick(View v) {
            currentData = data;
            showDeleteAlertDialog();
            return false;
        }
    }

    class QyAdapter extends BaseRecyclerAdapter<QyDetailBean, QyViewHolder> {

        @NonNull
        @Override
        public QyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, @Nullable View itemView, int viewType) {
            return new QyViewHolder(itemView);
        }

        @Override
        protected int getItemLayoutId(int viewType) {
            return R.layout.item_xy;
        }

        @Override
        public void onConvert(@NonNull QyViewHolder holder, QyDetailBean data, int position, @NonNull List<Object> payload) {
            holder.setData(data);
        }
    }
}
