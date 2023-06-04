package com.xuan.minterface.jdk9;

/**
 * <p> JDK8 接口新特性 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/04 16:54
 **/
public class InterfaceDemo {
    /**
     *  JDK9版本接口新特性 :
     *      接口中可以定义私有方法
     */
    public static void main(String[] args) {

    }
}

interface Inter{
    void show();
    void print();

    public default void start(){
        System.out.println("start 方法执行...");
        //System.out.println("日志记录");
        //log();
    }

    public default void end(){
        System.out.println("end 方法执行...");
        //System.out.println("日志记录");
        //log();
    }

    /**
     *  这里报错 : 原因是这个工程里我用的是 JDK8版本，但这个是 JDK9 版本的特性，换成 JDK9 版本就不报错了
     */
    /*private void log(){
        System.out.println("日志记录");
    }*/
}