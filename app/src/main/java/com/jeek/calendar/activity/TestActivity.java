package com.jeek.calendar.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeek.calendar.R;
import com.jeek.calendar.widget.bean.CalendarBean;
import com.jeek.calendar.widget.calendar.OnCalendarClickListener;
import com.jeek.calendar.widget.calendar.month.MonthCalendarView;
import com.jeek.calendar.widget.calendar.schedule.ScheduleLayout;
import com.jeek.calendar.widget.calendar.schedule.ScheduleRecyclerView;
import com.jeek.calendar.widget.calendar.week.WeekCalendarView;
import com.jimmy.common.util.ToastUtils;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    private MonthCalendarView mMcvCalendar;
    private WeekCalendarView mWcvCalendar;
    private ScheduleRecyclerView mRvScheduleList;
    private ScheduleLayout mSlSchedule;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initData();
    }

    private void initData() {
        mContext = this;
    }

    private void initView() {
        mMcvCalendar = (MonthCalendarView) findViewById(R.id.mcvCalendar);
        mWcvCalendar = (WeekCalendarView) findViewById(R.id.wcvCalendar);
        mRvScheduleList = (ScheduleRecyclerView) findViewById(R.id.rvScheduleList);
        mSlSchedule = (ScheduleLayout) findViewById(R.id.slSchedule);

        mSlSchedule.setOnCalendarClickListener(new OnCalendarClickListener() {
            @Override
            public void onClickDate(int year, int month, int day) {
                ToastUtils.showLongToast(mContext, year + "-" + month + "-" + day);
                List<CalendarBean> been = new ArrayList<>();
                // 设置数字
                been.add(new CalendarBean(2017, 3, 22,CalendarBean.KEY_TYPE_NUMBER, 1));
                been.add(new CalendarBean(2017, 3, 23, CalendarBean.KEY_TYPE_NUMBER,2));
                been.add(new CalendarBean(2017, 3, 24, CalendarBean.KEY_TYPE_NUMBER,4));
                been.add(new CalendarBean(2017, 3, 25,CalendarBean.KEY_TYPE_NUMBER, 5));
                // 设置√, ×
//                been.add(new CalendarBean(2017, 3, 22,CalendarBean.KEY_TYPE_TURE_OR_FALSE, CalendarBean.KEY_STATE_FALSE));
//                been.add(new CalendarBean(2017, 3, 23, CalendarBean.KEY_TYPE_TURE_OR_FALSE,CalendarBean.KEY_STATE_FALSE));
//                been.add(new CalendarBean(2017, 3, 24, CalendarBean.KEY_TYPE_TURE_OR_FALSE,CalendarBean.KEY_STATE_TRUE));
//                been.add(new CalendarBean(2017, 3, 25,CalendarBean.KEY_TYPE_TURE_OR_FALSE, CalendarBean.KEY_STATE_TRUE));
                mSlSchedule.setCalendarList(been);
            }
        });


    }
}
