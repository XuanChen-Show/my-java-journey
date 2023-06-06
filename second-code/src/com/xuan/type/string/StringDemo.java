package com.xuan.type.string;

import java.util.Locale;

/**
 * <p>String类</p>
 *
 * @author :  轩辰;
 * @since 2023/05/23 22:19
 **/
public class StringDemo {
    /**
     *  String类的特点 :
     *      1、Java 程序中所有双引号字符串，都是String这个类的对象
     *      2、字符串不变; 它们的值在创建后不能被更改
     *      3、String对象是不可变的，但是它们可以被共享
     *              字符串常量池 : 当我们使用双引号创建字符串对象时，会检查常量池中是否存在该数据
     *                              不存在 : 创建
     *                              存在 : 复制
     *      4、
     */
    public static void main(String[] args) {
        //region 特点1
        String s1 = "abc";
        System.out.println(s1.toUpperCase(Locale.ROOT));
        //endregion

        //region 特点2，第二次赋值时，s2被赋值了一个新的地址，原地址的对象没有进行更改，只是重新开辟了一个地址空间放入新的字符串值
        String s2 = "abc";
        s2 = "asd";
        //endregion

        //region 特点3   代码中 s3 和 s4 的地址是相同的，所以比较结果是相等的，也就是这个地址被两个变量共享了
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        //endregion

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2); //  true

        System.out.println("----------------------------");

        String str3 = "abc";
        //这里 new 的形式赋值 其实是在堆内存中开辟一个空间，拷贝了一份常量池中 "abc" 的字节类型的数组的地址
        // 而 str4 保存的是开辟的那个 堆空间中的地址
        String str4 = new String("abc");
        System.out.println(str3 == str4);   //  false
        // 字符串类型底层其实是一个字节类型的数组

        System.out.println("----------------------------");

        String str5 = "abc";
        String str6 = "a"+"b"+"c";
        System.out.println(str5 == str6);   //  true
        // 因为 String 存在常量优化机制
    }
}
