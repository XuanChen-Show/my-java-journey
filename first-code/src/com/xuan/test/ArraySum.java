package com.xuan.test;

/**
 * <p>数组元素求和</p>
 *
 * @author :  轩辰;
 * @since 2023/05/16 23:29
 **/
public class ArraySum {
    /**
     *  需求:
     *      有一个数组  元素是 {68,27,95,88,171,996,51,210}
     *      求出该数组中满足要求的元素和
     *      要求 : 求和的元素 个位和十位都不能是7，并且只能是偶数
     */
    public static void main(String[] args) {
        getEvenNumberSum();
    }

    private static void getEvenNumberSum() {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i]%10;
            int shi = arr[i]/10%10;
            if (ge != 7 && shi != 7 && arr[i]%2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("满足要求的元素和是 : "+sum);
    }
}
