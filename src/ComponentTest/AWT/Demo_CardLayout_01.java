package ComponentTest.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_CardLayout_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_CardLayout_01");
        Panel p1 = new Panel();
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);
        String[] names = {"第一张","第二张","第三张","第四张","第五张"};
        for (int i = 0; i < 5; i++) {
            p1.add(names[i],new Button(names[i]));
        }
        frame.add(p1);
        Panel p2 = new Panel();
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = e.getActionCommand();
                switch (temp){
                    case "上一张":
                        cardLayout.previous(p1);
                        break;
                    case "下一张":
                        cardLayout.next(p1);
                        break;
                    case "第一张":
                        cardLayout.first(p1);
                        break;
                    case "最后一张":
                        cardLayout.last(p1);
                        break;
                    case "第三张":
                        cardLayout.show(p1,"第三张");
                        break;
                }
            }
        };
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        b3.addActionListener(actionListener);
        b4.addActionListener(actionListener);
        b5.addActionListener(actionListener);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        frame.add(p2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
