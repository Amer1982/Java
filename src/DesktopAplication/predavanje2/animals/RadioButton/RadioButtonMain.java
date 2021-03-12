package DesktopAplication.predavanje2.animals.RadioButton;

import javax.swing.*;

public class RadioButtonMain {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(RadioButtonMain::createGUI);

        }
        static void createGUI(){
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            AnimalPanel animalPanel = new AnimalPanel();
            frame.setContentPane(animalPanel);
            frame.pack();
            frame.setVisible(true);
        }
    }
