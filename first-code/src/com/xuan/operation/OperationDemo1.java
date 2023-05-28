package com.xuan.operation;

/**
 * <p>算术运算符</p>
 *
 * @author : 轩辰 ；
 * @since : 2023/04/20 00:15
 **/
public class OperationDemo1 {
    public static void main(String[] args) {
        /*
            算术运算符 :
                +
                -
                *
                / : 整数相除，结果只能得到整数，想要得到带有小数的结果，需要有小数参与运算
                % : 取模，作用是用来取余数
                    % 目前能够想到的使用场景是它可以进行奇偶数的判断
                    任何一个数 % 2 的结果，不是0，就是1
                ++ : 让变量自身的值 + 1
                -- : 让变量自身的值 - 1

        * */
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);

        System.out.println(5 % 2);
        System.out.println(4 % 2);
        System.out.println(3 % 2);
        /*
            自增自减运算符 :
                ++ : 让变量自身的值 + 1
                -- : 让变量自身的值 - 1
              1、单独使用 : 一句代码中，只做 ++ 或者 -- 操作， ++和-- 在变量的前面还是后面没有任何区别
              2、参与运算 :
                    ++ 在前，先自增，再操作；
                    ++ 在后，先操作再自增 : 将变量原本记录的值提取出来做操作，然后变量再自增

        * */
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int b = 10;
        int c = b++;
        int d = 10;
        int e = ++d;
        // 结果 : b=11; c=10; d=11; e=11
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);

        int f = 3;
        int g = (++f) + (f++) + (f * 10);
        // 上面的运算 : 4 + 4 + 50
        // 结果 : f = 5; g = 58
        System.out.println("f = " + f);
        System.out.println("g = " + g);

    }
}
