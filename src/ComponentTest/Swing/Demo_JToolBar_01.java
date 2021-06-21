package ComponentTest.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Demo_JToolBar_01 {
    JFrame jf = new JFrame("Demo_JToolBar_01");
    JTextArea jta = new JTextArea(20,35);

    //声明工具条相关内容
    JToolBar jToolBar = new JToolBar("播放工具条",SwingConstants.HORIZONTAL);

    //创建3个Action对象
    Action pre = new AbstractAction("上一曲") {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("上一曲.\n");
        }
    };

    Action pause = new AbstractAction("暂停") {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("暂停播放.\n");
        }
    };

    Action next = new AbstractAction("下一曲") {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("下一曲.\n");
        }
    };

    public void init(){
        //组装视图
        jToolBar.add(pre);
        jToolBar.addSeparator();
        jToolBar.add(pause);
        jToolBar.addSeparator();
        jToolBar.add(next);



        jf.add(jToolBar, BorderLayout.NORTH);

        //由于JTextArea本身不支持滚动条，因此，要将它加到JScrollPane，从而实现滚动条
        JScrollPane jScrollPane = new JScrollPane(jta);


        jf.add(jScrollPane);

        //设置工具条可拖动
        jToolBar.setFloatable(true);

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo_JToolBar_01().init();
    }
}
