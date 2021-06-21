package ComponentTest.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo_Listener_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_Listener_01");

        //设置窗口的关闭监听器
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Box hBox1 = Box.createHorizontalBox();
        Choice ch = new Choice();

        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object temp = e.getItem();
                System.out.println("当前选中的item为：" + temp);
            }
        });

        ch.addItem("六月");
        ch.addItem("七月");
        ch.addItem("八月");
        //hBox1.add();
        TextField tf = new TextField();

        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                Object temp = e.getSource();
                System.out.println(temp);
            }
        });

        hBox1.add(ch);
        hBox1.add(tf);

        frame.add(hBox1);

        frame.pack();
        frame.setVisible(true);
    }
}
