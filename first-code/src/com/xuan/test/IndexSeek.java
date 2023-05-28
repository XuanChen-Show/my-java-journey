package com.xuan.test;

import java.util.Scanner;

/**
 * <p>索引查找</p>
 *
 * @author :  轩辰;
 * @since 2023/05/21 02:12
 **/
public class IndexSeek {
    /**
     *  需求 :
     *      设计一个方法，查找元素在数组中的索引位置
     *
     *      查找元素在第一次出现的索引位置
     *
     *      已知一个数组 arr = ｛19, 28, 37, 46,50｝
     *      键盘录入一个数据，查找该数据在数组中的索引
     *      并在控制台中输出找到的索引值
     *      如果没有查找到，则输出-1
     */
    public static void main(String[] args) {
        //region 查找元素在第一次出现的索引位置
        int[] arr = {19, 28, 37, 46,50};
        int index = getIndex(arr);
        System.out.println(index);
        System.out.println("---------------------------------------------");
        //endregion
        int[] arr2 = {19, 28, 37, 46, 50, 19, 19};
        int[] allIndex = getAllIndex(arr2);
        if (allIndex.length > 0) {
            for (int i = 0; i < allIndex.length; i++) {
                System.out.print(allIndex[i] + "   ");
            }
        } else {
            System.out.println(-1);
        }
    }

    private static int[] getAllIndex(int[] arr2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数据 : ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (num == arr2[i]) {
                count++;
            }
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (num == arr2[i]) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }

    private static int getIndex(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数据 : ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
