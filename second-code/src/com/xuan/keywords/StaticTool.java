package com.xuan.keywords;

/**
 * <p> static 学习工具类</p>
 *
 * @author : 轩辰;
 * @since 2023/05/28 15:44
 **/
public class StaticTool {
    /**
     *  当一个类中全是静态方法的时候，常常创建一个 私有 的无参构造方法
     *  好处是 禁止使用 new 的方式调用这些方法，通过类名进行调用
     */
    private StaticTool() {
    }

    /**
     *  获取数组最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     *  获取数组最小值
     */
    public static int getMin(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j < max) {
                max = j;
            }
        }
        return max;
    }

    /**
     *  打印数组
     */
    public static void printArray(int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}
