package com.xuan.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p> 异常分类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 21:27
 **/
public class ExceptionDemo2 {
    /**
     *  编译时异常 : 编译阶段就出现的错误 (语法错误不算)
     *                  - 需要在运行之前，给出解决方案
     *                  - 主要起到提醒作用
     *  运行时异常 : 编译通过，运行期间出现的异常 [可能会出现的错误]
     */
    public static void main(String[] args) {
        try {
            format();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("D:\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void format() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        // 这里的 .parse 就存在编译时异常，需要捕获或者抛出
        Date date = format.parse("2020年8月10日");
        System.out.println(date);
    }
}
