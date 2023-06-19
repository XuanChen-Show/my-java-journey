package com.xuan.type.time.jdk8;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p> JDK7 和 JDK8 的时间类型差异 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/19 23:42
 **/
public class DistinctionTest {
    public static void main(String[] args) {
        // JDK8版本之前 :
        // 都是可变对象，修改后会丢失最开始的时间信息
        Date time = new Date();
        System.out.println("修改前获取时间:"+ time);
        // 修改
        time.setTime(10000);
        System.out.println("修改后获取时间:"+ time);

        System.out.println("---------------------------------------");
        // JDK8版本之后 :
        // 都是不可变对象，修改后会返回新的时间对象，不会丢失最开始的时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("修改前获取时间:"+ now);
        LocalDateTime afterTime = now.withYear(2030);
        System.out.println("修改后获取修改后时间:"+ afterTime);
        System.out.println("修改后获取当前时间:"+ now);
    }
}
