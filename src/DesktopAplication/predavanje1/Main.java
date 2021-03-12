package DesktopAplication.predavanje1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Naš prvi frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Za velicinu prozora mozemo koristiti setSiza ili pack
        // frame.setSize(500, 500);

        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        ButtonPanel buttonPanel = new ButtonPanel();
        frame.setContentPane(buttonPanel);
        frame.pack();
        frame.setVisible(true);

    }
}
