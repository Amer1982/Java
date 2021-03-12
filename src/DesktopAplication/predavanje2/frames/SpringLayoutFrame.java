package DesktopAplication.predavanje2.frames;

import javax.swing.*;

public class SpringLayoutFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Dugmić 1");
        JButton button2 = new JButton("Dugmić 2");
        JButton button3 = new JButton("Dugmić 3");
        JButton button4 = new JButton("Dugmić 4");

        SpringLayout springLayout = new SpringLayout();
        frame.setLayout(springLayout);

        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        springLayout.putConstraint(SpringLayout.WEST, button2, 87, SpringLayout.WEST, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, button2, 26, SpringLayout.NORTH, frame.getContentPane());

        springLayout.putConstraint(SpringLayout.WEST, button3, 87, SpringLayout.WEST, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, button3, 52, SpringLayout.NORTH, frame.getContentPane());

        springLayout.putConstraint(SpringLayout.WEST, button4, 0, SpringLayout.WEST, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, button4, 78, SpringLayout.NORTH, frame.getContentPane());

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
