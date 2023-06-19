package com.xuan.type.time.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * <p> Calendar 和 Date </p>
 *
 * @author : 轩辰;
 * @since 2023/06/19 23:26
 **/
public class CalendarDemo2 {
    /**
     *  需求 : 键盘录入一个日期字符串，程序输出这个歌日期是一年中的第多少天
     *      1、使用 SimpleDateFormat，将日期字符串转换为日期对象
     *      2、将日期对象，转换为 Calendar 对象
     *      3、调用 get 方法，获取一年中的第多少天
     *  PS : public final void setTime(Date date) : 给日历设置日期对象
     *      public final Date getTime() : 获取日期对象
     */
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个日期 (格式为yyyy年MM月dd日) : ");
        String time = scanner.nextLine();
        // 1、使用 SimpleDateFormat，将日期字符串转换为日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(time);
        Calendar calendar = Calendar.getInstance();
        // 2、将日期对象，转换为 Calendar 对象
        calendar.setTime(date);
        // 3、调用 get 方法，获取一年中的第多少天
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    }
}
