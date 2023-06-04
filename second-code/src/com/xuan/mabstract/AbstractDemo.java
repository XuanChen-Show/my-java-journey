package com.xuan.mabstract;

/**
 * <p> 抽象类 </p>
 *
 * @author : 轩辰;
 * @since 2023/05/30 00:19
 **/
public class AbstractDemo {
    /**
     *  抽象类 : 特殊的父类
     *      抽象类内部允许编写抽象方法
     *      抽象方法 : 当我们将共性的方法，抽取到父类之后，发现这个方法再父类中无法给出具体明确
     *              而且这个方法，还是子类必须存在的方法，就可以设计为抽象方法
     *              -----------------------------------------------------
     *      抽象类的注意事项 :
     *          1、抽象类不能实例化
     *              - 如果抽象类允许创建对象，就可以调用内部没有方法体的 抽象方法 了
     *          2、抽象类存在构造方法
     *              - 因为他要交给子类 ，通过super 进行访问
     *          3、抽象类中可以存在普通方法
     *              - 可以让子类继承到，并继续使用
     *          4、抽象类的子类
     *              a、要么重写抽象类中的所有抽象方法
     *              b、要么也是抽象类
     */
    public static void main(String[] args) {
        //
    }
}
abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗不挑食");
    }
}
