package com.jeek.calendar.widget.bean;

/**
 * TODO : 日历 显示其它信息
 * Created by owen
 * on 2017-03-31.
 */

public class CalendarBean {

    public static final int KEY_TYPE_NUMBER = 101;
    public static final int KEY_TYPE_TURE_OR_FALSE = 102;

    public static final int KEY_STATE_TRUE = 1;
    public static final int KEY_STATE_NORMAL = 0;
    public static final int KEY_STATE_FALSE = -1;

    private int year, month, day;
    private int type;
    private int number;
    private int state;

    /**
     * TODO:　日历绘制bean
     *
     * @param year
     * @param month
     * @param day
     * @param type  KEY_TYPE_NUMBER:数字,
     *              KEY_TYPE_TURE_OR_FALSE:状态(显示true, false)
     * @param vlaue 值
     *              1: type==KEY_TYPE_NUMBER, vlaue是显示数字
     *              2: type==KEY_TYPE_TURE_OR_FALSE,
     *                 value: KEY_STATE_TRUE,  √
     *                        KEY_STATE_NORMAL   不显示
     *                        KEY_STATE_FALSE   ×
     */
    public CalendarBean(int year, int month, int day, int type, int vlaue) {
        this.year = year;
        this.month = month - 1;
        this.day = day;
        this.type = type;
        if (type == KEY_TYPE_NUMBER) {
            this.number = vlaue;
        } else if (type == KEY_TYPE_TURE_OR_FALSE) {
            this.state = vlaue;
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
