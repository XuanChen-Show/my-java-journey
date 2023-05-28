package com.xuan.method;

/**
 * <p>方法debug</p>
 *
 * @author :  轩辰;
 * @since 2023/04/24 22:09
 **/
public class MethodTest1 {
    public static void main(String[] args) {
        System.out.println("开始");
        getMax();
        System.out.println("结束");
    }
    private static void getMax(){
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
