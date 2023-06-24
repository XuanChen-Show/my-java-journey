package com.xuan.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>  </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 23:10
 **/
public class ExceptionDemo4 {
    /**
     *  子类重写父类的方法时，不能抛出父类没有的异常，或者比父类更大的异常
     */
    public static void main(String[] args) {
        //
    }
}

class Fu {
    public void show() throws ParseException {
        //
    }
}

class Zi extends Fu {
    @Override
    public void show() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = format.parse("2020年8月10日");
        System.out.println(date);
    }
}
