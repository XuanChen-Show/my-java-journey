package com.xuan.oop;

/**
 * <p> 继承  员工父类</p>
 *
 * @author : 轩辰;
 * @since 2023/05/28 16:42
 **/
public class InheritEmployee {
    /**
     *  姓名
     */
    String name;
    /**
     *  年龄
     */
    int age;
    /**
     *  工资
     */
    double salary;
    /**
     *  super 测试
     */
    int num = 10;

    /**
     *  父类空参构造
     */
    public InheritEmployee() {
        System.out.println("Fu类的空参构造方法");
    }

    public void show() {
        System.out.println("Fu...... show");
    }
}
