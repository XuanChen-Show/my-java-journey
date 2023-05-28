package com.xuan.constructor;

/**
 * <p>构造器</p>
 *
 * @author :  轩辰;
 * @since 2023/05/22 21:56
 **/
public class Phone {

    /**
     * 构造方法生成快捷键 :
     */
    private String name;
    private int price;

    /**
     *  无参构造
     */
    public Phone() {

    }

    /**
     *  有参构造
     */
    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
