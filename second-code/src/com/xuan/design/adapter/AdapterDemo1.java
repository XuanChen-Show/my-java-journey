package com.xuan.design.adapter;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * <p> 适配器设计模式 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 22:35
 **/
public class AdapterDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了");
            }
        });

        frame.setVisible(true);
    }
}
