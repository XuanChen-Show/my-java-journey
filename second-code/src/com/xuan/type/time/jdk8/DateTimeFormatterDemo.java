package com.xuan.type.time.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p> DateTimeFormatter 日期格式化 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 01:41
 **/
public class DateTimeFormatterDemo {
    /**
     *  用于时间的格式化和解析 :
     *      1、对象的获取 :
     *          public static DateTimeFormatter ofPattern(String pattern) : 获取格式对象
     *      2、格式化 :
     *          public String format(TemporalAccessor temporal) : 按照指定方式格式化
     *      3、解析 :
     *          LocalDateTime.parse("要解析的字符串", 格式化对象);
     *          LocalDate.parse("要解析的字符串", 格式化对象);
     *          LocalTime.parse("要解析的字符串", 格式化对象);
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("格式化之前 :" + now);

        // 获取格式化对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //  格式化
        String result = formatter.format(now);
        System.out.println("格式化之后 :" + result);

        // 解析
        String time = "2020年07月07日";
        LocalDate parse = LocalDate.parse(time, formatter);
        System.out.println(parse);
    }
}
