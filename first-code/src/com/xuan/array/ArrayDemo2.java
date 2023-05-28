package com.xuan.array;

/**
 * <p>数组</p>
 *
 * @author :  轩辰;
 * @since 2023/05/15 22:54
 **/
public class ArrayDemo2 {
    /**
     *  数组
     *      动态初始化 : 初始化时只指定数组长度，由系统为数组分配初始值。
     *      格式 :   数据类型[]  数组名 = new 数据类型[长度];
     *      数组的初始化默认值 :
     *          整型  : 0
     *          浮点型(小数)  :  0.0
     *          布尔类型  : false
     *          字符型  : '\U0000'         --->    Unicode字符  ---> 常见的体现是空白字符
     *          引用数据类型(例如:字符串)  : null
     */
    public static void main(String[] args) {
        //arrayInit();
        //简单面试题1 : 方法的参数传递问题 --- 基础数据类型
        argsTest();
        //简单面试题2 : 方法的参数传递问题 --- 引用数据类型
        argsTest2();
    }

    /**
     *  方法的参数传递问题  --- 引用数据类型
     */
    private static void argsTest2() {
        int[] arr = {11,22,33,44,55,66};
        //11
        System.out.println("调用change方法前:"+ arr[0]);
        change(arr);
        //123   因为change方法的形参是数组类型,指向的一份内存地址
        System.out.println("调用change方法后:"+ arr[0]);
    }

    private static void change(int[] arr) {
        arr[0] = 123;
    }

    /**
     *  方法的参数传递问题  --- 基础数据类型
     */
    private static void argsTest() {
        int number = 100;
        //100
        System.out.println("调用change方法前:"+ number);
        change(number);
        //100   因为change方法重新赋值的number是形参的number,指向的就是另一份内存空间了，在调用完成后弹栈消失
        System.out.println("调用change方法后:"+ number);
    }

    private static void change(int number) {
        number = 200;
    }

    /**
     *  数组 动态初始化
     */
    private static void arrayInit() {
        //int
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //double
        double[] arr2 = new double[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        //boolean
        boolean[] arr3 = new boolean[3];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        //char
        char[] arr4 = new char[3];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        //String
        String[] arr5 = new String[3];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }
    }
}
