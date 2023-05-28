package com.xuan.oop;

/**
 * @author :  轩辰;
 * @since 2023/05/21 20:27
 **/
public class StudentTest {
    /**
     *  创建Student 类的对象进行使用
     *      1、创建对象的格式
     *          类名  对象名 = new  类型();
     *      2、使用对象的成员变量的格式
     *          对象名.成员变量;
     *      3、使用对象的成员方法的格式
     *          对象名.成员方法();
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1);
        stu1.name = "瑞贝卡";
        System.out.println(stu1.name);
        stu1.age = 25;
        System.out.println(stu1.age);
        stu1.study();
        stu1.eat();
    }
}
