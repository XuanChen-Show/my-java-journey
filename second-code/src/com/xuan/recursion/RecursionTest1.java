package com.xuan.recursion;

/**
 * <p> 递归示例 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 18:10
 **/
public class RecursionTest1 {
    /**
     *  需求 : 使用递归求5的阶乘
     */
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);
        int gentle = gentle(5);
        System.out.println(gentle);
    }

    /**
     *  需求 : 使用递归求5的阶乘
     */
    public static int jc(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * jc(num -1);
        }
    }

    /**
     *  需求 : 求 1~n 的和
     */
    public static int gentle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n += gentle(n-1);
        }
    }
}
