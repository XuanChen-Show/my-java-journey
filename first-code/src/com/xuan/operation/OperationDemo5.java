package com.xuan.operation;

/**
 * <p>三元运算符</p>
 *
 * @author :  轩辰;
 * @since 2023/04/23 00:21
 **/
public class OperationDemo5 {
    public static void main(String[] args) {
        /*
            三元运算符 :
                格式 : 布尔表达式 ? 结果1 : 结果2
                解释 : 当表达式结果为真，获得结果1，当表达式结果为假，获得结果2
        */
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
