package DesktopAplication.predavanje2.frames;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Dugmić 1");
        JButton button2 = new JButton("Dugmić 2");
        JButton button3 = new JButton("Dugmić 3");
        JButton button4 = new JButton("Dugmić 4");


        Container frameContentPane = frame.getContentPane();
        //BoxLayout boxLayout= new BoxLayout(frameContentPane, BoxLayout.Y_AXIS);
        BoxLayout boxLayout = new BoxLayout(frameContentPane, BoxLayout.X_AXIS);
        frameContentPane.setLayout(boxLayout);
        frameContentPane.add(button);
        frameContentPane.add(button2);
        frameContentPane.add(button3);
        frameContentPane.add(button4);

        frame.pack();
        frame.setVisible(true);
    }
}
