package Vjezba.memoryGame2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class cardController implements ActionListener {

    private Vector turnedCards;
    private Timer turnDownTimer;

    public cardController() {
        this.turnedCards = new Vector(2);
        int turnDownDelay = 2000;
        this.turnDownTimer = new Timer(turnDownDelay, this);
        this.turnDownTimer.setRepeats(false);

    }

    public boolean turnUp(Card card) {
        if (this.turnedCards.size() < 2)
            return addCard(card);
        return false;
    }

    private boolean addCard(Card card) {
        this.turnedCards.add(card);
        if (this.turnedCards.size() == 2) {
            Card otherCard = (Card) this.turnedCards.get(0);
            if (otherCard.getNum() == card.getNum())
                this.turnedCards.clear();
            else this.turnDownTimer.start();
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for (Object turnedCard : this.turnedCards) {
            Card card = (Card) turnedCard;
            card.turnDown();
        }
        this.turnedCards.clear();
    }

}
