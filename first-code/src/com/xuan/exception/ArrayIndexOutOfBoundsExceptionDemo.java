package com.xuan.exception;

/**
 * <p>数组下标越界异常</p>
 *
 * @author :  轩辰;
 * @since 2023/05/16 21:48
 **/
public class ArrayIndexOutOfBoundsExceptionDemo {
    /**
     *  数组下标越界异常 : ArrayIndexOutOfBoundsException
     *
     *  原因 : 访问了不存在的索引
     */
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int[] arr = {11,22,33};
        System.out.println(arr[5]);
    }
}
