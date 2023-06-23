package com.xuan.type.time.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * <p> ZoneId 时区类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 02:00
 **/
public class ZoneIdDemo {
    /**
     *  ZoneId类 : 时区类
     *
     *  常见方法 :
     *      1、public static Set<String> getAvailableZoneIds() : 获取Java中支持的所有时区
     *      2、public static ZoneId systemDefault() : 获取系统默认时区
     *      3、public static ZoneId of(String zoneId) : 获取一个指定时区
     */
    public static void main(String[] args) {
        // 获取Java中支持的所有时区
        Set<String> set = ZoneId.getAvailableZoneIds();
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("-------------");

        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println("------------");

        // 获取一个指定时区
        ZoneId of = ZoneId.of("Africa/Nairobi");
        System.out.println(of);

        ZonedDateTime zonedDateTime = Instant.now().atZone(of);
        System.out.println(zonedDateTime);
    }
}
