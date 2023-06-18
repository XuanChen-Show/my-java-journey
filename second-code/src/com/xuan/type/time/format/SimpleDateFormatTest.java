package com.xuan.type.time.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * <p> SimpleDateFormat 测试 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/18 23:19
 **/
public class SimpleDateFormatTest {
    /**
     *      计算你来到这个世界多少天了 :
     *          1、键盘录入用户的生日
     *          2、创建 SimpleDateFormat 对象，指定格式，用于将日期字符串解析为Date日期对象
     *          3、创建 Date 日期对象，封装此刻的时间
     *          4、计算用户 活了多少毫秒
     *          5、将毫秒值，转换为天的单位
     */
    public static void main(String[] args) throws ParseException {
        // 1、键盘录入用户的生日
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的生日 (格式为xxxx年xx月xx日) : ");
        String birthday = scanner.nextLine();
        // 2、创建 SimpleDateFormat 对象，指定格式，用于将日期字符串解析为Date日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        // 生日那一天的日期对象
        Date birthdayDate = simpleDateFormat.parse(birthday);
        // 3、创建 Date 日期对象，封装此刻的时间
        Date today = new Date();
        // 4、计算用户 活了多少毫秒
        long time = today.getTime() - birthdayDate.getTime();
        // 5、将毫秒值，转换为天的单位
        System.out.println(time/1000/60/60/24);
    }
}
