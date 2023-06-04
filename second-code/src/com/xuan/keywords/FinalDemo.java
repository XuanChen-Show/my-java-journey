package com.xuan.keywords;

/**
 * <p>final 关键字</p>
 *
 * @author : 轩辰;
 * @since 2023/05/29 23:51
 **/
public class FinalDemo {
    /**
     *  final 关键字
     *      final : 修饰符，可用于修饰 方法、类、变量
     *      特点 :
     *          修饰方法 : 表明该方法是最终方法，不能被重写
     *          修饰类 : 表明该类是最终类，不能被继承
     *          修饰变量 : 表明该变量是常量，不能再次被赋值
     *  -----------------------------------------------------
     *          基本数据类型 : 数据值不可改变
     *          引用数据类型 : 地址值不可改变，但是内容可以改变
     */
    public static void main(String[] args) {
        final int num = 10;
        //num = 20;
        System.out.println(num);
    }
}
