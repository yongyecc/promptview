package com.fe.promptview.adapter;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by chenpengfei on 2016/10/27.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private View iv;

    public BaseViewHolder(View itemView) {
        super(itemView);
        iv = itemView;
    }

    public View findViewById(int id) {
        return iv.findViewById(id);
    }
}
