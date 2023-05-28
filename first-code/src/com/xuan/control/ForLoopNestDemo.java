package com.xuan.control;

/**
 * <p> 循环嵌套 </p>
 *
 * @author :  轩辰;
 * @since 2023/05/11 21:48
 **/
public class ForLoopNestDemo {
    public static void main(String[] args) {
        // 打印矩形
        printRectangle();
        // 打印直角三角形
        printTriangle();
        // 打印99乘法表
        printMultiplicationTable();
        //打印金字塔
        printPyramid(9);
    }

    /**
     * 需求 : 在控制台使用打印数字金字塔
     *
     *            1         6个空格
     *           222        5个空格
     *          33333       4个空格
     *         4444444      3个空格
     *        555555555     2个空格
     *       66666666666    1个空格
     *      7777777777777
     *
     */
    private static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * 需求 : 在控制台使用打印99乘法表
     *
     */
    private static void printMultiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 需求 : 在控制台使用 * 打印5行的直角三角形
     *
     *      *
     *      **
     *      ***
     *      ****
     *      *****
     *
     */
    private static void printTriangle() {
        // 外循环，控制行数
        for (int i = 1; i <= 5; i++) {
            // 内循环，控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 外循环，控制行数
        for (int i = 5; i >= 1; i--) {
            // 内循环，控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 需求 : 在控制台使用 * 打印4行5列的矩阵
     *
     *      *****
     *      *****
     *      *****
     *      *****
     *
     *      System.out.println();       打印数据后，有换行效果;
     *      System.out.print();         打印数据后，没有换行效果;
     */
    private static void printRectangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
