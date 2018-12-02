package com.tfy.wlwztfy.biz.xy;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseRecyclerAdapter;
import com.tfy.wlwztfy.bean.XYBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 侠影列表适配器
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
        holder.setData(data);
    }

    /**
     * 获取选中的侠影
     *
     * @return 侠影列表
     */
    List<XYBean> getSelectedXyList() {
        ArrayList<XYBean> selectedList = new ArrayList<>();
        List<XYBean> list = XyFactory.getXyList();
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

    /**
     * 重置
     */
    void reset() {
        boolean needNotify = false;
        List<XYBean> list = XyFactory.getXyList();
        for (int i = 0; i < list.size(); i++) {
            XYBean bean = list.get(i);
            if (bean.isSelected) {
                needNotify = true;
                bean.isSelected = false;
            }
        }
        if (needNotify) {
            notifyDataSetChanged();
        }
    }

    /**
     * 根据关键字查询侠影
     *
     * @param keyword 关键字
     */
    void query(String keyword) {
        if (TextUtils.isEmpty(keyword)) {
            setData(XyFactory.getXyList());
            return;
        }
        List<XYBean> result = new ArrayList<>();
        List<XYBean> list = XyFactory.getXyList();
        if (list != null) {
            for (XYBean xy :
                    list) {
                if (xy.name.contains(keyword)) {
                    result.add(xy);
                }
            }
        }
        setData(result);
    }
}
