package com.xuan.type.pack.integer;

/**
 * <p> 包装类 - Integer </p>
 *
 * @author : 轩辰;
 * @since 2023/06/08 23:20
 **/
public class IntegerDemo {
    /**
     *  包装类 : 将基本数据类型，包装成类，变成引用数据类型
     *  ------------------------------------------------------------------------------
     *  手动装箱 :  调用方法，手动将基本数据类型，包装成类
     *              1、public Integer(int value) : 通过构造方法 (已过时，不推荐)
     *              2、public static Integer valueOf(int i) : 通过静态方法
     *  手动拆箱 :  调用方法，手动将包装类，拆成(转换)基本数据类型
     *              1、public int intValue() : 以 int 类型返回该 Integer 的值
     *  ------------------------------------------------------------------------------
     *      JDK5版本开始，出现了自动拆装箱 :
     *          1、自动装箱 : 可以将基本数据类型。直接赋值给包装类的变量
     *          2、自动拆箱 : 可以将包装类的数据，直接赋值给基本数据类型变量
     *
     *      结论 : 基本数据类型，和对应的包装类，可以直接做运算了，不需要操心转换的问题了
     */
    public static void main(String[] args) {
        int num = 10;
        //Integer num1 = new Integer(10);
        Integer value = Integer.valueOf(20);
        System.out.println(value);

        int i = value.intValue();
        System.out.println(i);

        // 自动装箱、自动拆箱
        Integer a = 5;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        method();
        stringMax();
    }

    /**
     *  Integer 常用方法 :
     *      public static String toBinaryString(int i) : 转二进制
     *      public static String toOctalString(int i)  : 转八进制
     *      public static String toHexString(int i)    : 转十六进制
     *      public static int parseInt(String s)       : 将数字字符串，转换为数字；注意 - 字符串里必须是数字，不然会报错
     */
    private static void method() {
        int num = 100;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
        String s = "123";
        System.out.println(Integer.parseInt(s) + 100);
    }

    /**
     *  需求 :
     *      已知字符串 String s = "10,50,30,20,40";
     *      请将该字符串转换为整数并存入数组
     *      随后求出最大值打印在控制台
     */
    private static void stringMax() {
        String s = "10,50,30,20,40";
        // 1、根据逗号做切割
        String[] strings = s.split(",");
        //2、准备一个整数数组，准备存储转换后的数字
        int[] intArr = new int[strings.length];
        //3、遍历字符串数组
        for (int i = 0; i < strings.length; i++) {
            // strings[i] : 每个数字字符串
            // 4、将数字字符串转换为整数
            intArr[i] = Integer.parseInt(strings[i]);
        }

        //5、求最大值
        int max = intArr[0];
        for (int j : intArr) {
            if (j > max) {
                max = j;
            }
        }

        System.out.println("最大值 "+ max);
    }
}
