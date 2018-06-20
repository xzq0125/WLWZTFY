package com.tfy.wlwztfy.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * BaseListViewHolder
 * Created by Tse on 2017/10/8.
 */

public abstract class BaseListViewHolder<T> extends RecyclerView.ViewHolder {

    protected T data;

    public BaseListViewHolder(View itemView) {
        super(itemView);
    }

    public void bindData(T data) {
        this.data = data;
    }

    public abstract void setData(T data);

    public void setData(T data, int pos) {
    }
}
