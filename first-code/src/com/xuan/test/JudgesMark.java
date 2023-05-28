package com.xuan.test;

import java.util.Scanner;

/**
 * <p>评委打分</p>
 *
 * @author :  轩辰;
 * @since 2023/05/21 12:28
 **/
public class JudgesMark {
    /**
     *  需求 : 评委打分
     *      在编程竞赛中，有6个评委为参赛选手打分，分数为0~100的整数分
     *      选手的最后得分为 : 去掉一个最高分和一个最低分后 的4个评委打分平均值
     *
     *      ctrl + alt + m   将一段代码提取成一个独立的方法
     */
    public static void main(String[] args) {
        //region 打分
        int[] marking = marking(6);
        //endregion
        for (int i = 0; i < marking.length; i++) {
            System.out.println(marking[i]);
        }
        //region 计算最终得分
        double finalScore = countScore(marking);
        System.out.println("这个选手最终得分是:"+ finalScore);
        //endregion
    }

    /**  代码逻辑有点复杂，还有很大优化空间*/
    private static double countScore(int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0 && arr[i] <=100) {
                max = arr[i];
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0 && arr[i] <=100){
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            } else {
                System.out.println("本次打分属于无效分数");
            }
        }
        System.out.println("最高分:"+max);
        System.out.println("最低分:"+min);
        int sum = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0 && arr[i] <=100){
                if (arr[i] != max && arr[i] != min) {
                    sum = sum + arr[i];
                    count++;
                }
            }
        }
        System.out.println("有效分数和:"+sum);
        System.out.println(count);
        if (count > 0) {
            return  sum/count;
        } else {
            return count;
        }
    }

    private static int[] marking(int i) {
        int[] arr = new int[i];
        Scanner sc = new Scanner(System.in);
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println("请第"+ (i1+1)+"个评委打分:");
            int score = sc.nextInt();
            if (score>=0 && score <=100) {
                arr[i1] = score;
            } else {
                i--;
                System.out.println("您的打分属于无效分数，请重新打分");
            }
        }
        return arr;
    }
}
