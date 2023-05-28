package com.xuan.datatype;

/**
 * <p>数据类型</p>
 *
 * @author : 轩辰 ；
 * @since : 2023/04/20 00:15
 **/
public class DataTypeDemo {
    public static void main(String[] args) {
        /*
         *  数据类型 :
         *      1、基本数据类型
         *          整数
         *                  byte            1个字节        -128 ~ 127
         *                  short           2个字节
         *                  int             4个字节
         *                  long            8个字节
         *          浮点数(小数)
         *                  float(单精度)    4个字节
         *                  double(双精度)   8个字节
         *          字符
         *                  char            2个字节
         *          布尔
         *                  boolean         1个字节
         *      2、引用数据类型
         *
         *      ----------------------------------------------------------------------
         *      使用思路 :
         *          1、整数类型 : 首选int，如果发现int装不下了，将类型转换成long，定义long类型变量需要加入 L 标识
         *          2、小数类型 : 首选double，非要用float类型，需要加入 F 标识
         */
        int a = 100;
        long b = 200L;
        double c = 3.14;
        float d = 3.1415F;

        char gender = '男';
        boolean flag = true;
    }
}
