package ComponentTest.AWT;

import java.awt.*;

public class Demo_Frame_01 {

    public static void main(String[] args) {
        //创建一个Frame对象
        Frame frame = new Frame("这是一个测试窗口");
        //设置窗口位置和大小
        frame.setLocation(100,100);
        frame.setSize(500,300);
        //设置窗口可见
        frame.setVisible(true);

    }
}
