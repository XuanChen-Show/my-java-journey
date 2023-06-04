package com.xuan.oop;

/**
 * <p> 多态 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/01 23:33
 **/
public class PolymorphicDemo {
    /**
     *  多态的前提 :
     *      有继承/实现 关系
     *      有方法重写
     *      有父类引用指向子类对象
     *
     *  1、对象多态
     *              Animal a1 = new Dog();
     *              Animal a2 = new Cat();
     *              好处 : 方法的形参定义为父类类型，这个方法就可以接收到该父类的任意子类对象
     *  2、行为多态
     *          好处 : 同一个方法，具有多种不同表现形式，或形态的能力
     *  1
     */
    public static void main(String[] args) {
//        Animal a1 = new Dog();
//        Animal a2 = new Cat();
//        useDog(new Dog());
//        useCat(new Cat());

        useAnimal(new Dog());
        useAnimal(new Cat());
    }
    public static void  useAnimal(Animal a) {
        a.eat();
    }
    /*public static void  useDog(Dog d) {
        //
    }
    public static void  useCat(Cat c) {
        //
    }*/
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}