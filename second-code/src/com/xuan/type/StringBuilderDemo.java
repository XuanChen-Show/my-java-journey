package com.xuan.type;

/**
 * <p> StringBuilder </p>
 *
 * @author :  轩辰;
 * @since 2023/05/25 23:45
 **/
public class StringBuilderDemo {
    /**
     *  StringBuilder :
     *      介绍 :
     *          1、一个可变的字符序列
     *          2、StringBuilder是字符串缓冲区，将其理解是容器，这个容器可以存储任意数据类型，但是只要进入到这个容器，全部变成字符串
     *      StringBuilder 的作用 : 提高字符串的操作效率
     *          1、StringBuilder的特点
     *          2、StringBuilder的构造方法
     *          3、StringBuilder常用成员方法
     *          4、StringBuilder如何提升效率
     *      StringBuilder的构造方法 :
     *          public StringBuilder() : 创建一个空白的字符串缓冲区(容器),其初始容量为16个字符
     *          public StringBuilder(String str) : 创建一个字符串缓冲区(容器),容器在创建好之后,就会带有参数的内容
     *          另外两个构造方法不常用，不做介绍
     *      StringBuilder的成员方法 :
     *          1、public StringBuilder append(Object obj) : 追加 Object参数的字符串 Object形式。
     *              添加数据，并返回自己
     *          2、public StringBuilder reverse() : 导致该字符序列被序列的相反代替。
     *              将缓冲区中的内容，进行翻转
     *          3、public int length() : 返回长度（字符数）。
     *          4、public String toString() : 返回表示此顺序中的数据的字符串。
     *              将缓冲区的内容，以String字符串类型返回
     */
    public static void main(String[] args) {
        //  StringBuilder 导引
        introduce();
        // 第一个简单的StringBuilder示例
        one();
        //  StringBuilder的成员方法
        memberMethod();
    }

    /**
     *  StringBuilder的成员方法
     */
    private static void memberMethod() {
        StringBuilder strb = new StringBuilder();
        // 链式编程 : 调用的方法，返回的结果是对象，就可以继续向下调用方法
        strb.append("红色").append("黄色").append("绿色");
        System.out.println(strb);
        strb.reverse();
        System.out.println(strb);
        System.out.println(strb.length());
        // 当数据在 StringBuilder 当中，要调用的方法 StringBuilder里面没有，但是String里有
        // 将 StringBuilder 转换为String ，再进行调用
        String s = strb.toString();
        String[] s1 = s.split("色");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }

    /**
     *  第一个简单的StringBuilder示例
     */
    private static void one() {
        StringBuilder strb = new StringBuilder();
        System.out.println(strb);
        strb.append("红色");
        System.out.println(strb);
        strb.append("黄色");
        System.out.println(strb);
        strb.append("绿色");
        System.out.println(strb);
        StringBuilder strb2 = new StringBuilder("there must be echoes");
        System.out.println(strb2);
    }

    /**
     *  StringBuilder 导引
     */
    private static void introduce() {
        //  获取 1970年1月1日0时0分0秒 到 现在 所经历过的毫秒值 （ 1秒 = 1000毫秒）
        long start = System.currentTimeMillis();
        System.out.println(start);
        StringBuilder strb = new StringBuilder();
        for (int i=1; i<= 100000; i++) {
            strb.append(i);
        }
        System.out.println(strb);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
