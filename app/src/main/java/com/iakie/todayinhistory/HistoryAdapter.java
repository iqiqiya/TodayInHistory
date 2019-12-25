package com.iakie.todayinhistory;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.iakie.todayinhistory.bean.HistoryBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Author: iqiqiya
 * Date: 2019-12-24
 * Time: 20:27
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class HistoryAdapter extends BaseAdapter {

    Context context;
    List<HistoryBean.ResultBean> mDatas;

    public HistoryAdapter(Context context, List<HistoryBean.ResultBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_main_timeline,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        HistoryBean.ResultBean resultBean = mDatas.get(position);
        // 判断当前位置的年份与上一个位置是否相同
        if (position != 0) {
            HistoryBean.ResultBean lastBean = mDatas.get(position - 1);
            if (resultBean.getYear() == lastBean.getYear()) {
                holder.timeLayout.setVisibility(View.GONE);
            } else {
                holder.timeLayout.setVisibility(View.VISIBLE);
            }
        }

        holder.timeTv.setText(resultBean.getYear()+"-"+resultBean.getMonth()+"-"+resultBean.getDay());
        holder.titleTv.setText(resultBean.getTitle());
        String picURL = resultBean.getPic();
        if (TextUtils.isEmpty(picURL)) {
            holder.picIv.setVisibility(View.GONE);
        } else {
            holder.picIv.setVisibility(View.VISIBLE);
            Picasso.with(context).load(picURL).into(holder.picIv);
        }
        return convertView;
    }

    class ViewHolder{
        TextView timeTv,titleTv;
        ImageView picIv;
        LinearLayout timeLayout;
        public ViewHolder(View itemView) {
            timeTv = itemView.findViewById(R.id.item_main_time);
            titleTv = itemView.findViewById(R.id.item_main_title);
            picIv = itemView.findViewById(R.id.item_main_pic);
            timeLayout = itemView.findViewById(R.id.item_main_ll);
        }
    }
}
