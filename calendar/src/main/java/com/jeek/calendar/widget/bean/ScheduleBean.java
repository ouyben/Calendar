package com.jeek.calendar.widget.bean;

/**
 * TODO : 日程bean类
 * Created by owen
 * on 2017-03-21.
 */

public class ScheduleBean {

    private int year;
    private int month;
    private int day;
    private int scheduleNumber;

    public ScheduleBean(int year, int month, int day, int scheduleNumber) {
        this.year = year;
        this.month = month - 1;
        this.day = day;
        this.scheduleNumber = scheduleNumber;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month - 1;
    }

    public int getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(int scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
