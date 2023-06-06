package com.xuan.type.object.equals;

import com.xuan.type.object.tostring.Hero;

import java.util.Objects;

/**
 * <p> Object类 equals方法 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/06 23:47
 **/
public class EqualsDemo {
    /**
     *  Object类中的 equals方法 :
     *      public boolean equals(Object obj)  : 对象之间进行比较，返回true，或者是false
     *
     *      Object 类中的 equals 方法，默认比较的是对象内存地址
     *          - 通常会重写 equals 方法，让对象之间，比较内容
     */
    public static void main(String[] args) {
        Hero hero1 = new Hero("托尼", 180);
        Hero hero2 = new Hero("托尼", 180);

        System.out.println(hero1 == hero2);
        System.out.println(hero1.equals(hero2));
    }
}
