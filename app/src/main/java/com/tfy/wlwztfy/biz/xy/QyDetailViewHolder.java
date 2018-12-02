package com.tfy.wlwztfy.biz.xy;

import android.view.View;
import android.widget.TextView;

import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.RecyclePagerAdapter;
import com.tfy.wlwztfy.bean.QyDetailBean;

/**
 * QyDetailViewHolder
 * Created by Tse on 2018/11/28.
 */

public class QyDetailViewHolder extends RecyclePagerAdapter.PagerViewHolder<QyDetailBean> {

    TextView tvNames, tvResult, tvCount;

    QyDetailViewHolder(View itemView) {
        super(itemView);
        tvNames = itemView.findViewById(R.id.tv_names);
        tvResult = itemView.findViewById(R.id.tv_result);
        tvCount = itemView.findViewById(R.id.tv_count);
    }

    @Override
    public void setData(QyDetailBean data) {
        data.setText(tvNames, tvResult);
        tvCount.setText(data.getValue());
    }
}
