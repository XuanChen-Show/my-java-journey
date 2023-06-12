package com.xuan.algorithm;

/**
 * <p> 二分查找 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/12 22:58
 **/
public class BinarySearchDemo {
    /**
     *  二分查找 (折半查找) :
     *      前提 : 数组元素必须是排好序的
     *
     *      思路 :
     *          1、定义两个变量记录最小索引和最大索引
     *          2、折半的动作不止一次，应该使用循环
     *              条件 while(min<=max)
     *          3、循环中计算出中间索引
     *          4、加入判断
     *              元素如果大于中间元素 : min = mid + 1;
     *              元素如果小于中间元素 : max = mid - 1;
     *              元素如果等于中间元素 : 将索引返回 (mid)
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,100,110};
        int index = binarySearch(arr, 122);
        System.out.println("查找元素在数组中的位置 : " + index);
    }

    private static int binarySearch(int[] arr, int i) {
        // 1、定义两个变量记录最小索引和最大索引
        int min = 0;
        int max = arr.length -1;
        int mid;
        // 2、折半的动作不止一次，应该使用循环
        while (min <= max) {
            // 3、循环中计算出中间索引
            mid = (min+max) / 2;
            // 4、比对
            if ( i > arr[mid]) {
                min = mid + 1;
            } else if (i < arr[mid]) {
                max = mid - 1;
            } else {
                // 找到了，返回索引
                return mid;
            }
        }
        // 5、没找到，返回 -1
        return -1;
    }
}
