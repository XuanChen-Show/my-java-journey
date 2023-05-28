package com.xuan.datatype;

/**
 * <p>类型转换</p>
 *
 * @author : 轩辰;
 * @since 2023/04/22 23:05
 **/
public class TypeConversionDemo {
    public static void main(String[] args) {
        /*
        类型转换 - 隐式转换
                介绍 : 将取值范围小的数据或变量，给取值范围大的变量赋值。可以直接赋值
                    -也就是 : 小的给大的，可以直接给
                取值范围从小到大 :
                    byte -> short -> int -> long -> float -> double
                    问题 : float占用4个字节，为什么放在了long(8个字节)的后面
                    解释 : 虽然float占用4个字节，但是【取值范围】要比8个字节的long更大
                        - 小数的二进制存储形式，更加节省内存
                注意 : byte  short char 三种数据在运算的时候，都会提升为 int ，然后再进行运算
        类型转换 - 强制转换
            介绍 : 把一个取值范围大的数值或者变量，赋值给另一个取值范围小的变量，不允许直接赋值，需要加入强制转换
            注意 :     强制转换【有可能】会出现精度损失
        */
        //隐式转换
        int a = 10;
        double b = a;
        System.out.println(a);
        //结果 : 10
        System.out.println(b);
        //结果 : 10.0

        //强制转换
        double aa = 12.3;
        int bb = (int)a;
        System.out.println(bb);

        int c = 10;
        byte d = (byte) c;
        System.out.println(d);

        int num1 = 130;
        byte num2 = (byte) num1;
        //这里的结果是 -126   原因是计算机在运算的时候是用 二进制的反码形式来运算的
        System.out.println(num2);
    }
}
