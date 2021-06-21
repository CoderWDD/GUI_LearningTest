package ComponentTest.Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Demo_ProgressBar {
    JFrame jFrame = new JFrame("Demo_ProgressBar");
    static JProgressBar jProgressBar = new JProgressBar(JProgressBar.HORIZONTAL,0,100);
    public static void main(String[] args) throws InterruptedException {
        new Demo_ProgressBar().init();
        for (int i = 0; i < 100; i++){
           jProgressBar.setValue(i);
           Thread.sleep(500);
        }
    }
    public void init(){


        JCheckBox box1 = new JCheckBox("是否不确定进度");
        JCheckBox box2 = new JCheckBox("是否不显示边框");

        box1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                boolean selected = box1.isSelected();
                jProgressBar.setIndeterminate(selected);
                jProgressBar.setStringPainted(!selected);
            }
        });

        box2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                boolean selected = box2.isSelected();
                jProgressBar.setBorderPainted(!selected);
            }
        });

        jProgressBar.setBorderPainted(true);
        jProgressBar.setIndeterminate(false);

        Box vBox = Box.createVerticalBox();
        vBox.add(box1);
        vBox.add(box2);

        Box hBox = Box.createHorizontalBox();
        hBox.add(vBox);
        hBox.add(jProgressBar);

        jFrame.add(hBox);

        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
