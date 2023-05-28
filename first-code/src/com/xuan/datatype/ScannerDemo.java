package com.xuan.datatype;

import java.util.Scanner;

/**
 * <p>控制台输入</p>
 *
 * @author 轩辰
 * @since : 2023/04/20 00:15
 **/
public class ScannerDemo {
    public static void main(String[] args) {
        /*
            控制台输入 :
                描述 : 程序运行中，可在控制台（终端）手动录入数据，再让程序继续运行
                使用 :
                    1、导入 java.util.Scanner
                    2、声明 Scanner 类型的变量
                    3、使用Scanner类中对应的函数（区分类型）:
                        nextInt();	//获得整数
                        nextDouble();	//获得小数
                        next();		//获得字符串
                        next().charAt(0);//获得单个字符
                注：如果输入了不匹配的数据，则会产生java.util.InputMismatchException
        */
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double v = sc.nextDouble();
        boolean b = sc.nextBoolean();
        String next = sc.next();
        System.out.println(age);
        /*
            int age = sc.nextInt();
            double v = sc.nextDouble();
            boolean b = sc.nextBoolean();
            String next = sc.next();
        * */
    }
}
