package com.xuan.control;

/**
 * <p>while 循环</p>
 *
 * @author :  轩辰;
 * @since 2023/05/11 22:34
 **/
public class WhileLoopDemo {
    /**
     *  while 循环
     *  格式 :
     *      初始化语句;
     *      while (循环条件) {
     *          循环体语句;
     *          条件控制语句;
     *      }
     *  执行流程 :
     *      1、执行初始化语句
     *      2、执行判断条件，看其返回结果是 true还是 false
     *          false : 循环结束
     *          true : 执行第3步
     *      3、执行循环体语句
     *      4、执行条件控制语句
     *      5、回到 2 继续
     *
     */
    public static void main(String[] args) {
        whileTest();
        //在控制台打印所有的水仙花数
        daffodilNumber();
    }

    /**
     *  需求 : 在控制台打印所有的水仙花数
     *  规则 :
     *      水仙花数 :
     *          1、水仙花数是一个三位数；
     *          2、水仙花数的个位、十位、百位的数字的立方和等于原数
     */
    private static void daffodilNumber() {
        int i = 100;
        while (i < 1000) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
            i++;
        }
    }

    private static void whileTest() {
        int i =1;
        while (i <=5) {
            System.out.println("while循环");
            i++;
        }
    }
}
