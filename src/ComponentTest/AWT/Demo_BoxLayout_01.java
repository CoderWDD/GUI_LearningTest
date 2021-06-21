package ComponentTest.AWT;

import javax.swing.*;
import java.awt.*;

public class Demo_BoxLayout_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_BoxLayout_01");
        //给Fram添加BoxLayout，并设置为水平分布
        frame.setLayout(new BoxLayout(frame,BoxLayout.X_AXIS));
        frame.add(new Button("Button1"));
        frame.add(new Button("Button2"));
        frame.pack();
        frame.setVisible(true);
    }
}
