package com.xuan.test;

/**
 * <p>逢7过</p>
 *
 * @author :  轩辰;
 * @since 2023/05/16 23:12
 **/
public class KnockSeven {
    /**
     *  需求:
     *      从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时要说 "过"
     *      在控制台打印1~1000之间满足逢7过规则的数字
     */
    public static void main(String[] args) {
        knockSeven();
        knockSeven2();
    }

    private static void knockSeven() {
        for (int i = 1; i <= 1000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if (i%7 == 0 || ge == 7 || shi == 7 || bai == 7) {
                System.out.println(i);
            }
        }
    }
    private static void knockSeven2() {
        for (int i = 1; i <= 100; i++) {
            int ge = i%10;
            int shi = i/10%10;
            if (i%7 == 0 || ge == 7 || shi == 7) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
