package com.jeek.calendar.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.jeek.calendar.R;
import com.jeek.calendar.widget.bean.CalendarBean;
import com.jeek.calendar.widget.calendar.OnCalendarClickListener;
import com.jeek.calendar.widget.calendar.schedule.ScheduleLayout;
import com.jeek.calendar.widget.calendar.schedule.ScheduleRecyclerView;
import com.jimmy.common.util.ToastUtils;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    private ScheduleRecyclerView mRvScheduleList;
    private ScheduleLayout mSlSchedule;

    private Context mContext;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            setData();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initData();
        loadData();// 模拟网络数据
    }

    private void loadData() {
        mHandler.postDelayed(mRunnable, 2000);
    }

    private void initData() {
        mContext = this;

    }

    Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            mHandler.obtainMessage().sendToTarget();
        }
    };

    private void setData() {
        List<CalendarBean> been = new ArrayList<>();
        // 设置数字
//        been.add(new CalendarBean(2017, 4, 22, CalendarBean.KEY_TYPE_NUMBER, 1));
//        been.add(new CalendarBean(2017, 4, 23, CalendarBean.KEY_TYPE_NUMBER, 2));
//        been.add(new CalendarBean(2017, 4, 24, CalendarBean.KEY_TYPE_NUMBER, 4));
//        been.add(new CalendarBean(2017, 4, 25, CalendarBean.KEY_TYPE_NUMBER, 5));
        // 设置√, ×
                        been.add(new CalendarBean(2017, 4, 22,CalendarBean.KEY_TYPE_TURE_OR_FALSE, CalendarBean.KEY_STATE_FALSE));
                        been.add(new CalendarBean(2017, 4, 23, CalendarBean.KEY_TYPE_TURE_OR_FALSE,CalendarBean.KEY_STATE_FALSE));
                        been.add(new CalendarBean(2017, 4, 24, CalendarBean.KEY_TYPE_TURE_OR_FALSE,CalendarBean.KEY_STATE_TRUE));
                        been.add(new CalendarBean(2017, 4, 25,CalendarBean.KEY_TYPE_TURE_OR_FALSE, CalendarBean.KEY_STATE_TRUE));
        mSlSchedule.setCalendarList(been);
    }

    private void initView() {
        mRvScheduleList = (ScheduleRecyclerView) findViewById(R.id.rvScheduleList);
        mSlSchedule = (ScheduleLayout) findViewById(R.id.slSchedule);

        mSlSchedule.setOnCalendarClickListener(new OnCalendarClickListener() {
            @Override
            public void onClickDate(int year, int month, int day) {
                ToastUtils.showLongToast(mContext, year + "-" + month + "-" + day);
            }
        });


    }
}
