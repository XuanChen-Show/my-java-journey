package com.xuan.exception;

/**
 * <p> 异常常用方法 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 23:04
 **/
public class ThrowableMethodDemo {
    /**
     *  Throwable常用方法 :
     *      public String getMessage()  获取异常的错误原因
     *      public void printStackTrace() 展示完整的异常错误信息
     */
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("结束");
    }
}
