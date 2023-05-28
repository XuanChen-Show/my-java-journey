package com.xuan.oop;

/**
 * <p> 继承  搬砖人子类</p>
 *
 * @author : 轩辰;
 * @since 2023/05/28 16:50
 **/
public class InheritCoder extends InheritEmployee {
    int num = 20;

    /**
     *  super
     */
    public void superMethod() {
        int num = 30;
        //30
        System.out.println(num);
        // 20
        System.out.println(this.num);
        //10
        System.out.println(super.num);
    }

    /**
     *  方法重写
     */
    @Override
    public void show() {
        super.show();
        System.out.println("Zi...... show");
    }
}
