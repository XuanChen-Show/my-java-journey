package com.xuan.lambda.test;

import java.util.Random;

/**
 * @author : 轩辰;
 * @since 2023/06/04 23:27
 **/
public class LambdaTest3 {
    /**
     *  Lambda表达式 省略写法
     *      1、参数类型可以省略不写；
     *      2、如果只有一个参数，参数类型可以省略，同时 () 也可以省略
     *      3、如果 Lambda表达式 的方法体代码只有一行代码
     *          可以省略大括号不写，同时要省略分号
     *          此时，如果这行代码是 return 语句，必须省略 return 不写,  同时也必须省略 ';' 不写
     */
    public static void main(String[] args) {
        // 匿名内部类        可以使用 ALT + 回车 快捷键 直接将匿名内部类转换为最简洁的 Lambda表达式 写法
        useRandomNumberHandler(new RandomNumberHandler() {
            @Override
            public int getNumber() {
                Random random = new Random();
                int num = random.nextInt(100)+1;
                return num;
            }
        });
        System.out.println("--------------------------");
        // Lambda表达式
        useRandomNumberHandler(() -> {
            return new Random().nextInt(100) + 1;
        });
        System.out.println("-------------------------------");
        // Lambda表达式    省略写法
        useRandomNumberHandler(() ->
            new Random().nextInt(100) + 1
        );
    }

    public static void useRandomNumberHandler(RandomNumberHandler randomNumberHandler) {
        int result = randomNumberHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumberHandler {
    int getNumber();
}