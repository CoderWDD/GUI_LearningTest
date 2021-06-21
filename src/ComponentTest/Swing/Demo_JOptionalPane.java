package ComponentTest.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Demo_JOptionalPane {
    JFrame jFrame = new JFrame("Demo_JOptionalPane_MessageDialog");
    JTextArea jta = new JTextArea(10,20);
    Box box = Box.createHorizontalBox();
    JButton jbt_message = new JButton(new AbstractAction("弹出消息对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(jFrame,jta.getText(),"消息对话框",JOptionPane.QUESTION_MESSAGE);
        }
    });
    JButton jbt_confirm = new JButton(new AbstractAction("弹出确认对话框"){
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("\n");
            int res= JOptionPane.showConfirmDialog(jFrame, jta.getText(),"确认",JOptionPane.DEFAULT_OPTION);
            if (res == JOptionPane.YES_OPTION){
                jta.append("点击了确认按钮");
            }
        }
    });

    public void init(){
        box.add(jbt_message);
        box.add(jbt_confirm);

        jFrame.add(jta);

        jFrame.add(box, BorderLayout.SOUTH);

        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Demo_JOptionalPane().init();
    }
}
