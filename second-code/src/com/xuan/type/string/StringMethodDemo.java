package com.xuan.type.string;

/**
 * <p>String类常见比较方法</p>
 *
 * @author :  轩辰;
 * @since 2023/05/24 23:15
 **/
public class StringMethodDemo {
    /**
     *  String类中用于比较的方法 :
     *      public boolean equals(Object anObject)      将此字符串与指定对象进行比较。
     *
     *      public boolean equalsIgnoreCase(String anotherString)   将此 String与其他 String比较，忽略大小写。
     */
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);       //false
        System.out.println(str1.equals(str2));  //true

        System.out.println("- - - - - - - - - - - - - - - - - - ");

        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.equals(s2));              //false
        System.out.println(s1.equalsIgnoreCase(s2));    //true
    }
}
