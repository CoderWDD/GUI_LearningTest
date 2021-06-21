package ComponentTest.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Demo_JColorChooser {
    JFrame jf = new JFrame("Demo_JColorChooser");
    JTextArea jta = new JTextArea("我爱Java",20,30);

    public void init(){
        JButton jButton = new JButton(new AbstractAction("打开颜色选择器"){
            @Override
            public void actionPerformed(ActionEvent e){
                Color res = JColorChooser.showDialog(jf, "颜色选择器", Color.white);
                jta.setBackground(res);
            }
        });


        jf.add(jta);
        jf.add(jButton,BorderLayout.SOUTH);


        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Demo_JColorChooser().init();
    }
}
