package com.xuan.frame.listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * <p>事件监听</p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 22:12
 **/
public class KeyListenerDemo {
    /**
     *  键盘事件 : KeyListener
     *
     *      keyPressed
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // 只能监听部分按键    fn  ctrl  esc  上下左右 等按键是监听不到的
                System.out.println("哦吼...");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了...");
                int keyCode = e.getKeyCode();
                System.out.println("这个键盘的编码..." + keyCode);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("键盘松开了...");
            }
        });

        frame.setVisible(true);
    }
}
