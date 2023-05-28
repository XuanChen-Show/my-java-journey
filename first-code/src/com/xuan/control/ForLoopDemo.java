package com.xuan.control;

import java.util.Scanner;

/**
 * <p>for 循环</p>
 *
 * @author :  轩辰;
 * @since 2023/05/10 22:56
 **/
public class ForLoopDemo {
    /**
     *  循环语句可以解决的问题 : 将一段代码逻辑，重复的执行很多次
     *  格式 :
     *      for (初始化语句; 条件判断语句; 条件控制语句) {
     *          循环体语句;
     *      }
     *  执行流程 :
     *      1、执行初始化语句，在整个循环过程中，只执行一次
     *      2、执行判断条件，看其返回结果是 true还是 false
     *          false : 循环结束
     *          true : 执行第3步
     *      3、执行循环体语句
     *      4、执行条件控制语句
     *      5、回到 2 继续
     *  注意事项 :
     *      1、for循环 {} 中定义的变量，在每一轮循环结束后，都会从内存中释放
     *          例如 : sumNumber() 方法中的  sum
     *      2、for循环 () 中定义的变量，在整个循环结束后，会从内存中释放
     *      3、for循环 () 和 {} 之间不要写分号
     *
     */
    public static void main(String[] args) {
        //checkPassword();
        forTest1();
        forTest2();
        printString(10);
        printNumber();
        sumNumber();
        // 生成方法返回值的快捷键 :
        //          1、方法名().var + 回车
        //          2、ctrl + alt +v
        int result = getSum();
        System.out.println(result);
        // 在控制台打印所有的水仙花数
        //  水仙花数 : 1、水仙花数是一个三位数；2、水仙花数的个位、十位、百位的数字的立方和等于原数
        daffodilNumber();
        // 在控制台打印所有的水仙花数 , 并统计水仙花数的个数
        daffodilCount();
    }

    /**
     * 使用循环语句在控制台打印我最牛逼
     */
    private static void printString(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("我最牛逼");
        }
    }

    /**
     * 使用循环模拟计时器
     * 在控制台打印 1~3 思路 : 循环中控制循环的那个变量， 可以在循环体中，继续使用
     * 在控制台打印 3~1  思路 : 循环的条件控制语句，不要局限的认为，只能是 ++
     */
    private static void printNumber() {
        for (int i = 1; i <= 3; i++) {
            // i = 1;
            // i = 2;
            // i = 3;
            System.out.println(i);
        }

        for (int i = 3; i >= 3; i--) {
            // i = 3;
            // i = 2;
            // i = 1;
            System.out.println(i);
        }
    }

    /**
     * 需求 : 求 1~ 100 之间的偶数和，并把求和结果打印在控制台
     */
    private static void sumNumber() {
        //1、定义求和变量，准备记录累加的结果
        int sum = 0;
        //2、通过 for 循环， 获取 1~ 100 之间的每一个数据
        for (int i = 1; i <= 100; i++) {
            // i : 1 ~ 100  之间的每一个数据
            //3、再循环中加入 if 判断，筛选出偶数
            if (i % 2 == 0) {
                //4、累加求和
                sum += i;
            }
        }
        //5、在循环结束后，将求和结果打印在控制台
        System.out.println(sum);
    }

    private static int getSum() {
        //1、定义求和变量，准备记录累加的结果
        int sum = 0;
        //2、通过 for 循环， 获取 1~ 100 之间的每一个数据
        for (int i = 1; i <= 100; i++) {
            // i : 1 ~ 100  之间的每一个数据
            //3、再循环中加入 if 判断，筛选出偶数
            if (i % 2 == 0) {
                //4、累加求和
                sum += i;
            }
        }
        //5、返回
        return sum;
    }

    /**
     *  需求 : 在控制台打印所有的水仙花数
     *  规则 :
     *      水仙花数 :
     *          1、水仙花数是一个三位数；
     *              2、水仙花数的个位、十位、百位的数字的立方和等于原数
     */
    private static void daffodilNumber() {
        // 1、获取所有的 3 位数
        for (int i = 100; i < 1000; i++) {
            //2、将每一个三位数拆分出个位，十位，百位  : 分别对10取余、除以10再对10取余、除以100
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //3、判断
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                //4、打印水仙花数
                System.out.println(i);
            }
        }
    }
    private static void daffodilCount() {
        //  1、定义一个计数器变量，准备统计水仙花数的个数
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                //2、找到水仙花数，让计数器+1  (查数)
                System.out.println(i);
                count++;
            }
        }
        // 3、循环结束后，打印水仙花数的个数
        System.out.println(count);
    }

    private static void forTest1() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("for循环");
        }
    }

    private static void forTest2() {
        for (int i = 1; i <= 5; i++) {
            int num = 10;
            System.out.println(num);
        }
    }

    private static void checkPassword() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入密码 :");
            int password = sc.nextInt();
            if (password == 123456) {
                System.out.println("密码正确！");
            } else {
                System.out.println("密码错误！");
            }
        }

    }
}
