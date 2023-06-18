package com.xuan.type.time.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p> SimpleDateFormat 类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/18 19:08
 **/
public class SimpleDateFormatDemo {
    /**
     *  SimpleDateFormat 类
     *      用于日期格式化
     *      1、构造方法  :
     *          public SimpleDateFormat() : 创建一个日期格式化对象，使用 [默认格式]
     *          public SimpleDateFormat(String pattern) : 创建一个日期格式化对象，[手动指定格式]
     *      2、普通方法 :
     *          public final String format(Date date) : 将日期对象，转换为字符串
     *          public Date parse(String source) : 将日期字符串，解析为日期对象
     */
    public static void main(String[] args) throws ParseException {
        method();

        String today = "2023年6月18日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(today);
        System.out.println(date);
    }

    public static void method() {
        /*
        // 创建一个日期格式化对象，使用 [默认格式]
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        // 创建 Date 对象，封装此刻的时间
        Date date = new Date();
        // 将日期对象，转换为字符串
        String dateString = dateFormat.format(date);
        System.out.println(dateString);
        */

        // 创建一个日期格式化对象，[手动指定格式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String dateString = simpleDateFormat.format(date);
        System.out.println(dateString);
    }
}
