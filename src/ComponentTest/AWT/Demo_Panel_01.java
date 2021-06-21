package ComponentTest.AWT;


import java.awt.*;

public class Demo_Panel_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个Panel测试窗口");
        Panel panel = new Panel();
        panel.add(new TextField("我是一个测试编辑框"));
        panel.add(new Button("我是一个测试按钮"));
        frame.add(panel);
        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}
