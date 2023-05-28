package com.xuan.control;

import java.util.Scanner;

/**
 * @author :  轩辰;
 * @since 2023/04/27 22:49
 **/
public class SwitchControlDemo {
    /**
     *  switch语句格式 :
     *      switch(变量|表达式){
     *          case 值1:
     *              逻辑代码1;
     *              break;
     *          case 值2:
     *              逻辑代码2;
     *              break;
     *          case 值n:
     *              逻辑代码n;
     *              break;
     *          default:
     *              未满足时的逻辑代码;
     *              break;
     *      }
     *  执行流程 :
     *      1、拿着（）中将要匹配的值，跟case给出的选项，逐个进行匹配
     *          匹配成功，执行对应的语句体，再由break结束掉整个的switch语句
     *      2、如果给出的所有case，都匹配失败了，将会执行最后的default，由break结束掉整个的switch语句
     */
    public static void main(String[] args) {
        switchTest();
        switchTest3();
    }

    public static void switchTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 : ");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("你的输入有误");
                break;
        }
    }

    /**
     * switch 注意事项 :
     *      1、case后面的值不允许重复
     *      2、case后面的值，只能是字面量，不能是变量
     *      3、switch() 中可以接收的类型 :
     *          a、基本数据类型 : byte、short、char、int
     *          b、引用数据类型 : jdk5版本开始可以是枚举，jdk7版本开始可以是String字符串
     *      4、case穿透现象
     */
    public static void switchTest2() {
        int week = 3;
        long num = 123L;

        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("你的输入有误");
                break;
        }
    }

    /**
     * switch语句的case穿透现象
     */
    public static void switchTest3() {
        int week = 1;
        long num = 123L;

        switch (week) {
            case 1:
                System.out.println("星期一");
                //break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("你的输入有误");
                break;
        }
    }

}
