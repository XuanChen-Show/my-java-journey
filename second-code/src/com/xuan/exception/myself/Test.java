package com.xuan.exception.myself;

import java.util.Scanner;

/**
 * <p> 自定义异常测试 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 22:52
 **/
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名 : ");
        String name  = sc.nextLine();
        student.setName(name);

        System.out.println("请输入学生的年龄 : ");
        int age = 0;

        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                student.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄输入有误，请重新输入整数年龄");
            } catch (StudentAgeException e) {
                String message = e.getMessage();
                System.out.println(message);
            }
        }

        System.out.println(student);
    }
}
