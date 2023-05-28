package com.xuan.operation;

/**
 * <p>赋值运算符</p>
 *
 * @author :  轩辰;
 * @since 2023/04/23 00:14
 **/
public class OperationDemo2 {
    public static void main(String[] args) {
        /*
            赋值运算符 :
                = :  直接赋值
                += : 将符号左右两边的数据，做加法运算，再将结果赋值给左边
                -= : 将符号左右两边的数据，做减法运算，再将结果赋值给左边
                *= : 将符号左右两边的数据，做乘法运算，再将结果赋值给左边
                /= : 将符号左右两边的数据，做除法运算，再将结果赋值给左边
                %= : 将符号左右两边的数据，做取余运算，再将结果赋值给左边

                细节补充 : 扩展赋值运算符，内部自带强转效果
        */
        int num = 10;
        num -= 20;
        System.out.println(num);

        short s = 1;
        s += 1;
        System.out.println(s);
    }
}
