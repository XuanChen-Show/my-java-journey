package com.xuan.type.time.jdk8;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * <p> ChronoUnit 可用于在单个时间单位内测量一段时间 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 05:48
 **/
public class ChronoUnitDemo {
    /**
     *  ChronoUnit 可用于在单个时间单位内测量一段时间,这个工具类是最全的了,可以用于比较所有的时间单位
     */
    public static void main(String[] args) {
        // 此刻的日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        // 生日时间
        LocalDateTime birthday = LocalDateTime.of(1997, 10, 6,
                0, 0, 0);
        System.out.println(birthday);

        System.out.println("相差的年数" + ChronoUnit.YEARS.between(birthday,today));
        System.out.println("相差的月数" + ChronoUnit.MONTHS.between(birthday,today));
        System.out.println("相差的周数" + ChronoUnit.WEEKS.between(birthday,today));
        System.out.println("相差的天数" + ChronoUnit.DAYS.between(birthday,today));
        System.out.println("相差的小时" + ChronoUnit.HOURS.between(birthday,today));
        System.out.println("相差的分钟" + ChronoUnit.MINUTES.between(birthday,today));
        System.out.println("相差的秒钟" + ChronoUnit.SECONDS.between(birthday,today));
        System.out.println("相差的毫秒数" + ChronoUnit.MILLIS.between(birthday,today));
        System.out.println("相差的微妙数" + ChronoUnit.MICROS.between(birthday,today));
        System.out.println("相差的纳秒数" + ChronoUnit.NANOS.between(birthday,today));
        System.out.println("相差的半天数" + ChronoUnit.HALF_DAYS.between(birthday,today));
        System.out.println("相差的十年数" + ChronoUnit.DECADES.between(birthday,today));
        System.out.println("相差的世纪(百年)数" + ChronoUnit.CENTURIES.between(birthday,today));
        System.out.println("相差的千年数" + ChronoUnit.MILLENNIA.between(birthday,today));
        System.out.println("相差的纪元数" + ChronoUnit.ERAS.between(birthday,today));
    }
}
