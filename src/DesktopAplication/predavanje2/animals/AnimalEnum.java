package DesktopAplication.predavanje2.animals;

import DesktopAplication.predavanje2.common.ImageIconLoader;

import javax.swing.*;
import java.awt.event.KeyEvent;

public enum AnimalEnum {
    BIRD("Bird.gif", true, KeyEvent.VK_B),
    CAT("Cat.gif", false, KeyEvent.VK_C),
    DOG("Dog.gif", false, KeyEvent.VK_D),
    PIG("Pig.gif", false, KeyEvent.VK_P),
    RABBIT("Rabbit.gif", false, KeyEvent.VK_R);

    private String pictureName;
    private boolean defaultSelectedAnimal;
    private int mnemonic;
    private AnimalEnum(String pictureName,boolean defaultSelectedAnimal, int mnemonic){
        this.pictureName=pictureName;
        this.defaultSelectedAnimal=defaultSelectedAnimal;
        this.mnemonic=mnemonic;
    }
    public String getPictureName(){
        return pictureName;
    }
    public String getAnimalName(){
        String animalName = pictureName.substring(0, pictureName.length()-4);
        return animalName;
    }

    public boolean isDefaultSelectedAnimal() {
        return defaultSelectedAnimal;
    }

    public int getMnemonic() {
        return mnemonic;
    }
    public ImageIcon loadImage(){
        ImageIconLoader imageIconLoader = new ImageIconLoader(AnimalPanel.class);
        ImageIcon imageIcon=imageIconLoader.load(pictureName);
        return imageIcon;
    }
}
