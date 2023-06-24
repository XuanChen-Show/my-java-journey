package com.xuan.exception.myself;

/**
 * <p> 学生类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 22:46
 **/
public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            // 错误的年龄
            throw new StudentAgeException("年龄范围有误，需要0~120之间的年龄");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
