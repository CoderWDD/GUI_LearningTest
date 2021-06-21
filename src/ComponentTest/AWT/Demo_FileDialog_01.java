package ComponentTest.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_FileDialog_01 {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo_FileDialog_01");
        FileDialog f1 = new FileDialog(frame,"打开文件",FileDialog.LOAD);
        FileDialog f2= new FileDialog(frame," 保存文件",FileDialog.SAVE);

        Button b1 = new Button("打开文件");
        Button b2 = new Button("保存文件");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                System.out.println("getDirectory：" + f1.getDirectory());
                System.out.println("getFile：" + f1.getFile());
                System.out.println("getName：" + f1.getName());
                System.out.println("getTitle：" + f1.getTitle());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
                System.out.println("getDirectory：" + f2.getDirectory());
                System.out.println("getFile：" + f2.getFile());
                System.out.println("getName：" + f2.getName());
                System.out.println("getTitle：" + f2.getTitle());
            }
        });

        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
