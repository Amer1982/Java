package DesktopAplication.predavanje2.animals.ComboBox;

import javax.swing.*;

public class ComboMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ComboMain::createGUI);

    }
    static void createGUI(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ComboBoxPanel comboBoxPanel=new ComboBoxPanel();
        frame.setContentPane(comboBoxPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
