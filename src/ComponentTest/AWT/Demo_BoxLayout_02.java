package ComponentTest.AWT;

import javax.swing.*;
import java.awt.*;

public class Demo_BoxLayout_02 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_BoxLayout_02");
        Box hBox1 = Box.createHorizontalBox();
        Box hBox2 = Box.createVerticalBox();
        hBox1.add(new Button("水平按钮一"));
        hBox1.add(new Button("水平按钮二"));
        hBox2.add(new Button("垂直按钮一"));
        hBox2.add(new Button("垂直按钮二"));
        frame.add(hBox1,BorderLayout.NORTH);
        frame.add(hBox2,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
