package com.xuan.collect;

import java.util.ArrayList;

/**
 * <p>ArrayList 集合的使用</p>
 *
 * @author :  轩辰;
 * @since 2023/05/27 18:45
 **/
public class ArrayListDemo1 {
    /**
     *  ArrayList 集合的使用 :
     *      细节 : 创建 String , StringBuilder , ArrayList 类的对象，打印对象名，都没有看到地址值，而是元素内容
     *      1、构造方法 :
     *          public ArrayList() : 穿件一个空的集合容器
     *      2、集合容器的创建细节 :
     *          ArrayList list = new ArrayList();
     *              现象 : 可以添加任意类型的数据
     *              弊端 : 数据不够严谨
     *          ArrayList<String> list = new ArrayList<>();
     *
     *      3、< > : 泛型
     *          目前 : 使用泛型，可以对集合中存储的数据，进行类型限制
     *          细节 : 泛型中，不允许编写基本数据类型
     *          问题 : 那如果想要在集合中存储 整数、小数、字符。。。这些数据，要怎么写？
     *          解决 : 使用基本数据类型所对应的包装类
     *              byte        Byte
     *              short       Short
     *              int         Integer
     *              long        Long
     *              float       Float
     *              double      Double
     *              boolean     Boolean
     *              char        Character
     *      4、ArrayList 常用的成员方法 :
     *          增 :
     *              public boolean add(E e) : 将指定的元素追加到此列表的末尾。
     *              public void add(int index, E element) : 在指定索引位置，添加对应的元素(插队)
     *          删 :
     *              public E remove(int index) : 根据索引做删除，返回被删除掉的元素
     *              public boolean remove(Object o) : 根据元素做删除，返回是否删除成功的状态
     *              注意 : remove 方法调用以后，ArrayList里 被删除的元素 后面的元素的索引都会往前 进1 , 即索引值会 -1
     *          改 :
     *              public E set(int index, E element) : 修改指定索引位置的元素  为 设置的元素；返回被覆盖掉的元素
     *          查 :
     *              public E get(int index) : 根据索引，获取集合中的元素
     *              public int size() : 返回 集合中元素的个数
     *      5、ArrayList 常用的遍历 :
     *  a
     */
    public static void main(String[] args) {
        firstArrayList();
        //  ArrayList 的 添加方法
        addMethod();
        //  ArrayList 的 删除方法
        removeMethod();
        //  ArrayList 的 修改方法
        setMethod();
        //  ArrayList 的 获取方法
        getMethod();
        //  ArrayList 的 for 循环遍历
        forLoop();
        //
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
    }

    /**
     *  ArrayList 的 for 循环遍历
     */
    private static void forLoop() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        for (int i = 0; i < list.size(); i++) {
            String  str = list.get(i);
            System.out.println(str);
        }
    }

    /**
     *  ArrayList 的 获取方法
     */
    private static void getMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        String s = list.get(2);
        System.out.println(s);
        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     *  ArrayList 的 修改方法
     */
    private static void setMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.set(1,"赵子龙");
        System.out.println(list);
    }

    /**
     *  ArrayList 的 删除方法
     */
    private static void removeMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add(0,"赵子龙");
        list.remove(1);
        list.remove("赵子龙");
        System.out.println(list);
    }

    /**
     *  ArrayList 的 添加方法
     */
    private static void addMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add(0,"赵子龙");
        System.out.println(list);
    }

    /**
     *  ArrayList
     */
    private static void firstArrayList() {
        // 下面注释的代码为不够严谨
//        ArrayList list = new ArrayList();
//        list.add("张三");
//        list.add("李四");
//        list.add("王五");
//        System.out.println(list);
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        System.out.println(list);
    }

}
