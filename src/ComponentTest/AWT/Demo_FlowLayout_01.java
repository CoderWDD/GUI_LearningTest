package ComponentTest.AWT;

import java.awt.*;

public class Demo_FlowLayout_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个FlowLayout测试窗口");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        for (int i = 0; i < 100; i++) {
            frame.add(new Button(Integer.toString(i)));
        }
        //设置窗口最佳大小和可见
        //frame.pack();设置最优大小
        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}
