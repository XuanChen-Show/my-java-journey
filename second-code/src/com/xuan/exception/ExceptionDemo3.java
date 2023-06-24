package com.xuan.exception;

/**
 * <p> 异常的默认处理方式 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 21:42
 **/
public class ExceptionDemo3 {
    /**
     *  Java 对于异常的默认处理方式 : 向上抛出
     *      1、虚拟机会在出现异常的代码那里自动的创建一个异常对象 : ArithmeticException
     *      2、异常会从方法中出现的点这里抛出给调用者，调用者最终抛出给JVM虚拟机
     *      3、虚拟机接收到异常对象后，现在控制台直接输出异常信息数据
     *      4、终止Java程序的运行
     *      5、后续代码没有机会执行了，因为程序已经噶了
     */
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    private static void method() {
        System.out.println(10/0);  //  new ArithmeticException();
    }
}
