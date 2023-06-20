package com.xuan.type.time.jdk8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p> LocalDate </p>
 *
 * @author : 轩辰;
 * @since 2023/06/20 23:31
 **/
public class LocalDateDemo {
    public static void main(String[] args) {
        // 1、获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        // 今天的日期
        System.out.println("今天的日期 : " + nowDate);
        // 年
        int year = nowDate.getYear();
        System.out.println("year : " + year);
        // 月
        int monthValue = nowDate.getMonthValue();
        System.out.println("month : "+ monthValue);
        // 日
        int dayOfMonth = nowDate.getDayOfMonth();
        System.out.println("dayOfMonth : " + dayOfMonth);
        // 当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear : "+ dayOfYear);
        // 星期
        System.out.println("星期 : " + nowDate.getDayOfWeek());
        System.out.println("星期 : " + nowDate.getDayOfWeek().getValue());
        // 月份
        System.out.println("月份 : " + nowDate.getMonth());
        System.out.println("月份 : " + nowDate.getMonth().getValue());
    }
}
