package com.xuan.oop;

/**
 * <p>面向对象</p>
 *
 * @author :  轩辰;
 * @since 2023/05/21 20:15
 **/
public class Student {
    /**
     * Java当中想要创建对象，必须有类的存在
     *      类的组成 :
     *          属性 :  成员变量
     *          行为 :  成员方法
     */

    /**
     * 属性: 姓名 , 年龄
     */
    String name;

    int age;

    /**
     * 行为: 学习 , 吃饭
     */
    public void study() {
        System.out.println("学习......");
    }

    public void eat() {
        System.out.println("吃饭......");
    }
}
