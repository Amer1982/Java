package DesktopAplication.predavanje2.animals;

import DesktopAplication.predavanje2.common.ImageIconLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AnimalPanel extends JPanel {

    private JLabel pictureLabel;

    public AnimalPanel() {
        super(new BorderLayout());
        pictureLabel = new JLabel();

        /*JRadioButton birdRadioButton = new JRadioButton(AnimalEnum.BIRD.getAnimalName());
        birdRadioButton.setMnemonic(AnimalEnum.BIRD.getMnemonic());
        birdRadioButton.setActionCommand(AnimalEnum.BIRD.getPictureName());*/ //Umjesto ovoga kucamo...


        GridLayout gridLayout = new GridLayout(0, 1);
        JPanel radioButtonPanel = new JPanel(gridLayout);
        ButtonGroup buttonGroup = new ButtonGroup();

        AnimalEnum[] animalEnums = AnimalEnum.values();
        //Ovo je jedan nacin za poziv Listnera
        // RadioButtonActionListner radioButtonActionListner=new RadioButtonActionListner();
        for (AnimalEnum animalEnum : animalEnums) {
            JRadioButton radioButton = new JRadioButton(animalEnum.getAnimalName());
            radioButton.setMnemonic(animalEnum.getMnemonic());
            radioButton.setActionCommand(animalEnum.getPictureName());
            radioButton.setSelected(animalEnum.isDefaultSelectedAnimal());
            buttonGroup.add(radioButton);
            if (animalEnum.isDefaultSelectedAnimal()){
                ImageIcon imageIcon=animalEnum.loadImage();
                pictureLabel.setIcon(imageIcon);
            }
            radioButton.addActionListener(this::onRadioButtonClick);
            //radioButton.addActionListener((e)->onRadioButtonClick(e));
            //radioButton.addActionListener(radioButtonActionListner);
            radioButtonPanel.add(radioButton);
        }
        add(radioButtonPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

    }
    /*
    //Ovo je jedan nacin za kreiranje Listnera

    private class RadioButtonActionListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String pictureName = actionEvent.getActionCommand();
            ImageIconLoader imageIconLoader= new ImageIconLoader(AnimalPanel.class);
            ImageIcon imageIcon = imageIconLoader.load(pictureName);
            pictureLabel.setIcon(imageIcon);
        }
    }*/
    //Ovo je drugi nacin

    public void onRadioButtonClick(ActionEvent actionEvent) {
        String pictureName = actionEvent.getActionCommand();
        ImageIconLoader imageIconLoader = new ImageIconLoader(AnimalPanel.class);
        ImageIcon imageIcon = imageIconLoader.load(pictureName);
        pictureLabel.setIcon(imageIcon);
    }
}
