package com.xuan.control;

/**
 * <p>do...while 循环</p>
 *
 * @author :  轩辰;
 * @since 2023/05/11 22:35
 **/
public class DoWhileLoopDemo {
    /**
     *  do...while 循环
     *  格式 :
     *      初始化语句;
     *      do {
     *          循环体语句;
     *          条件控制语句;
     *      } while (条件判断语句);
     *  执行流程 :
     *      1、执行初始化语句
     *      2、执行循环体语句
     *      3、执行条件控制语句
     *      4、执行判断条件，看其返回结果是 true还是 false
     *          true : 回到 2 继续循环
     *          false : 循环结束
     *
     */
    public static void main(String[] args) {
        doWhileTest();
    }

    private static void doWhileTest() {
        int i =1;
        do {
            System.out.println("do...while循环");
            i++;
        } while (i <= 5);
    }
}
