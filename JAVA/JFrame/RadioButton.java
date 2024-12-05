package JFrame;

import javax.swing.*;
public class RadioButton {
    JFrame f;
    RadioButton() {
        f = new JFrame();
        JRadioButton rOne = new JRadioButton("A. Male");
        JRadioButton rTwo = new JRadioButton("B. Female");
        rOne.setBounds(75, 50, 100, 30);
        rTwo.setBounds(75, 75, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rOne);
        bg.add(rTwo);
        f.add(rOne);
        f.add(rTwo);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButton();
    }
}

