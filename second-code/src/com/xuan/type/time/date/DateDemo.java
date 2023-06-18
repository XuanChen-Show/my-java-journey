package com.xuan.type.time.date;

import java.util.Date;

/**
 * <p> Date 类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/18 18:55
 **/
public class DateDemo {
    /**
     *  Date 类 : 表示时间类
     *
     *      1、构造方法 :
     *          public Date() :  将当前时间，封装为 Date 日期对象
     *          public Date(long date) :    将时间毫秒值转换成 Date 日期对象
     *      2、常见方法 :
     *          public long getTime() :  返回从 1970年1月1日 00:00:00 走到此刻的总的毫秒数
     *          public void setTime(long time) : 设置日期对象的时间为当前时间毫秒值对应的时间
     */
    public static void main(String[] args) {
        // 将当前时间，封装为 Date 日期对象
        Date date1 = new Date();
        System.out.println(date1);

        // 将时间毫秒值转换成 Date 日期对象
        Date date2 = new Date(1000L);
        System.out.println(date2);

        // 返回从 1970年1月1日 00:00:00 走到此刻的总的毫秒数
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        // 已弃用的两个方法，可以用，但不推荐使用
        System.out.println(date1.getDay());
        System.out.println(date1.getHours());

        // 返回从 1970年1月1日 00:00:00 走到此刻的总的毫秒数
        Date date3 = new Date();
        date3.setTime(10000L);
        System.out.println(date3);
    }
}
