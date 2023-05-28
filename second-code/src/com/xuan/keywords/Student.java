package com.xuan.keywords;

/**
 * @author :   轩辰;
 * @since 2023/05/21 21:27
 **/
public class Student {
    String name;

    public void sayHello(String name) {
        System.out.println(name + "在say  Hello!");
    }

    public void sayHello2(String name) {
        System.out.println(this.name + "在say  Hello!");
    }
}
