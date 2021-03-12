package DesktopAplication.Vjezba;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Vjezba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JFrame frame = new JFrame();
        System.out.println("Unesite naslov okvira");
        String a=sc.nextLine();
        frame.setTitle(a);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        System.out.println("Unesite dužinu");
        int i = sc.nextInt();
        System.out.println("Unesite širinu");
        int j = sc.nextInt();
        frame.setSize(i, j);
        frame.setLocation(150,100);
        frame.setBackground(Color.darkGray);
        frame.setVisible(true);
    }
}
