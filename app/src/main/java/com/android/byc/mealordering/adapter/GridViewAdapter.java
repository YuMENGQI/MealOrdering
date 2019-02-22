package com.android.byc.mealordering.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.byc.mealordering.R;

/**
 * @author yu
 * @version 1.0
 * @date 2019/2/22 14:39
 * @description
 */
public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private int[] data;
    private String[] texts;

    public GridViewAdapter(Context context,int[] data,String[] texts){

        this.context=context;
        this.data=data;
        this.texts=texts;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int arg0) {
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        return 0;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup arg2) {
        HolderView holderView=null;
        if (currentView==null) {
            holderView=new HolderView();
            currentView= LayoutInflater.from(context).inflate(R.layout.item_gridview_ele, null);
            holderView.iv_pic=(ImageView) currentView.findViewById(R.id.iv_adapter_grid_pic);
            holderView.tv_text=(TextView)currentView.findViewById(R.id.tv_adapter_grid_text);
            currentView.setTag(holderView);
        }else {
            holderView=(HolderView) currentView.getTag();
        }

        holderView.iv_pic.setImageResource(data[position]);
        holderView.tv_text.setText(texts[position]);

        return currentView;
    }


    public class HolderView {
        private ImageView iv_pic;
        private TextView tv_text;
    }

}
