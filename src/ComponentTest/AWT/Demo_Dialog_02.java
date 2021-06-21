package ComponentTest.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_Dialog_02 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_Dialog_02");
        Dialog d1 = new Dialog(frame,"Dialog1",true);
        Button b1 = new Button("关闭");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(false);
            }
        });
        d1.setBounds(100,100,100,100);
        TextField tf = new TextField(20);
        d1.add(tf,BorderLayout.NORTH);
        d1.add(b1);
        Button b2 = new Button("打开对话框");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });
        frame.add(b2);
        frame.pack();
        frame.setVisible(true);
    }
}
