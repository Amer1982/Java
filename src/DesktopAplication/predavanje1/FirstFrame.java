package DesktopAplication.predavanje1;

import javax.swing.*;
import java.awt.*;

public class FirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Naš prvi frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("Drugi srednji dio"), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(new JButton("Gornji dio"), BorderLayout.PAGE_START);
        frame.add(new JButton("Lijevi dio"), BorderLayout.WEST);
        //frame.add(new JButton("Srednji dio"), BorderLayout.CENTER);
        frame.add(new JButton("Desni dio"), BorderLayout.EAST);
        frame.add(new JButton("Donji dio"), BorderLayout.PAGE_END);

        frame.setVisible(true);

    }
}
