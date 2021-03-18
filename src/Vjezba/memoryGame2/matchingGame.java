package Vjezba.memoryGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class matchingGame implements ActionListener {
    private JFrame mainFrame;
    private Container mainContentPane;
    private ImageIcon cardIcon[];

    public matchingGame() {
        this.mainFrame = new JFrame("Matching Game");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(400, 500);
        this.mainContentPane = this.mainFrame.getContentPane();
        this.mainContentPane.setLayout(new BoxLayout(this.mainContentPane, BoxLayout.PAGE_AXIS));

        JMenuBar menuBar = new JMenuBar();
        this.mainFrame.setJMenuBar(menuBar);

        JMenu gameMenu = new JMenu("Game Menu");
        menuBar.add(gameMenu);

        newMenuItem("New Game", gameMenu, this);
        newMenuItem("Exit", gameMenu, this);

        JMenu helpMenu = new JMenu("Help");
        JMenu aboutMenu = new JMenu("About");
        menuBar.add(helpMenu);
        menuBar.add(aboutMenu);


        this.cardIcon = loadCardIcon();

    }

    private ImageIcon[] loadCardIcon() {
        ImageIcon icon[] = new ImageIcon[9];
        for (int i = 0; i < 9; i++) {
            String fileName = "src/Vjezba/memoryGame2/Prva igra/Card" + i + "jpg";
            icon[i] = new ImageIcon(fileName);
        }
        return icon;
    }

    public JPanel makeCards() {
        JPanel panel = new JPanel(new GridLayout(4, 4, 2, 2));
        ImageIcon backIcon = this.cardIcon[8];

        int cardsToAdd[] = new int[16];
        for (int i = 0; i < 8; i++) {
            cardsToAdd[2 * i] = i;
            cardsToAdd[2 * i + 1] = i;

        }

        for (int i = 0; i < cardsToAdd.length; i++) {
            int num = cardsToAdd[i];
            Card newCard = new Card(this.cardIcon[num], backIcon, num);
            panel.add(newCard);
        }
        return panel;
    }

    private void newMenuItem(String new_game, JMenu gameMenu, ActionListener listener) {
        JMenuItem newItem = new JMenuItem(new_game);
        newItem.setActionCommand(new_game);
        newItem.addActionListener(listener);
        gameMenu.add(newItem);


    }

    public void newGame() {
        this.mainContentPane.removeAll();
        this.mainContentPane.add(makeCards());
        this.mainFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("New Game"))
            newGame();

        if (actionEvent.getActionCommand().equals("Exit"))
            System.exit(0);
        ;
    }
}
