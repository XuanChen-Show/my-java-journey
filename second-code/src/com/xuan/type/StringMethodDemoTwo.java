package com.xuan.type;

/**
 * <p>String遍历</p>
 *
 * @author :  轩辰;
 * @since 2023/05/24 23:15
 **/
public class StringMethodDemoTwo {
    /**
     *  String类中用于遍历的方法 :
     *      public char[] toCharArray()      将此字符串转换为新的字符数组。
     *
     *      public char charAt(int index)   返回 char指定索引处的值。
     *
     *      public int length()             返回此字符串的长度.
     */
    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

    /**
     *  String 的 第一种遍历方式    相对第二种效率更高
     *      public char[] toCharArray()      将此字符串转换为新的字符数组。
     */
    private static void methodOne() {
        String str1 = "jkasbfgviJKASDBfdaDFBSNAIvguij";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    /**
     *  String 的 第二种遍历方式
     *      public char charAt(int index)      返回 char指定索引处的值。
     */
    private static void methodTwo() {
        String str1 = "asdSDAdfswaf";
        //char c = str1.charAt(9);
        //System.out.println(c);
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            System.out.println(c);
        }
    }
}
