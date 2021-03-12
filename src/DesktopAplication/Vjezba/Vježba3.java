package DesktopAplication.Vjezba;

import javax.swing.*;
import java.awt.*;

public class Vježba3 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("No title");
        frame.setSize(780,400);
        JPanel pnl = new JPanel ();
        pnl.setLayout (new BoxLayout(pnl, BoxLayout.LINE_AXIS));
        pnl.add(new JButton("Button0"));
        pnl.add(new JButton("Button1"));
        pnl.add(new JButton("Button2"));
        pnl.add(new JButton("Button3"));
        pnl.add(new JButton("Button4"));
        pnl.add(new JButton("Button5"));
        pnl.add(new JButton("Button6"));
        pnl.add(new JButton("Button7"));
        pnl.add(new JButton("Button8"));
        pnl.add(new JButton("Button9"));
        frame.add(pnl, BorderLayout.PAGE_START);
        frame.add(new JButton("Button1"));
        //frame.pack();
        frame.setVisible(true);

    }
}
