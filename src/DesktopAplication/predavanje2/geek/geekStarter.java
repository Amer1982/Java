package DesktopAplication.predavanje2.geek;

import javax.swing.*;

public class geekStarter {
    public static void main(String[] args) {
SwingUtilities.invokeLater(geekStarter::createGUI);

    }
    static void createGUI(){
        System.out.println(Thread.currentThread());
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        geekPanel geekPanel=new geekPanel();
        frame.setContentPane(geekPanel);
        frame.pack();
        frame.setVisible(true);

    }

}
