package com.xuan.exception;

/**
 * <p>空指针异常</p>
 *
 * @author :  轩辰;
 * @since 2023/05/16 21:56
 **/
public class NullPointerExceptionDemo {
    /**
     *  空指针异常 : NullPointerException
     *
     *  原因 : 当引用数据类型的变量，被赋值为null之后，就代表跟堆内存的连接被切断了
     *          这个时候如果还想去访问堆内存的数据，就会出现空指针异常
     */
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int[] arr = {11,22,33};

        arr = null;

        System.out.println(arr[0]);
    }
}
