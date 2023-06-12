package com.xuan.algorithm;

import java.util.Arrays;

/**
 * <p> 选择排序 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/12 22:40
 **/
public class SelectSortDemo {
    /**
     *  选择排序 : 从0索引开始，拿着每一个索引上的元素跟后面的元素依次比较
     *      第一轮 : arr[0] - arr[1]  arr[0] - arr[2]  arr[0] - arr[3]  arr[0] - arr[4] 比较4次
     *      第二轮 : arr[1] - arr[2]  arr[1] - arr[3]  arr[1] - arr[4]  比较3次
     *      第三轮 : arr[2] - arr[3]  arr[2] - arr[4]  比较2次
     *      第四轮 : arr[3] - arr[4]  比较1次
     */
    public static void main(String[] args) {
        int[] arr = {22,55,44,33,11};

        // 外循环 : 比较的轮数
        for (int i = 0; i < arr.length-1; i++) {
            //  内循环 : 比较的次数
            //  -1 : 避免索引越界
            //  -i : 提升效率
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
