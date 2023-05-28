package com.xuan.operation;

/**
 * <p>关系运算符</p>
 *
 * @author :  轩辰;
 * @since 2023/04/23 00:17
 **/
public class OperationDemo3 {
    public static void main(String[] args) {
        /*
            关系运算符 :
                > : a>b,判断a是否大于b，成立则结果为true,不成立则结果为false
                < : a<b,判断a是否小于b，成立则结果为true,不成立则结果为false
                >= : a > = b,判断a是否大于等于b，成立则结果为true,不成立则结果为false
                <= : a < = b,判断a是否小于等于b，成立则结果为true,不成立则结果为false
                == : a = = b,判断a和b的值是否相等，成立则结果为true,不成立则结果为false
                != : a ! = b,判断a和b的值是否不相等，成立则结果为true,不成立则结果为false
        */

        System.out.println(10 > 20);
        System.out.println(10 >= 20);
        System.out.println(10 < 20);
        System.out.println(10 <= 20);
        System.out.println(10 == 20);
        System.out.println(10 != 20);
    }
}
