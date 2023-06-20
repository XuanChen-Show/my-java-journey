package com.xuan.type.time.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p> JDK8 日历类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/20 22:59
 **/
public class LocalDateTimeDemo {
    /**
     *  LocalDate、LocalTime、LocalDateTime
     *      LocalDate : 代表本地日期(年、月、日、星期)
     *      LocalTime : 代表本地时间(时、分、秒、纳秒)
     *      LocalDateTime : 代表本地日期、时间(年、月、日、星期、时、分、秒、纳秒)
     *      对象的创建方式 :
     *          1、.now()    :   当前时间
     *          2、.of(...)  :   自定义时间
     *      LocalDateTime 转换 LocalDate、LocalTime :
     *          1、 .toLocalDate()
     *          2、 .toLocalTime()
     */
    public static void main(String[] args) {
        // 获取此刻的时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 转换
        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
        // 获取指定的时间对象
        LocalDateTime of = LocalDateTime.of(2020, 10, 6, 8, 8, 8);
        System.out.println(of);

        // 获取指定的时间对象
        System.out.println(now.getYear() + "年");
        System.out.println(now.getMonth() + "月");
        System.out.println(now.getMonthValue() + "月");
        System.out.println(now.getDayOfMonth() + "日");
        System.out.println(now.getHour() + "时");
        System.out.println(now.getMinute() + "分");
        System.out.println(now.getSecond() + "秒");
        System.out.println(now.getNano() + "纳秒");
    }
}
