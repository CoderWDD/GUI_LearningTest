package ComponentTest.AWT;

import javax.swing.border.Border;
import java.awt.*;

public class Demo_LayoutManager_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_LayoutManager_01");
        frame.setLayout(new BorderLayout());
        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"),BorderLayout.SOUTH);
        frame.add(new Button("East"),BorderLayout.EAST);
        frame.add(new Button("West"),BorderLayout.WEST);
        frame.add(new Button("Center"),BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
