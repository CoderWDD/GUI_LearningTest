package ComponentTest.Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Demo_JTabbedPane {
    JFrame jFrame = new JFrame("Demo_JTabbedPane");
    JTabbedPane jTabbedPane = new JTabbedPane(SwingConstants.LEFT,JTabbedPane.SCROLL_TAB_LAYOUT);
    public static void main(String[] args) {
        new Demo_JTabbedPane().init();
    }
    public void init(){
        jTabbedPane.addTab("用户管理", new JList<String>(new String[]{"用户一","用户二","用户三"}));
        jTabbedPane.addTab("商品管理", new JList<String>(new String[]{"商品一","商品二","商品三"}));
        jTabbedPane.addTab("订单管理", new JList<String>(new String[]{"订单一","订单二","订单三"}));

        jTabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int index = jTabbedPane.getSelectedIndex();
                System.out.println("选择了：" + jTabbedPane.getTitleAt(index));
            }
        });
        jTabbedPane.setEnabledAt(0, false);
        jFrame.add(jTabbedPane);

        jFrame.setBounds(400,400,400,400);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
