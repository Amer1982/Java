package DesktopAplication.predavanje2.animals.ComboBox;

import DesktopAplication.predavanje2.animals.AnimalEnum;
import DesktopAplication.predavanje2.animals.RadioButton.AnimalPanel;
import DesktopAplication.predavanje2.common.ImageIconLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComboBoxPanel extends JPanel {

    private JLabel pictureLabel;
    private JComboBox<String> animalComboBox;


    public ComboBoxPanel() {
        super(new BorderLayout()); //Moze i  setLayout(new BorderLayout());

        pictureLabel = new JLabel();
        pictureLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pictureLabel.setHorizontalAlignment(JLabel.CENTER);

        AnimalEnum[] animals = AnimalEnum.values();

        String[] animalPictureNames = Stream.of(animals)
                //.map(animal->animal.getPictureName())
                .map(AnimalEnum::getAnimalName)
                .collect(Collectors.toList())
                .toArray(new String[animals.length]);
        /*
        //Ovaj kod kod mene ne radi s toga koristim kod iznad

        String[] animalPictureNames = Stream.of(animals)//Stream<AnimalEnum>
                .map(AnimalEnum::getAnimalName)//Stream<String>
                .collect(Collectors.toList())
                .toArray(String[]::new);*/

        animalComboBox = new JComboBox<>(animalPictureNames);
        animalComboBox.addActionListener(this::onComboBoxItemSelect);
        animalComboBox.setSelectedIndex(0);

        updatePicture();

        add(animalComboBox, BorderLayout.NORTH);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    }

    private void updatePicture() {
        ImageIconLoader imageIconLoader = new ImageIconLoader(AnimalPanel.class);
        String animalName = (String) animalComboBox.getSelectedItem();
        String pictureName = animalName + ".gif";
        ImageIcon imageIcon = imageIconLoader.load(pictureName);
        pictureLabel.setIcon(imageIcon);
    }

    public void onComboBoxItemSelect(ActionEvent actionEvent) {
        updatePicture();
    }
}
