package com.xuan.type.regex;

/**
 * <p> 正则表达式 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/12 23:17
 **/
public class RegexDemo {
    /**
     *  正则表达式 : 本质上来说就是一个字符串，可以指定一些规则，来校验其他字符串
     *
     *  1、字符类       [] : 单个字符
     *      [abc]               只能是 a,b,或c
     *      [^abc]              除了 a,b,c 之外的任何字符
     *      [a-zA-Z]            a到z A到Z，包括(范围)
     *      [a-d[m-p]]          a到d,或m通过p : ([a-dm-p]联合)
     *      [a-z&&[def]]        d,e,或f(交集)
     *      [a-z&&[^bc]]        a到z, 除了 b 和 c : ([ad-z]减法)
     *      [a-z&&[^m-p]]       a到z, 除了 m 到 p : ([a-lq-z]减法)
     *  ---------------------------------------------------------------------------
     *  2、字符类
     *  ---------------------------------------------------------------------------
     *  3、字符类
     */
    public static void main(String[] args) {
        String regex = "[abc]";
        System.out.println("a".matches(regex));
        System.out.println("d".matches(regex));
    }
}
