package com.xuan.design.template;

/**
 * <p>模板方法设计模式</p>
 * <p>模板</p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 22:48
 **/
public abstract class CompositionTemplate {
    /**
     *  作文模板
     */
    public final void write() {
        System.out.println("我和我的祖国");

        body();

        System.out.println("我爱我的祖国");
    }

    /**
     *  作文正文
     */
    public abstract void body();
}
