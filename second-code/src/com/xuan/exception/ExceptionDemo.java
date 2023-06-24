package com.xuan.exception;

/**
 * <p> 异常 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 20:46
 **/
public class ExceptionDemo {
    /**
     *  异常 : 程序在编译或者执行过程中，出现的非正常的情况 (错误)
     *
     *  阅读异常信息 : 从下往上看
     *      1、找异常错误位置；
     *      2、异常名称；
     *      3、异常原因。
     */
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException : 下标越界异常
        method();
        // ArithmeticException : 算数异常
        function();
    }

    private static void function() {
        System.out.println(10/0);
    }

    private static void method() {
        int[] arr = {11,22,33};
        System.out.println(arr[9]);
    }
}
