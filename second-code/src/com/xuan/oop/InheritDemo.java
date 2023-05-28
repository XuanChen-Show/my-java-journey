package com.xuan.oop;

/**
 * @author : 轩辰;
 * @since 2023/05/28 16:49
 **/
public class InheritDemo {
    /**
     *  继承
     *      子父类中，如果出现了方法声明一模一样的方法(方法名，参数，返回值)
     *          在创建子类对象，调用方法的时候，会优先使用子类的方法逻辑
     *          这虽然是就近原则的现象，但其实是 子类的方法 对 父类的方法 进行了重写操作
     *   - 方法重载(overload) : 在同一个类中，方法名相同，参数不同，与返回值无关
     *                              参数不同 : 类型不同，个数不同，顺序不同
     *   - 方法重写(Override) : 在子父类中，出现了方法声明一模一样的方法(方法名，参数，返回值)
     *          目标1 : 能够独立识别出，方法是不是重写的方法
     *                      - 注解 : @Override
     *          目标2 : 方法重写的使用场景
     *                  - 当子类需要父类的方法，但是觉得父类的方法逻辑不好 (需要 修改|增强) 就可以对父类的方法进行重写
     *      构造方法 :
     *          在所有子类的构造方法的第一行代码，都默认隐藏了一句话 super();
     *          通过这句代码，访问父类的空参数构造方法；
     */
    public static void main(String[] args) {
        // 继承 尝试
        inheritTest();
        // super 测试
        InheritCoder coder = new InheritCoder();
        coder.superMethod();
        // 方法重写
        coder.show();
        //构造方法
        InheritManager manager = new InheritManager();
    }

    /**
     *  继承 尝试
     */
    private static void inheritTest() {
        InheritCoder coder = new InheritCoder();
        coder.name = "赵子龙";
    }
}
