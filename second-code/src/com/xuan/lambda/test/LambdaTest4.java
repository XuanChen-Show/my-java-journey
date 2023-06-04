package com.xuan.lambda.test;

import java.util.Random;

/**
 * @author : 轩辰;
 * @since 2023/06/04 23:27
 **/
public class LambdaTest4 {
    /**
     *  Lambda表达式 省略写法
     *      1、参数类型可以省略不写；
     *      2、如果只有一个参数，参数类型可以省略，同时 () 也可以省略
     *      3、如果 Lambda表达式 的方法体代码只有一行代码
     *          可以省略大括号不写，同时要省略分号
     *          此时，如果这行代码是 return 语句，必须省略 return 不写,  同时也必须省略 ';' 不写
     */
    public static void main(String[] args) {
        // 匿名内部类   可以使用 ALT + 回车 快捷键 直接将匿名内部类转换为最简洁的 Lambda表达式 写法
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        System.out.println("--------------------------");
        // Lambda表达式
        useCalculator((int a,int b) -> {
            return a + b;
        });
        System.out.println("-------------------------------");
        // Lambda表达式    省略写法
        useCalculator((a,b) ->
            a - b
        );
    }

    private static void useCalculator(Calculator calculator) {
        int result = calculator.calc(10,20);
        System.out.println(result);
    }
}

interface Calculator {
    int calc(int a,int b);
}
