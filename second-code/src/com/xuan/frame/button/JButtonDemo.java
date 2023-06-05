package com.xuan.frame.button;

import javax.swing.*;

/**
 * <p>按钮组件</p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 21:08
 **/
public class JButtonDemo {
    /**
     *  JButton 的构造方法 :
     *      1、public JButton() : 创建一个空白的按钮
     *      2、public JButton(String text) : 创建一个带文本的按钮
     *
     *  注意 : 如果取消类窗体的默认布局，就需要手动指定组件的摆放位置了
     */
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame frame = new JFrame();
        // 设置窗体大小
        frame.setSize(500,600);
        // 修改窗体的关闭模式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体标题
        frame.setTitle("世界大战");
        //  取消窗体的默认布局
        frame.setLayout(null);

        // 1、创建按钮对象
        JButton button = new JButton("按钮啊");
        //指定按钮位置和大小
        button.setBounds(10,10,100,50);
        // 2、将按钮添加到窗体的 [面板对象] 中
        frame.getContentPane().add(button);

        // 设置窗体可见    最好放在最后面
        frame.setVisible(true);
    }
}
