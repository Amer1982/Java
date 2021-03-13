package DesktopAplication.Vjezba;

import javax.swing.*;

public class GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        java.awt.GridLayout gridLayout=new java.awt.GridLayout(3,3);
        frame.getContentPane().setLayout(gridLayout);

        //Razmak izmecu dugmica se može unijeti prilikom instanciranja ili naknadno.
        // Prilikom instanciranja se unosi nakon odredivanja broja kolona i redova npr GridLayout(3,3,3,3)
        gridLayout.setHgap(3);
        gridLayout.setVgap(3);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.add(new JButton("11"));
        frame.add(new JButton("12"));
        frame.add(new JButton("13"));
        frame.add(new JButton("14"));
        frame.add(new JButton("15"));
        frame.add(new JButton("16"));
        frame.add(new JButton("17"));
        frame.add(new JButton("18"));
        frame.add(new JButton("19"));
        frame.add(new JButton("20"));
        frame.add(new JButton("21"));
        frame.pack();

        frame.setVisible(true);

    }
}
