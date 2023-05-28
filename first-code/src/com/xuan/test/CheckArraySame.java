package com.xuan.test;

/**
 * <p>判断两个数组元素是否相同</p>
 *
 * @author :  轩辰;
 * @since 2023/05/16 23:43
 **/
public class CheckArraySame {
    /**
     *  需求: 判断两个数组元素是否相同
     *
     *  = = :
     *      1、比较基本数据类型 : 比较的是数据值。
     *      2、比较引用数据类型 : 比较的是地址值。
     *
     */
    public static void main(String[] args) {
        int[] arr1= {11,22,33};
        int[] arr2= {11,22,33};
        boolean b = checkArrayContent(arr1, arr2);
        System.out.println(b);
    }

    /**
     *  需求: 判断两个数组元素是否相同
     *      定义一个方法，比较两个数组的内容是否相同
     *      要求 : 长度，内存，顺序完全相同
     *
     */
    private static boolean checkArrayContent(int[] arr1, int[] arr2) {
        // 1、比较数组的长度
        if (arr1.length != arr2.length) {
            return false;
        }
        // 2、比较数组中的元素内容
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
