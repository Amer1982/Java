package DesktopAplication.predavanje2.geek;

import DesktopAplication.predavanje2.common.ImageIconLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class geekPanel extends JPanel {

    private JCheckBox chinCheckBox;
    private JCheckBox glassesCheckBox;
    private JCheckBox hairCheckBox;
    private JCheckBox teethCheckBox;

    private JLabel pictureLabel;
    private StringBuffer choices;

    public geekPanel() {
        super(new BorderLayout());
        choices = new StringBuffer("cght");
        pictureLabel = new JLabel();
        JPanel checkBoxPanel = new JPanel(new GridLayout(0, 1));
        /*CheckBoxItemListner checkBoxItemListner = new CheckBoxItemListner();

        chinCheckBox = new JCheckBox("Chin");
        chinCheckBox.addItemListener(checkBoxItemListner);
        chinCheckBox.setSelected(true);
        glassesCheckBox = new JCheckBox("Glasses");
        glassesCheckBox.addItemListener(checkBoxItemListner);
        glassesCheckBox.setSelected(true);
        hairCheckBox = new JCheckBox("Hair");
        hairCheckBox.addItemListener(checkBoxItemListner);
        hairCheckBox.setSelected(true);
        teethCheckBox = new JCheckBox("Teeth");
        teethCheckBox.addItemListener(checkBoxItemListner);
        teethCheckBox.setSelected(true);*/

        chinCheckBox = createCheckBox("Chin",checkBoxPanel);
        glassesCheckBox = createCheckBox("Glasses",checkBoxPanel);
        hairCheckBox = createCheckBox("Hair",checkBoxPanel);
        teethCheckBox = createCheckBox("Teeth",checkBoxPanel);

        /*Treba da se kreira prije poziva
        JPanel checkBoxPanel = new JPanel(new GridLayout(0, 1));

        //Dodali funkciju createCheckBox

        checkBoxPanel.add(chinCheckBox);
        checkBoxPanel.add(glassesCheckBox);
        checkBoxPanel.add(hairCheckBox);
        checkBoxPanel.add(teethCheckBox); */

        updatePicture();
        add(checkBoxPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    private JCheckBox createCheckBox(String label, JPanel panel){
        JCheckBox checkBox = new JCheckBox(label);
        checkBox.addItemListener(new CheckBoxItemListner());
        checkBox.setSelected(true);
        panel.add(checkBox);
        return checkBox;
    }

    private void updatePicture() {
        ImageIconLoader imageIconLoader = new ImageIconLoader(geekPanel.class);
        String pictureName = "geek-" + choices + ".gif";
        ImageIcon imageIcon = imageIconLoader.load(pictureName);
        if (imageIcon != null) {
            pictureLabel.setIcon(imageIcon);
        } else {
            pictureLabel.setText("Nema slike sa imenom " + pictureName);
        }
    }

    private class CheckBoxItemListner implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            Object source = itemEvent.getSource();
            char c = '-';
            int index = 0;
            if (source == chinCheckBox) {
                index = 0;
                c = 'c';
            } else if (source == glassesCheckBox) {
                index = 1;
                c = 'g';
            } else if (source == hairCheckBox) {
                index = 2;
                c = 'h';
            } else if (source == teethCheckBox) {
                index = 3;
                c = 't';
            }
            if (itemEvent.getStateChange() == ItemEvent.DESELECTED) {
                c = '-';
            }
            choices.setCharAt(index, c);
            updatePicture();
        }
    }
}
