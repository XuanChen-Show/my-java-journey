package com.xuan.operation;

/**
 * <p>逻辑运算符</p>
 *
 * @author :  轩辰;
 * @since 2023/04/23 00:19
 **/
public class OperationDemo4 {
    public static void main(String[] args) {
        /*
            逻辑运算符 :
            1、用于连接boolean类型的表达式，或者是值
            2、整合多个条件，为一段整体的逻辑
                & : 与，并且的意思，遇false,则为false,多用于范围性的判断查找的场景
                | : 或，或者的意思，遇true,则为true,多用于多个条件任选其一的场景
                ! : 非，取反的意思
                ^ : 异或，相同为false,不同为true
                && : 逻辑与,符号左边可以得到最终结果，符号右边不再执行，否则，继续执行
                || :逻辑或,符号左边可以得到最终结果，符号右边不再执行，否则，继续执行
        */

        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}
