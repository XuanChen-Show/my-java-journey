package com.xuan.variable;

/**
 * <p>变量</p>
 *
 * @author : 轩辰 ；
 * @since : 2023/04/20 00:15
 **/
public class VariableDemo {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
        a = 200;
        System.out.println(a);
        int age = 27;
        System.out.println(age);
        /*
            变量的注意事项 :
                1、变量名不允许重复
                2、一条语句，可以定义出多个变量，中间需要使用逗号进行分隔
                3、变量在使用之前，必须完成赋值
                4、TODO: 变量的作用域
        */
        //1、变量名不允许重复
        int salary = 10000;
        //int salary = 12000;
        System.out.println(salary);
        //2、一条语句，可以定义出多个变量，中间需要使用逗号进行分隔
        int b = 10, c = 10, d = 30;

        //变量在使用之前，必须完成赋值
        int  num;
        //System.out.println(num);
        int number;
        number = 200;
        System.out.println(number);

    }
}
