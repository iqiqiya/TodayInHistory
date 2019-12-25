package com.iakie.todayinhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.iakie.todayinhistory.base.BaseActivity;
import com.iakie.todayinhistory.base.ContentURL;
import com.iakie.todayinhistory.bean.HistoryBean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private ListView mainLv;
    private ImageButton imgBtn;
    List<HistoryBean.ResultBean> mDatas;
    private HistoryAdapter adapter;
    private Calendar calendar;
    private Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLv = findViewById(R.id.main_lv);
        imgBtn = findViewById(R.id.main_imgbtn);
        imgBtn.setOnClickListener(this);

        mDatas = new ArrayList<>();
        adapter = new HistoryAdapter(this, mDatas);
        mainLv.setAdapter(adapter);

        // 获取日历对象
        calendar = Calendar.getInstance();
        date = new Date();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        String todayHistoryURl = ContentURL.getTodayHistory("1.0", month, day);
        loadData(todayHistoryURl);
    }

    @Override
    public void onSuccess(String result) {
        mDatas.clear();
        HistoryBean historyBean = new Gson().fromJson(result, HistoryBean.class);
        List<HistoryBean.ResultBean> list = historyBean.getResult();
        for (int i = 0; i < 5; i++) {
            mDatas.add(list.get(i));
        }
        adapter.notifyDataSetChanged();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_imgbtn:

                break;
        }
    }
}
