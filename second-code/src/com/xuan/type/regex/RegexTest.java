package com.xuan.type.regex;

/**
 * <p> 正则表达式测试 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/13 23:24
 **/
public class RegexTest {
    /**
     *  1、QQ号 : 全数字、5~12位
     *  2、手机号 : 必须1开头、第二位(3 4 5 6 7 8 9)、 全是数字，必须11位
     *  3、邮箱号 :
     */
    public static void main(String[] args) {
        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("12344233".matches(qqRegex));
        System.out.println("123ab233".matches(qqRegex));

        String telRegex = "[1][3-9]\\d{9}";
        System.out.println("15921562536".matches(telRegex));
        System.out.println("1592abc2536".matches(telRegex));
        System.out.println("159215636".matches(telRegex));
        System.out.println("05921562536".matches(telRegex));

        String emailRegex = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("zhangsan@163.com".matches(emailRegex));
    }
}
