package com.jeek.calendar.widget;

import java.util.HashMap;

/**
 * 内存保存工具类
 */
public class SaveUtils {

    private HashMap<String, Object> strInfo;
    public static volatile SaveUtils utils;

    /**
     * 单例模式获取
     *
     * @return
     */
    public static SaveUtils getInstance() {
        if (utils == null) {
            synchronized (SaveUtils.class) {
                if (utils == null) {
                    utils = new SaveUtils();
                }
            }
        }
        return utils;
    }

    private SaveUtils() {
        strInfo = new HashMap<String, Object>();
    }

    /**
     * @Description:保存 <br>
     * void
     */
    public void setValue(String key, Object o) {
        if (strInfo == null)
            utils = new SaveUtils();
        strInfo.put(key, o);
    }

    /**
     * @Description: 获取 <br/>
     * Object
     */
    public Object getValue(String key) {
        return strInfo.get(key);
    }

    /**
     * @Description: 移除 <br>
     * void
     */
    public void remove(String key) {
        strInfo.remove(key);
    }

    /**
     * @Description: 移除所有 <br>
     * void
     */
    public void removeAll() {
        strInfo.clear();
    }
}
