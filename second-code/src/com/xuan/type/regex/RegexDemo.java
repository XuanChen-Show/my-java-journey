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
     *      [a-z&&[def]]        只能取 d,e,或f  (交集)
     *      [a-z&&[^bc]]        a到z, 除了 b 和 c : ([ad-z]减法)
     *      [a-z&&[^m-p]]       a到z, 除了 m 到 p : ([a-lq-z]减法)
     *  ---------------------------------------------------------------------------
     *  2、预定义字符类
     *      .               任何字符
     *      \d              一个数字 : [0-9]
     *      \D              非数字 : [^0-9]
     *      \s              一个空白字符 : [\t \n \x0B \f \r]
     *      \S              非空白字符 : [^\s]
     *      \w              [a-zA-Z_0-9]  英文 、 数字 、 下划线
     *      \W              [^\w]  一个非单词字符
     *
     *      \       转义字符
     *  ---------------------------------------------------------------------------
     *  3、数量
     *      X?          X , 一次或0次
     *      X*          X , 零次或多次 (任意次数)
     *      X+          X , 一次或多次
     *      X{n}        X , 正好n次
     *      X{n, }      X , 至少n次
     *      X{n,m}      X , 至少n次但不超过m次
     */
    public static void main(String[] args) {
        String regex1 = "[abc]";
        System.out.println("a".matches(regex1));
        System.out.println("d".matches(regex1));

        String regex2 = "[^abc]";
        System.out.println("a".matches(regex2));
        System.out.println("d".matches(regex2));

        String regex3 = "[a-zA-Z0-9]";
        System.out.println("1".matches(regex3));

        String regex4 = ".";
        System.out.println("1".matches(regex4));
        System.out.println("11".matches(regex4));
        String regex5 = ".+";
        System.out.println("1".matches(regex5));
        System.out.println("11abc".matches(regex5));

        String regex6 = "\\d";
        System.out.println("11abc".matches(regex6));

        String regex7 = "\\d?";
        System.out.println("1".matches(regex7));
        System.out.println("11abc".matches(regex7));

        String regex8 = "\\d*";
        System.out.println("11".matches(regex8));
        System.out.println("11abc".matches(regex8));

        String regex9 = "\\d{3,5}";
        System.out.println("12345".matches(regex9));
        System.out.println("123456".matches(regex9));
    }
}
