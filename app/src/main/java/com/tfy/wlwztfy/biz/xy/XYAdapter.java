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

    public List[] getSelectedXyList() {
        List[] lists = new List[2];
        List<XYBean> selectedList = new ArrayList<>();
        List<Integer> selectedIdList = new ArrayList<>();
        List<XYBean> list = getData();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            XYBean bean = list.get(i);
            if (bean.isSelected) {
                count++;
                selectedList.add(bean);
                selectedIdList.add(bean.id);
            }
            if (count == 6) {
                break;
            }
        }
        lists[0] = selectedList;
        lists[1] = selectedIdList;
        return lists;
    }
}
