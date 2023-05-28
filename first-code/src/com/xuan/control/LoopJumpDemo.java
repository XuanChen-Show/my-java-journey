package com.xuan.control;

import java.util.Scanner;

/**
 * <p> 循环跳转 </p>
 *
 * @author :  轩辰;
 * @since 2023/05/11 23:04
 **/
public class LoopJumpDemo {
    /**
     *      break : 结束循环，结束switch语句
     *          注意事项 : 只能在 循环 或者 switch语句 中进行使用
     *      continue : 跳过本次循环，继续下一次循环
     *          注意事项 : 只能在 循环 中进行使用
     *      return：结束当前方法的执行并退出，返回到调用该方法的语句处
     *      ------------------------------------------------
     *      break,continue 的共同注意事项 :
     *          两个语句下面不允许写代码，因为执行不到，属于无效代码.
     *
     *      无限循环(死循环)
     *          1、for(;;){}
     *          2、while(true){}
     *          3、do{}while(true);
     *      ------------------------------------------------------
     *      标号 : 给循环起名字，可以通过标号指定 break 退出那个循环
     *          写在循环前面  名字后面跟个 :
     */
    public static void main(String[] args) {
        login();
        //打印20以内的奇数 遇到 11 跳过
        printOdd();
        //菜单跳转
        initMenu();
        //死循环
        //alwaysLoop();
        //菜单跳转 第二版
        initMenu2();
    }

    /**
     * 需求 : 菜单跳转
     */
    private static void initMenu2() {
        Scanner sc = new Scanner(System.in);
        //    lo属于标号 : 给循环起名字，可以通过标号指定 break 退出那个循环
        lo:
        while (true) {
            System.out.println("请输入您的选择: 1、添加学生 2、删除学生 3、修改学生 4、查看学生 5、退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("开始执行添加学生逻辑...");
                    break;
                case 2 :
                    System.out.println("开始执行删除学生逻辑...");
                    break;
                case 3 :
                    System.out.println("开始执行修改学生逻辑...");
                    break;
                case 4 :
                    System.out.println("开始执行查看学生逻辑...");
                    break;
                case 5 :
                    System.out.println("感谢您的使用，期待下次再见!");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入!");
                    break;
            }
        }
    }

    /**
     * 死循环
     */
    private static void alwaysLoop() {
        /*
        for (;;) {
            System.out.println("死循环");
        }
        while (true) {
            System.out.println("死循环");
        }
        do {
            System.out.println("死循环");
        } while (true);
        */
    }

    /**
     * 需求 : 菜单跳转
     */
    private static void initMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择: 1、添加学生 2、删除学生 3、修改学生 4、查看学生 5、退出");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("开始执行添加学生逻辑...");
                break;
            case 2 :
                System.out.println("开始执行删除学生逻辑...");
                break;
            case 3 :
                System.out.println("开始执行修改学生逻辑...");
                break;
            case 4 :
                System.out.println("开始执行查看学生逻辑...");
                break;
            case 5 :
                System.out.println("感谢您的使用，期待下次再见!");
                break;
            default:
                System.out.println("您的输入有误，请重新输入!");
                break;
        }
    }

    /**
     * 需求 : 打印奇数
     */
    private static void printOdd() {
        for (int i =1; i <= 20; i++) {
            if (i == 11) {
                continue;
            }
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 需求 : 模拟用户登录，一个给三次机会
     *      假设密码是123456
     */
    private static void login() {
        Scanner sc = new Scanner(System.in);
        for (int i =1; i <=3; i++) {
            System.out.print("请输入密码 : ");
            int password = sc.nextInt();
            System.out.println();
            if (password == 123456) {
                System.out.println("登录成功 !");
                break;
            } else {
                System.out.println("密码错误,登录失败，清重新输入密码");
            }
        }
    }
}
