package com.xuan.type.inner;

/**
 * <p> 内部类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/04 18:03
 **/
public class InnerDemo {
    /**
     *  内部类 : 在类中定义的类
     *  创建对象的格式 : 外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
     *  成员访问细节 :
     *      1、内部类中，访问外部类成员 : 直接访问，包括私有
     *      2、外部类中，访问内部类成员 : 需要创建对象访问
     */
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.num);
        oi.show();
        System.out.println("-------------------------");
        MyOuter.MyInner mm = new MyOuter().new MyInner();
        mm.show();
    }
}

class Outer {
    private void method() {
        System.out.println("method...");

        Inner i = new Inner();
        System.out.println(i.num);
    }

    class Inner {
        int num = 10;
        public void show() {
            System.out.println("show...");
            method();
        }
    }
}

class MyOuter{
    int num = 10;
    class MyInner{
        int num = 20;
        public void show(){
            int num = 30;
            System.out.println(num);                // 30
            System.out.println(this.num);           // 20
            System.out.println(MyOuter.this.num);   // 10
        }
    }
}
