package com.xuan.minterface.jdk8;

/**
 * <p> JDK8 接口新特性 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/04 16:19
 **/
public class InterfaceDemo {
    /**
     *  JDK8版本接口新特性 :
     *      1、允许定义非抽象方法，需要加入 default 关键字
     *          - 作用 : 解决接口的升级问题
     *          - 注意事项 :
     *                  1、 public 可以省略，但是 default 不能省略;
     *                  2、 默认方法，实现类是允许重写的，但是需要去掉 default 关键字;
     *                  3、 如果实现了多个接口，并且多个接口中存在相同的默认方法，实现类必须重写默认方法
     *      2、允许定义静态方法
     *          - 理解 : 既然接口已经允许方法带有方法体 了，干脆也放开静态方法，可以类名调用
     *          - 注意事项 :
     *                  1、 public 可以省略，但是 static 不能省略;
     *                  2、 接口中的静态方法，只允许接口名进行调用，不允许实现类通过对象调用
     */
    public static void main(String[] args) {
        AInterImpl a = new AInterImpl();
        a.method();

        A.function();
    }
}

interface A {
    default void method(){
        System.out.println("A...method");
    }

    public static void function(){
        System.out.println("A...method");
    }
}

interface Inter {
    void show();
    void print();

    default void method(){
        System.out.println("Inter...method");
    }
}
class AInterImpl implements Inter,A {

    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }

    @Override
    public void method() {
        A.super.method();
        Inter.super.method();
    }
}