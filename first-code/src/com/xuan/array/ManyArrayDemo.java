package com.xuan.array;

/**
 * <p>二维数组</p>
 *
 * @author :  轩辰;
 * @since 2023/05/16 22:13
 **/
public class ManyArrayDemo {
    /**
     *  二维数组
     *      二维数组的静态初始化:
     *          格式 : 数据类型[][]  数组名  =  new  数据类型[][]{{元素1,元素2},{元素1,元素2}};
     *          简化格式 : 数据类型[][]  数组名  =  {{元素1,元素2},{元素1,元素2}};
     *      二维数组的元素访问格式 :
     *          数组名[m索引][n索引]
     *              m索引 : 指定访问哪一个一维数组
     *              n索引 :  访问一维数组中的哪一个元素
     *      二维数组的动态初始化:
     *          格式 : 数据类型[][]  数组名  =  new  数据类型[m][n];
     *              m表示这个二维数组可以存放多少个一维数组
     *              n表示每一个一维数组可以存放多少个元素
     */
    public static void main(String[] args) {
        // 二维数组的静态初始化
        initialization();
        // 遍历打印二维数组中的元素
        printAray();
        // 遍历二维数组中的元素并求和
        getSum();
        // 二维数组的动态初始化
        initialization2();
    }

    /**
     *  二维数组的动态初始化
     */
    private static void initialization2() {
        //  这个二维数组可以存储2个一维数组，每一个一维数组中可以存放3个元素
        int[][] arr = new int[2][3];
        arr[0][0] = 36;
        arr[0][2] = 63;

        int[] arr1 = {11,22,33};
        arr[1] =arr1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    /**
     *  遍历二维数组中的元素并求和
     */
    private static void getSum() {
        int[][] arr = {
                {11,22,33},
                {33,44,55}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("和是 : "+sum);
    }

    /**
     *  遍历打印二维数组中的元素
     */
    private static void printAray() {
        int[][] arr = {
                {11,22,33},
                {33,44,55}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    /**
     *  二维数组在存储一维数组的时候，具体存储的是一维数组的地址值
     */
    private static void initialization() {
        int[][] arr = {
                {11,22,33},
                {33,44,55}
        };
        //  [[I@1b6d3586
        System.out.println(arr);
        //  [I@4554617c
        System.out.println(arr[0]);
        //  [I@74a14482
        System.out.println(arr[1]);

        System.out.println(arr[1][0]);
    }
}
