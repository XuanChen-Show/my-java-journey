package com.xuan.recursion;

/**
 * <p> 递归 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 16:42
 **/
public class RecursionDemo {
    /**
     *  递归介绍 : 方法直接或者间接调用本身
     *      递归如果没有控制好种植，会出现递归死循环，导致栈内存溢出现象
     *      一些算法题的实现，都需要使用递归
     */
    public static void main(String[] args) {
        // 递归 : 直接自己调用自己
        method();
        // 递归 : 间接自己调用自己
        methodA();
        // 上面两种调用方式都会引发了StackOverflowError异常，栈内存溢出
    }

    public static void method(){
        method();
    }

    public static void methodA(){
        methodB();
    }
    public static void methodB(){
        methodC();
    }
    public static void methodC(){
        methodA();
    }
}
