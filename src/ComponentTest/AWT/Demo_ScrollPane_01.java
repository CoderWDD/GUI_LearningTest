package ComponentTest.AWT;

import java.awt.*;

public class Demo_ScrollPane_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个ScrollPane测试窗口");

        //创建一个始终带有滚动条的scrollPane
        ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        scrollPane.add(new TextField("这是一个测试文本"));
        scrollPane.add(new Button("这是一个测试按钮"));
        frame.add(scrollPane);
        //设置窗口的大小和位置，在不同的地方设置，结果会有区别
        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}
