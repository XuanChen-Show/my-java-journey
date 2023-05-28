package com.xuan.keywords;

/**
 * <p>this关键字</p>
 *
 * @author :  轩辰;
 * @since 2023/05/21 21:26
 **/
public class ThisDemo {
    /**
     *      现象 : 成员变量和局部变量 重名 的情况下，Java使用的是就近原则，哪个近用哪个
     *
     *          如果非要使用成员变量，可以使用this关键字进行区分
     *      ---------------------------------------------------------------------
     *      this关键字的作用:
     *          this可以调用本类成员(变量 , 方法)
     *              this.本类成员变量
     *              this.本类成员方法();
     *          this. 的省略规则 :
     *              本类成员方法 : 没有前提条件， this.可以直接省略
     *              本类成员变量 : 方法中没有出现重名的变量, this. 才可以省略
     *
     *      this介绍 : 代表当前类对象的引用(地址)
     *                  - 谁来调用我，我就代表谁
     *                  - 哪一个对象调用方法，方法中的this，代表的就是哪一个对象
     */
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "瑞贝卡";
        stu.sayHello("盖亚");
        stu.sayHello2("盖亚");

    }
}
