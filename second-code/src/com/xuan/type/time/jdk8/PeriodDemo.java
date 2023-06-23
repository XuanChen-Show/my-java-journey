package com.xuan.type.time.jdk8;

import java.time.LocalDate;
import java.time.Period;

/**
 * <p> Period 计算日期间隔 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 05:32
 **/
public class PeriodDemo {
    /**
     *  Period 计算日期间隔 (年月日)
     */
    public static void main(String[] args) {
        // 此刻年月日
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 昨天年月日
        LocalDate yesterday = LocalDate.of(2023, 6, 23);
        System.out.println(yesterday);

        // Period 对象表示时间的间隔对象
        Period period = Period.between(now,yesterday);  //第二个参数减去第一个参数
        System.out.println(period.getYears());          // 间隔多少年
        System.out.println(period.getMonths());         // 间隔的月份
        System.out.println(period.getDays());           // 间隔的天数
        System.out.println(period.toTotalMonths());     // 总月份
    }
}
