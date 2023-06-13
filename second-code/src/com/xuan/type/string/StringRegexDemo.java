package com.xuan.type.string;

/**
 * <P> String 类中与正则表达式有关的常见方法 </P>
 *
 * @author : 轩辰;
 * @since 2023/06/13 23:39
 **/
public class StringRegexDemo {
    /**
     *  String 类中与正则表达式有关的常见方法 :
     *      public String replaceAll(String regex, String replacement) : 按照正则表达式匹配的内容进行替换
     */
    public static void main(String[] args) {
        String str = "发北师大版1234吉大三房不能2打女框架";

        str = str.replaceAll("\\d","");
        System.out.println(str);
    }
}
