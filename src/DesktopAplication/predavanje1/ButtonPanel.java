package DesktopAplication.predavanje1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {
    private JButton leftButton;
    private JButton middleButton;
    private JButton rightButton;

    public ButtonPanel() {
        ButtonActionListner buttonActionListner = new ButtonActionListner();
        ImageIconLoader imageIconLoader=new ImageIconLoader();

        this.leftButton = new JButton("Disable middle button");
        this.leftButton.setToolTipText("Ovo je moj lijevi dugmić");
        this.leftButton.setActionCommand("Disable");
        this.leftButton.setMnemonic(KeyEvent.VK_D);
        ImageIcon rightIcon = imageIconLoader.load("right.gif");
        this.leftButton.addActionListener(buttonActionListner);
        this.leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
        this.leftButton.setVerticalTextPosition(SwingConstants.CENTER);
        this.leftButton.setIcon(rightIcon);


        this.middleButton = new JButton("Victim");
        this.middleButton.setToolTipText("Ovo je žrtva");
        ImageIcon middleIcon = imageIconLoader.load("middle.gif");
        this.middleButton.setHorizontalTextPosition(SwingConstants.CENTER);
        this.middleButton.setVerticalTextPosition(SwingConstants.TOP);
        this.middleButton.setIcon(middleIcon);


        this.rightButton = new JButton("Enable middle button");
        this.rightButton.setToolTipText("Ovo je moj desni dugmić");
        this.rightButton.setActionCommand("Enable");
        this.rightButton.setMnemonic(KeyEvent.VK_E);
        ImageIcon leftIcon = imageIconLoader.load("left.gif");
        this.rightButton.addActionListener(buttonActionListner);
        this.rightButton.setIcon(leftIcon);


        add(leftButton);
        add(middleButton);
        add(rightButton);
    }

    private class ButtonActionListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Da li se ovo izvršava");
            if ("Disable".equals(actionEvent.getActionCommand())) {
                middleButton.setEnabled(false);
            } else {
                middleButton.setEnabled(true);
            }
        }
    }

    private class ImageIconLoader {

        public ImageIcon load(String path) {
            URL Imageurl = ButtonPanel.class.getResource(path);
            if (Imageurl != null) {
                ImageIcon imageIcon = new ImageIcon(Imageurl);
                return imageIcon;
            }else {
                System.err.println("Nema ti slike na ovoj putanji"+path);
                return null;
            }
        }
    }
}
