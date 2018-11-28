package com.tfy.wlwztfy.biz.xy;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseRecyclerAdapter;
import com.tfy.wlwztfy.bean.XYBean;

import java.util.ArrayList;
import java.util.List;

/**
 * XYAdapter
 * Created by Tse on 2018/11/25.
 */

public class XYAdapter extends BaseRecyclerAdapter<XYBean, XYViewHolder> {

    @NonNull
    @Override
    public XYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, @Nullable View itemView, int viewType) {
        return new XYViewHolder(itemView);
    }

    @Override
    protected int getItemLayoutId(int viewType) {
        return R.layout.item_xy;
    }

    @Override
    public void onConvert(@NonNull XYViewHolder holder, XYBean data, int position, @NonNull List<Object> payload) {
        holder.setAdapter(this);
        holder.setData(data);
    }

    public List<XYBean> getSelectedXyList() {
        ArrayList<XYBean> selectedList = new ArrayList<>();
        List<XYBean> list = getData();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            XYBean bean = list.get(i);
            if (bean.isSelected) {
                count++;
                selectedList.add(bean);
            }
            if (count == 6) {
                break;
            }
        }
        return selectedList;
    }
}
