package com.tfy.wlwztfy.base;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * BaseListAdapter
 * Created by Tse on 2017/10/8.
 */

@SuppressWarnings("unchecked")
public abstract class BaseListAdapter<T, VH extends BaseListViewHolder>
        extends RecyclerView.Adapter<VH> {

    protected List<T> data = new ArrayList<>();
    private LayoutInflater inflater = null;

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        if (inflater == null)
            inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(getItemLayoutId(), parent, false);
        return onCreateViewHolder(itemView);
    }

    public abstract VH onCreateViewHolder(View itemView);

    protected abstract int getItemLayoutId();

    public abstract void onConvert(VH holder, int position, List<Object> payload);

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.bindData(getDataAt(position));
        onConvert(holder, position, null);
    }

    @Override
    public void onBindViewHolder(VH holder, int position, List<Object> payloads) {
        holder.bindData(getDataAt(position));
        onConvert(holder, position, payloads);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public List<T> getData() {
        return data;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public T getDataAt(int index) {
        if (!checkIndex(index))
            return null;
        return data.get(index);
    }

    public T getLastItem() {
        return data.get(data.size() - 1);
    }

    public boolean checkIndex(int index) {
        return index >= 0 && index < data.size();
    }

    public int indexOf(T item) {
        return data.indexOf(item);
    }

    public boolean removeItem(T item) {
        return data.remove(item);
    }

    public T removeItem(int index) {
        if (checkIndex(index))
            return data.remove(index);
        return null;
    }

    public void setData(List<T> data) {
        if (data != null) {
            this.data.clear();
            this.data.addAll(data);
            notifyDataSetChanged();
        }
    }

    public void addData(List<T> data) {
        if (data != null) {
            int position = getItemCount() - 1;
            if (this.data.addAll(data)) {
                notifyItemRangeInserted(position, data.size());
            }
        }
    }

    public void addData(List<T> data, final int headerCount) {
        if (data != null) {
            int position = getItemCount() - 1 + headerCount;
            if (this.data.addAll(data)) {
                notifyItemRangeInserted(position, data.size());
            }
        }
    }

    public void clear() {
        this.data.clear();
        notifyDataSetChanged();
    }
}
