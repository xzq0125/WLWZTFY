package com.tfy.wlwztfy.biz.xy;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BasePagerAdapter;
import com.tfy.wlwztfy.bean.QyDetailBean;

/**
 * QyDetailAdapter
 * Created by Tse on 2018/11/28.
 */

public class QyDetailAdapter extends BasePagerAdapter<QyDetailBean,QyDetailViewHolder> {

    @NonNull
    @Override
    public QyDetailViewHolder onCreateViewHolder(ViewGroup parent, View itemView, int viewType) {
        return new QyDetailViewHolder(itemView);
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_qy_detail;
    }

    @Override
    public void onConvert(@NonNull QyDetailViewHolder holder,QyDetailBean data, int position) {
        holder.setData(data);
    }
}
