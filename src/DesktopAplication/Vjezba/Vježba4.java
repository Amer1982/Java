package DesktopAplication.Vjezba;

import javax.swing.*;
import java.awt.GridLayout;

/**
Potrebno je kreirati gameplay prozor za igru memorije
Ovaj prozor imaće 12 placeholder a za kartice placeholdere treba privremeno smjestiti tastere.
Na vrhu prozora treba da bude poseban odjeljak u kome će se nalaziti tasteri za prekid igre,
restart igre i izlazak iz programa
 */
public class Vježba4 {

    public static void main(String[] args) {
        new Vježba4();
    }

    Vježba4() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Memory Game");

        panel.setLayout(new GridLayout(1, 3,5,5));
        panel.add(new JButton("END"));
        panel.add(new JButton("RESTART"));
        panel.add(new JButton("EXIT"));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4, 3,5,5));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel1.add(new JButton("4"));
        panel1.add(new JButton("5"));
        panel1.add(new JButton("6"));
        panel1.add(new JButton("7"));
        panel1.add(new JButton("8"));
        panel1.add(new JButton("9"));
        panel1.add(new JButton("10"));
        panel1.add(new JButton("11"));
        panel1.add(new JButton("12"));

        frame.add(panel, "North");
        frame.add(panel1, "Center");
        frame.pack();
        frame.setVisible(true);
    }
}
