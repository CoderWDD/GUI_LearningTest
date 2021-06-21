package ComponentTest.Swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Demo_JFileChooser {
    MyCanvas myCanvas = new MyCanvas();
    BufferedImage image;
    JFrame jFrame = new JFrame("Demo_JFileChooser");
    JMenuItem open = new JMenuItem(new AbstractAction("打开"){
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showOpenDialog(jFrame);
            File file = jFileChooser.getSelectedFile();
            try {
                image = ImageIO.read(file);
                myCanvas.repaint();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    });
    JMenuItem save = new JMenuItem(new AbstractAction("保存") {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(jFrame);
            File file = jFileChooser.getSelectedFile();
            try {
                ImageIO.write(image,"jpeg", file);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    });
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu("文件");
    public static void main(String[] args) {
        new Demo_JFileChooser().init();
    }
    public void init(){
        //添加菜单项
        jMenu.add(open);
        jMenu.add(save);

        jMenuBar.add(jMenu);
        jFrame.setJMenuBar(jMenuBar);

        //添加MyCanvas
        myCanvas.setPreferredSize(new Dimension(700,500));

        jFrame.add(myCanvas);

        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private class MyCanvas extends JPanel{
        @Override
        public void paint(Graphics graphics){
            graphics.drawImage(image, 0,0,null);
        }
    }



}
