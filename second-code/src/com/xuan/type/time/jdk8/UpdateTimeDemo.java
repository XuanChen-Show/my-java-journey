package com.xuan.type.time.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p> 修改年月日时分秒相关的方法 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/20 23:38
 **/
public class UpdateTimeDemo {
    /**
     *  修改年月日时分秒相关的方法
     *      LocalDate、LocalTime、LocalDateTime 都是不可变的，调用修改方法返回的是一个新的对象
     */
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();

        // 当前时间
        System.out.println(nowTime);
        // minus : 减去
        // minusYears(年)、minusMonths(月)、minusDays(日)、minusWeeks(周)、minusHours(时)、minusMinutes(分)、minusSeconds(秒)、minusNanos(纳秒)
        System.out.println("减一小时" + nowTime.minusHours(1));
        System.out.println("减一分钟" + nowTime.minusMinutes(1));
        System.out.println("减一秒钟" + nowTime.minusSeconds(1));
        System.out.println("减一纳秒" + nowTime.minusNanos(1));
        System.out.println("对比时间，确认方法返回的都是新的实力 >>>" + nowTime);
        System.out.println("------------------------");

        // plus : 加
        // plusYears(年)、plusMonths(月)、plusDays(日)、plusWeeks(周)、plusHours(时)、plusMinutes(分)、plusSeconds(秒)、plusNanos(纳秒)
        System.out.println("加一小时" + nowTime.plusHours(1));
        System.out.println("加一分钟" + nowTime.plusMinutes(1));
        System.out.println("加一秒钟" + nowTime.plusSeconds(1));
        System.out.println("加一纳秒" + nowTime.plusNanos(1));
        System.out.println("------------------------");

        // with : 这里体现出的是，设置效果
        System.out.println("修改的效果 :");
        // withYears(年)、withMonths(月)、withDayOfMonth(日)、withHour(时)、withMinute(分)、withSecond(秒)、withNano(纳秒)
        System.out.println(nowTime.withYear(2020));
        System.out.println(nowTime.withMonth(3));
        System.out.println(nowTime.withDayOfMonth(12));
        System.out.println(nowTime.withHour(20));
        System.out.println(nowTime.withMinute(30));
        System.out.println(nowTime.withSecond(33));
        System.out.println(nowTime.withNano(66));
        System.out.println("------------------------");

        LocalDate myDate = LocalDate.of(2020, 10, 6);
        LocalDate nowDate = LocalDate.now();

        // 2020-10-06 是否在 nowDate 之前 ?
        System.out.println(myDate + "是否在" + nowDate + "之前? >>>" + myDate.isBefore(nowDate));
        // 2020-10-06 是否在 nowDate 之后 ?
        System.out.println(myDate + "是否在" + nowDate + "之后? >>>" + myDate.isAfter(nowDate));
        System.out.println("----------------------");
        // 判断两个时间是否相同
        System.out.println(myDate.equals(nowDate));
    }
}
