package com.xuan.type.math;

/**
 * <p> Math 类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/07 23:55
 **/
public class MathDemo {
    /**
     *  Math 类 : 包含执行基本数字运算的方法
     *  -----------------------------------------------------------------------
     *      public static int abs(int a) : 获取参数绝对值
     *      public static double ceil(double a) : 向上取整
     *      public static double floor(double a) : 向下取整
     *      public static int round(float a) : 四舍五入
     *      public static int max(int a, int b) : 获取两个 int 值中的较大值
     *      public static double pow(double a, double b) : 返回 a 的 b次幂的值
     *      public static double random() : 返回值为 double 的随机值，范围 [0.0,1.0)
     *  -----------------------------------------------------------------------
     */
    public static void main(String[] args) {
        System.out.println(Math.abs(-123));         //123
        System.out.println(Math.abs(-12.3));        //12.3

        System.out.println(Math.ceil(10.0));        //10.0
        System.out.println(Math.ceil(10.2));        //11.0
        System.out.println(Math.ceil(10.5));        //11.0
        System.out.println(Math.ceil(10.9));        //11.0

        System.out.println(Math.floor(10.0));       // 10.0
        System.out.println(Math.floor(10.2));       // 10.0
        System.out.println(Math.floor(10.5));       // 10.0
        System.out.println(Math.floor(10.9));       // 10.0

        System.out.println(Math.round(10.4));       // 10
        System.out.println(Math.round(10.6));       // 11
        System.out.println(Math.round(10.5));       // 11

        System.out.println(Math.max(12,13));        //13
        System.out.println(Math.min(12,13));        //12

        System.out.println(Math.pow(2,3));          // 8.0

        System.out.println(Math.random());

    }
}
