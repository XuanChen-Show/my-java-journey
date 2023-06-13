package com.xuan.frame.label;

import javax.swing.*;

/**
 * <p> 文本和图片 组件 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/05 21:24
 **/
public class JLableDemo {
    /**
     *  JLabel 的构造方法
     *      JLabel(String text) : 使用指定的文本创建一个 JLabel 对象
     *      JLabel(Icon image) : 创建一个具有指定图像的 JLabel 对象
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

        // JLabel 展示文本
        JLabel label1 = new JLabel("吾日三省吾身");
        label1.setBounds(33,33,100,50);
        frame.getContentPane().add(label1);
        JLabel label2 = new JLabel("吃乎，玩乎，睡乎");
        label2.setBounds(133,33,120,50);
        frame.getContentPane().add(label2);
        // JLabel 展示图片
        //ImageIcon icon = new ImageIcon("D:\\图库\\img.jpg");
        JLabel label_jpg = new JLabel(new ImageIcon("D:\\图库\\img.jpg"));
        label_jpg.setBounds(33,88,120,50);
        frame.getContentPane().add(label_jpg);
        JLabel label_1png = new JLabel(new ImageIcon("F:\\IDEA\\Items\\JavaSE\\first-face\\second-code\\src\\com\\xuan\\frame\\img\\1.png"));
        label_1png.setBounds(33,150,115,115);
        frame.getContentPane().add(label_1png);
        JLabel label_2png = new JLabel(new ImageIcon("second-code/src/com/xuan/frame/img/2.png"));
        label_2png.setBounds(33,300,115,115);
        frame.getContentPane().add(label_2png);

        // 设置窗体可见    最好放在最后面
        frame.setVisible(true);
    }
}
