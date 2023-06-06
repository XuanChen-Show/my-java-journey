package com.xuan.type.object.tostring;

/**
 * <p> Object类 toString方法 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/06 23:21
 **/
public class ToStringDemo {
    /**
     *      toString()
     *              public String toString()
     *              返回对象的字符串表示形式。
     *              -----------------------------------
     *          细节 : 使用打印语句，打印对象名的时候，println 方法，源码层面，会自动调用该对象的 toString 方法
     *      object 的toString方法 :
     *          public String toString() {
     *              return getClass().getName() + "@" + Integer.toHexString(hashCode());
     *          }
     *          getClass().getName() : 类名称，全类名(包名 + 类名)
     *          Integer.toHexString() : 转换为十六进制
     *          hashCode() : 返回的是对象内存地址 + 哈希算法，算出来的整数(哈希值)
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());

        Hero hero = new Hero("霍华德",180);
        System.out.println(hero.toString());
    }
}

class A{

    @Override
    public String toString() {
        return "重写后的toString方法";
    }
}
