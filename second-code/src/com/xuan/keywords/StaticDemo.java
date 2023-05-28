package com.xuan.keywords;

/**
 * <p> static 关键字</p>
 *
 * @author :  轩辰;
 * @since 2023/05/28 14:46
 **/
public class StaticDemo {
    /**
     *  static 关键字 : 修饰符，可以修饰成员变量和成员方法
     *      特点 :
     *          1、被类的所有对象所共享
     *          2、多了一种调用方式，可以通过类名进行调用
     *          3、随着类的加载而加载，优先于对象存在
     *      修饰成员方法 :
     *          1、成员方法什么时候加入 static
     *              - 常用于制作工具类的时候
     *          2、工具类 : 不是描述事物，而是帮我们完成一些事情(打工)
     *          3、如果发现一个类中，所有的方法，全都是 static 所修饰
     *              - 私有该类的构造方法
     *              - 目的 : 为了不让其他类，再创建对象
     *  static 方法中，只能访问静态成员(直接访问)
     *  static 中不允许使用 this 关键字
     */
    public static void main(String[] args) {
        // static 修饰成员变量 初体验
        staticFirstMethod();
        // static 修饰成员方法
        staticMethod();

    }

    /**
     *  static 修饰成员方法
     */
    private static void staticMethod() {
        int[] arr = {12,23,43,123,43,345,12,43,345,1,23};
        //StaticTool tool = new StaticTool();
        System.out.println(StaticTool.getMax(arr));
        System.out.println(StaticTool.getMin(arr));
        StaticTool.printArray(arr);
    }

    /**
     *  static 修饰成员变量 初体验
     */
    private static void staticFirstMethod() {
        Clerk clerk1 = new Clerk();
        clerk1.name = "张三";
        clerk1.age = 28;
        clerk1.unit = "联发科";
        System.out.println("姓名:"+clerk1.name+"--- 年龄:"+clerk1.age+"--- 单位:"+clerk1.unit);

        Clerk clerk2 = new Clerk();
        clerk2.name = "李四";
        clerk2.age = 30;
        //  被类的所有对象所共享
        System.out.println("姓名:"+clerk2.name+"--- 年龄:"+clerk2.age+"--- 单位:"+clerk2.unit);

        Clerk clerk3 = new Clerk();
        System.out.println("姓名:"+clerk3.name+"--- 年龄:"+clerk3.age+"--- 单位:"+clerk3.unit);

        Clerk clerk4 = new Clerk();
        //  可以通过类名进行调用  (也推荐使用类名的方式进行调用)
        Clerk.unit = "西门子";
        System.out.println("姓名:"+clerk4.name+"--- 年龄:"+clerk4.age+"--- 单位:"+clerk4.unit);
    }
}
