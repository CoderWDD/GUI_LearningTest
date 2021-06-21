package ComponentTest.Swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Demo_Border_01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo_Border_01");
        jf.setLayout(new GridLayout(2,4));

        Border bevelBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.GREEN, Color.BLUE,Color.GRAY);
        jf.add(getJPanel(bevelBorder,"bevelBorder"));

        Border lineBorder = BorderFactory.createLineBorder(Color.RED, 15);
        jf.add(getJPanel(lineBorder,"lineBorder"));

        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        jf.add(getJPanel(emptyBorder,"emptyBorder"));

        Border etchedBorder = new EtchedBorder(Color.GRAY, Color.RED);
        jf.add(getJPanel(etchedBorder, "etchedBorder"));

        Border titleBorder = new TitledBorder(BorderFactory.createLineBorder(Color.RED, 15), "titleBorder");
        jf.add(getJPanel(titleBorder,"titleBorder"));



        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JPanel getJPanel(Border border,String context){
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(context));
        //设置边框
        jPanel.setBorder(border);

        return jPanel;
    }
}
