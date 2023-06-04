package com.xuan.lambda;

/**
 * <p> Lambda表达式注意事项 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/04 23:16
 **/
public class LambdaDemoB {
    /**
     *  Lambda表达式，只允许操作函数式编程接口
     *      函数式编程接口 : 有，且仅有一个抽象方法的接口
     *
     *      @FunctionalInterface 放在接口上面可以检查接口是否是函数式接口，如果不是，书写时就会报错
     */
    public static void main(String[] args) {
        // 匿名内部类写法
        useInterB(new InterB() {
            @Override
            public void show1() {
                System.out.println("匿名内部类...show1方法...");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类...show2方法...");
            }
        });
        System.out.println("------------------------------");
        // Lambda表达式写法,在这里就报错类，因为 Lambda表达式，只允许操作函数式编程接口
        //useInterB(() -> {});
    }

    public static void useInterB(InterB b){
        b.show1();
        b.show2();
    }
}

//@FunctionalInterface
interface InterB {
    void show1();
    void show2();
}
