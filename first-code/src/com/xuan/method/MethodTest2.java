package com.xuan.method;

/**
 * @author :  轩辰;
 * @since 2023/04/24 22:28
 **/
public class MethodTest2 {
    public static void main(String[] args) {
        System.out.println("开始");
        getMax(10,20);
        getMax(30,20);
        getMax(33,36);
        System.out.println("结束");

        System.out.println("重新开始");
        int result = getMax2(369, 639);
        System.out.println(result);
    }

    /**
     *   形参 : 全称形式参数，是指在定义方法时，所声明的参数
     *   实参 : 全称实际参数，调用方法时，所传入的参数
    */
    public static void getMax(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }

    public static int getMax2(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        return max;
    }
}
