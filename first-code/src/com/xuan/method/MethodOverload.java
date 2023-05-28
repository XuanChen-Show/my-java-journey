package com.xuan.method;

/**
 * <p>方法重载</p>
 *
 * @author :  轩辰;
 * @since 2023/04/24 23:20
 **/
public class MethodOverload {
    /**
     *   方法重载 : 一个类中定义的多个方法名相同，但参数列表不同的方法。
    */
    public static void main(String[] args) {
        method(12,36);
        method(12.3,36.9);
    }

    public static void method(int a,int b) {
        System.out.println(a+b);
    }
    public static void method(double a,double b) {
        System.out.println(a+b);
    }
}
