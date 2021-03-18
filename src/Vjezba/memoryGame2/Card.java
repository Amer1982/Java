package Vjezba.memoryGame2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Card extends JLabel implements MouseListener {
    Icon faceIcon;
    Icon backIcon;
    boolean faceUp = false;
    int num;
    int iconWidthHalf, iconHeightHalf;
    boolean mousePressedOnMe = false;

    public Card(Icon face, Icon back, int num) {
        super(back);
        this.faceIcon = face;
        this.backIcon = back;
        this.num = num;
//za pracenje klika misem
        this.addMouseListener((MouseListener) this);
        this.iconHeightHalf = back.getIconHeight() / 2;
        this.iconWidthHalf = face.getIconWidth() / 2;
    }

    public int getNum() {
        return num;
    }

    private boolean overIcon(int x, int y) {
        int distX = Math.abs(x - (this.getWidth() / 2));
        int distY = Math.abs(y - (this.getHeight() / 2));
        if (distX > this.iconHeightHalf || distY > this.iconWidthHalf)
            return false;
        return true;
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (overIcon(mouseEvent.getX(), mouseEvent.getY())) this.turnUp();
    }

    public void turnUp() {
        if (this.faceUp) return;
        this.faceUp=true;
        if (this.faceUp) this.setIcon(this.faceIcon);
    }

    public void turnDown() {
        if (!this.faceUp) return;
        this.setIcon(this.backIcon);
        this.faceUp = false;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (overIcon(mouseEvent.getX(), mouseEvent.getY()))
            this.mousePressedOnMe = true;
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        if (this.mousePressedOnMe) {
            this.mousePressedOnMe = false;
            this.mouseClicked(event);
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.mousePressedOnMe = false;
    }
}
