package com.xuan.recursion;

/**
 * <p> 递归示例 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 20:27
 **/
public class RecursionTest2 {
    /**
     *  斐波那契数列
     */
    public static void main(String[] args) {
        int i = get(8);
        System.out.println(i);

        int monkey = monkey(1);
        System.out.println(monkey);
    }

    /**
     *  斐波那契数列 : 1  1  2  3  5  8  13  21  ...
     */
    public static int get(int mouth) {
        if (mouth == 1 || mouth == 2) {
            return 1;
        } else {
            return get(mouth - 2) + get(mouth - 1);
        }
    }

    /**
     *  猴子吃桃 : (后一天的桃子数量 + 1) * 2
     */
    public static int monkey(int num) {
        if (num == 10) {
            return 1;
        } else if (num < 10){
            return (monkey(num + 1) + 1) * 2;
        } else {
            return -1;
        }
    }
}
