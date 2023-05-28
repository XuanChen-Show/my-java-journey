package com.xuan.control;

import java.util.Random;
import java.util.Scanner;

/**
 * <p> Random 随机数 </p>
 *
 * @author :  轩辰;
 * @since 2023/05/11 23:44
 **/
public class RandomDemo {
    /**
     * Random 随机数
     */
    public static void main(String[] args) {
        randomTest();
        guessNumber();
        guessNumber2();
    }

    /**
     * 需求 : 实现猜数字小游戏   知道猜中为止
     */
    private static void guessNumber2() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        while (true) {
            System.out.println("请输入你猜测的数据(数字在0~99之间):");
            int myNum = sc.nextInt();
            if (myNum > num) {
                System.out.println("您猜大了!");
            } else if (myNum < num) {
                System.out.println("您猜小了!");
            } else {
                System.out.println("恭喜你猜对了！您猜的数是:" + myNum);
                break;
            }
        }
    }

    /**
     * 需求 : 实现猜数字小游戏
     */
    private static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        for (int i = 0; i<3;i++) {
            System.out.println("清输入你猜测的数据(数字在0~99之间，您有3次机会,"+ "还有"+(3-i)+"次机会):");
            int myNum = sc.nextInt();
            if (myNum == num) {
                System.out.println("恭喜你猜对了 ！");
            } else {
                System.out.println("很遗憾，您猜错啦！");
            }
        }
    }

    /**
     * random
     */
    private static void randomTest() {
        Random random = new Random();
        //  0 ~ 19 的随机数
        int num = random.nextInt(20);
        System.out.println(num);
    }
}
