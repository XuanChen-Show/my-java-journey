package com.xuan.exception.myself;

import java.util.Scanner;

/**
 * <p> 自定义异常 : 学生年龄异常 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/24 22:43
 **/
public class StudentAgeException extends RuntimeException {
    /**
     *  自定义异常 :
     *      自定义编译时异常 : 创建一个类，继承 Exception
     *      自定义运行时异常 : 创建一个类，继承RunTimeException
     */
    public StudentAgeException() {
    }

    public StudentAgeException(String message) {
        super(message);
    }
}
