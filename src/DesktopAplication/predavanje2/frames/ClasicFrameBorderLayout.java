package DesktopAplication.predavanje2.frames;

import javax.swing.*;
import java.awt.*;

public class ClasicFrameBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button=new JButton("Dugmić 1");
        JButton button2=new JButton("Dugmić 2");
        JButton button3=new JButton("Dugmić 3");
        JButton button4=new JButton("Dugmić 4");

        frame.add(button, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.LINE_START);
        frame.add(button3, BorderLayout.CENTER);
        frame.add(button4, BorderLayout.LINE_END);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
