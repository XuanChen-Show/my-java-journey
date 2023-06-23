package com.xuan.type.time.jdk8;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * <p> Duration 计算日期间隔 (时分秒) </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 05:40
 **/
public class DurationDemo {
    public static void main(String[] args) {
        // 此刻的日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        // 昨天的日期时间对象
        LocalDateTime yesterday = LocalDateTime.of(2023, 6, 23,
                0, 0, 0);
        System.out.println(yesterday);

        Duration duration = Duration.between(yesterday,today);  //第二个参数减去第一个参数
        System.out.println(duration.toDays());              // 两个时间差的天数
        System.out.println(duration.toHours());             // 两个时间差的小时数
        System.out.println(duration.toMinutes());           // 两个时间差的分钟数
        System.out.println(duration.toMillis());            // 两个时间差的毫秒数
        System.out.println(duration.toNanos());             // 两个时间差的纳秒数
    }
}
