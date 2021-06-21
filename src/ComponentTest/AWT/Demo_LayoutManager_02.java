package ComponentTest.AWT;

import java.awt.*;

public class Demo_LayoutManager_02 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_LayoutManager_02");
        Panel p1 = new Panel();
        p1.add(new TextField(30));
        frame.add(p1,BorderLayout.NORTH);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(String.valueOf(i)));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        frame.add(p2);
        frame.pack();
        frame.setVisible(true);
    }
}
