package com.tfy.wlwztfy.biz.xy;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseRecyclerViewHolder;
import com.tfy.wlwztfy.bean.XYBean;
import com.tfy.wlwztfy.dialog.QyAttrDialog;
import com.tfy.wlwztfy.utils.ToastUtils;

import java.util.List;

/**
 * 侠影列表ViewHolder
 * Created by Tse on 2018/11/25.
 */

public class XYViewHolder extends BaseRecyclerViewHolder<XYBean> implements View.OnClickListener, View.OnLongClickListener {

    private TextView tvName;
    private QyAttrDialog dialog;

    XYViewHolder(View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_xyName);
        tvName.setOnClickListener(this);
        tvName.setOnLongClickListener(this);
    }

    @Override
    public void setData(XYBean data) {
        tvName.setText(data.name);
        tvName.setSelected(data.isSelected);
        tvName.setTextColor(ContextCompat.getColor(tvName.getContext(), data.getLevColor()));
    }

    @Override
    public void onClick(View v) {
        if (data.isSelected) {
            data.isSelected = false;
            tvName.setSelected(false);
            return;
        }
        List<XYBean> list = XyFactory.getXyList();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isSelected) {
                count++;
            }
            if (count == 6) {
                ToastUtils.showToastAtCenter("最多同时选择6个侠影");
                return;
            }
        }
        tvName.setSelected(data.isSelected = !data.isSelected);
    }

    @Override
    public boolean onLongClick(View v) {
        if (dialog == null) {
            dialog = new QyAttrDialog(v.getContext());
        }
        dialog.setAttr(data.name, data.getQyString());
        dialog.show();
        return false;
    }
}
