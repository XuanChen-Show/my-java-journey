package com.xuan.type.time.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * <p> Instant 时间戳 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 01:55
 **/
public class InstantDemo {
    /**
     *  Instant 类 : 用于表示时间的对象，类似之前学习的Date
     *
     *  Instant 类的常见方法 :
     *      public static Instant now() : 获取当前时间的 Instant 对象(标准时间)
     *      public static Instant ofXxxx(long epochMilli) :根据(秒/毫秒/纳秒) 获取 Instant 对象
     *      public ZonedDateTime atZone(ZoneId zone) : 指定时区
     *      public boolean isXxx(Instant otherInstant) : 判断系列的方法
     *      public Instant minusXxx(long millisToSubtract) : 减少时间系列的方法
     *      public Instant plusXxx(long millisToSubtract) : 增加时间系列的方法
     */
    public static void main(String[] args) {
        // 获取当前时间的 Instant 对象(标准时间)
        Instant now = Instant.now();
        System.out.println("当前的时间戳是 :"+ now);

        // 根据(秒/毫秒/纳秒) 获取 Instant 对象
        Instant instant1 = Instant.ofEpochMilli(1000);
        Instant instant2 = Instant.ofEpochSecond(5);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println("------------------");

        // 指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println("带时区的时间 : "+zonedDateTime);
        System.out.println("------------------");

        // 判断系列的方法
        System.out.println(now.isBefore(instant1));
        System.out.println(now.isAfter(instant1));
        System.out.println("------------------");
        // 减少时间系列的方法
        System.out.println("减 1000 毫秒:"+ now.minusMillis(1000));
        System.out.println("减 5 秒钟:"+ now.minusSeconds(5));
        System.out.println("------------------");
        // 增加时间系列的方法
        System.out.println("加 1000 毫秒:"+ now.plusMillis(1000));
        System.out.println("加 5 秒钟:"+ now.plusSeconds(5));
    }
}
