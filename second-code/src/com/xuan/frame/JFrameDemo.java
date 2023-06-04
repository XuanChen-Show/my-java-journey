package com.xuan.frame;

import javax.swing.*;

/**
 * <p> 窗体 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 00:06
 **/
public class JFrameDemo {
    /**
     *  窗体
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

        // 设置窗体可见    最好放在最后面
        frame.setVisible(true);
    }
}
