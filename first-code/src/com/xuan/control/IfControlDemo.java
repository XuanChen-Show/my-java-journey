package com.xuan.control;

import java.util.Scanner;

/**
 * <p>if语句</p>
 *
 * @author :  轩辰;
 * @since 2023/04/24 23:35
 **/
public class IfControlDemo {
    /**
     * 快捷键 : ctrl + alt + L  --- 格式化代码
     */
    public static void main(String[] args) {
        ifTest1(23);
        ifTest1(12);
        ifTest2(15);
        ifTest3();
        ifTest4();
    }

    /**
     * if语句的第一种格式 :
     * if(判断条件){
     * 语句体;
     * }
     * 执行流程 :
     * 1、执行判断条件，看其返回结果是true，false；
     * 2、true : 执行{}中的语句体
     * 3、false : 不执行{}中的语句体
     */
    public static void ifTest1(int age) {
        System.out.println("if单分支");

        if (age >= 18) {
            System.out.println("成年了啊！");
        }
        System.out.println("-------");
    }

    /**
     * if语句的第 2 种格式 :
     * if(判断条件){
     * 语句体1;
     * } else {
     * 语句体2;
     * }
     * 执行流程 :
     * 1、执行判断条件，看其返回结果是true，false；
     * 2、true : 执行语句体1
     * 3、false : 执行语句体2
     */
    public static void ifTest2(int age) {
        System.out.println("if else单分支");

        if (age >= 18) {
            System.out.println("成年了啊！");
        } else {
            System.out.println("未成年呢！");
        }
        System.out.println("-------");
    }

    /**
     * if语句的第 3 种格式 :
     * if(判断条件1){
     * 语句体1;
     * } else if (判断条件2) {
     * 语句体2;
     * } else if (判断条件3) {
     * 语句体3;
     * } else {
     * 语句体n;
     * }
     * 执行流程 :
     * 1、执行判断条件1，看其返回结果是true，false；
     * true : 执行语句体1,执行完毕后，结束整个if语句;
     * false : 执行第二步;
     * 2、执行判断条件2，看其返回结果是true，false；
     * true : 执行语句体2,执行完毕后，结束整个if语句;
     * false : 执行第三步;
     * ...
     * 3、如果给出的所有条件都不成立，将会执行最后的else
     */
    public static void ifTest3() {
        System.out.println("多重if");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入编号 : ");
        int num = sc.nextInt();

        if (num >= 18) {
            System.out.println("成年了啊！");
        } else if (num >= 12) {
            System.out.println("青少年啊，国家栋梁！");
        } else if (num >= 5) {
            System.out.println("该上学了，祖国的花朵！");
        } else {
            System.out.println("你好小啊，好可爱！");
        }
        System.out.println("-------");
    }

    /**
     * 嵌套if
     */
    public static void ifTest4() {
        System.out.println("if嵌套");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入考试成绩 : ");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("成绩优异，奖励自行车一辆!");
            } else if (score >= 90 && score <= 94) {
                System.out.println("成绩优秀，奖励笔记本一个!");
            } else if (score >= 60 && score <= 89) {
                System.out.println("成绩良好，再接再厉!");
            } else {
                System.out.println("成绩不合格，准备挨揍吧!");
            }
        } else {
            System.out.println("成绩输入有误");
        }
        System.out.println("-------");
    }
}
