package ComponentTest.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo_Graphics_01 {
    final static String Text_Rect = "Rect";
    final static String Text_Oval = "Oval";
    static String temp = "";

    private static class MyCanvas extends Canvas{
        public void paint(Graphics g){
            if (temp.equals(Text_Oval)){
                g.setColor(Color.BLUE);
                g.drawOval(100,100,100,100);
            }else{
                g.setColor(Color.cyan);
                g.drawRect(100,100,100,100);
            }
        }
    }
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_Graphics_01");

        Button b1 = new Button("绘制矩形");
        Button b2 = new Button("绘制椭圆");

        MyCanvas myCanvas = new MyCanvas();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = "Rect";
                myCanvas.repaint();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = "Oval";
                myCanvas.repaint();
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Box hBox = Box.createHorizontalBox();
        hBox.add(b1);
        hBox.add(b2);

        myCanvas.setPreferredSize(new Dimension(300,300));

        frame.add(hBox,BorderLayout.SOUTH);
        frame.add(myCanvas);

        frame.pack();
        frame.setVisible(true);
    }

}
