package com.xuan.type.time.jdk8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * <p> ZonedDateTime 带时区的时间对象 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 04:58
 **/
public class ZonedDateTimeDemo {
    /**
     *  ZonedDateTime 带时区的时间对象:
     *      public static ZonedDateTime now() : 获取当前时间的 ZonedDateTime 对象
     *      public static ZonedDateTime ofXxx(...) :  获取指定时间的 ZonedDateTime 对象
     *      public ZonedDateTime withXxx(时间) : 修改时间系列的方法
     *      public ZonedDateTime minusXxx(时间) : 减少时间系列的方法
     *      public ZonedDateTime plusXxx(时间) : 增加时间系列的方法
     */
    public static void main(String[] args) {
        // 获取当前时间的 ZonedDateTime 对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println("----------------------");

        // 获取指定时间的 ZonedDateTime 对象
        ZonedDateTime of = ZonedDateTime.of(2020, 7, 7,
                8, 5, 0, 0, ZoneId.systemDefault());
        System.out.println(of);
        System.out.println("----------------------");

        // 修改时间系列的方法
        System.out.println(now.withYear(2020));
        System.out.println(now.withMonth(7));
        System.out.println(now.withDayOfMonth(7));
        System.out.println("----------------------");
        // 减少时间系列的方法
        System.out.println(now.minusYears(1));
        System.out.println(now.minusMonths(1));
        System.out.println(now.minusDays(1));
        System.out.println("----------------------");
        // 增加时间系列的方法
        System.out.println(now.plusYears(1));
        System.out.println(now.plusMonths(1));
        System.out.println(now.plusDays(1));
        System.out.println("----------------------");
    }
}
