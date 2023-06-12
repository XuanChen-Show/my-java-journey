package com.xuan.type.arrays;

import java.util.Arrays;

/**
 * <p> Arrays 数组工具类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/10 13:43
 **/
public class ArraysDemo {
    /**
     *  Arrays 数组工具类 :
     *      常用方法 :
     *          public static String toString(类型[] a) : 将数组元素拼接为带有格式的字符串
     *          public static boolean equals(类型[] a, 类型[] b) : 比较两个数组内容是否相同
     *          public static int binarySearch(int[] a, int key) : 查找元素在数组中的索引 (二分查找法 : 保证数组的元素是排好序的)
     *                                                  - 如果查找的元素，在数组中不存在 : 返回  (-(插入点) -1)
     *          public static void sort(int[] a) : 对数组进行默认升序排序
     */
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55,66};
        int[] arr2 = {11,22,33,99,55,66};

        // 将数组元素拼接为带有格式的字符串
        System.out.println(Arrays.toString(arr1));
        // 比较两个数组内容是否相同
        System.out.println(Arrays.equals(arr1, arr2));
        // 查找元素在数组中的索引
        System.out.println(Arrays.binarySearch(arr1,66));
        System.out.println(Arrays.binarySearch(arr2,99));
        // 对数组进行默认升序排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
