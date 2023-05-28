package com.xuan.test;

/**
 * <p>数组元素翻转</p>
 *
 * @author :  轩辰;
 * @since 2023/05/21 03:53
 **/
public class SwapArray {
    /**
     *  需求 : 数组元素反转
     *      已知一个数组 arr = {11, 22, 33, 44, 55}; 用程序实现把数组中的元素值交换,
     *      交换后的数组 arr = {55, 44, 33, 22, 11}; 并在控制台输出交换后的数组元素
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] ints = swapArrayElement(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        swapData();
        int[] ints1 = swapArrayElement2(arr);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + "   ");
        }
    }

    private static int[] swapArrayElement2(int[] arr) {
        int median = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            median = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = median;
        }
        return arr;
    }

    private static int[] swapArrayElement(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = arr.length; i > 0; i--) {
            result[index] = arr[i-1];
            index++;
        }
        return result;
    }

    /**
     *  需求 : 实现两个变量的数据交换，不允许定义第三方变量
     *
     *      ^  异或:
     *          特点 :
     *              1、相同为false,不同为true
     *              2、一个数字,被另一个数字异或两次,该数本身不变
     *          异或操作数值的运算过程 :
     *              1、将需要运算的数据，转换为二进制数据
     *                  0000 1010       10
     *                  0000 0101       5
     *              2、将二进制数据的0当做为false，1当做为true,运算
     *                      0000 1010
     *                    ^ 0000 0101
     *                  -------------------------
     *                      0000 1111
     *              3、将运算后的二进制数据,转换为十进制
     */
    private static void swapData() {
        int a = 10;
        int b = 20;
        // a = 10 ^ 20
        a = a ^ b;
        // b = 10 ^ 20 ^ 20;        b = 10
        b = a ^ b;
        // a = 10 ^ 20 ^ 10;        a = 20
        a = a ^ b;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
