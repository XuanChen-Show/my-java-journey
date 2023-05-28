package com.xuan.method;

/**
 * <p>方法</p>
 *
 * @author :  轩辰;
 * @since 2023/04/23 22:45
 **/
public class MethodDemo {
    /**
     *  方法(函数)介绍 : 一段具有独立功能的代码块，不调用就不执行
     *  好处 :
     *      1、可以将原本挤在一起的臃肿代码，按照功能做分类管理
     *      2、提高了代码的复用性
     *  定义格式 :
     *      public void 方法名(){
     *          方法体(逻辑代码)
     *      }
     *  方法的调用格式 :
     *      方法名();
     *  注意事项 :
     *      1、方法与方法之间为平级关系，不允许嵌套定义
     *      2、方法不调用就不执行
     */
    public static void main(String[] args) {
        eat();
    }
    public static  void eat(){
        System.out.println("到饭点了，要吃饭了！");
    }
}
