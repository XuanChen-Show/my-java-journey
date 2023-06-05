package com.xuan.frame.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * <p>事件监听</p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 22:06
 **/
public class ActionListenerDemo {
    /**
     *  动作事件 : ActionListener
     */
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame frame = new JFrame();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("世界大战");
        frame.setLayout(null);
        // 按钮
        JButton button = new JButton("按钮啊");
        button.setBounds(10,10,100,50);
        frame.getContentPane().add(button);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按了一下按钮！");
            }
        });

        frame.setVisible(true);
    }
}
