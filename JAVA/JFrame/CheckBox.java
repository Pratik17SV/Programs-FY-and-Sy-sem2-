package JFrame;

import javax.swing.*;
public class CheckBox {
    CheckBox() {
        JFrame f = new JFrame("Check Box Example");
        JCheckBox checkBoxOne = new JCheckBox("Java");
        checkBoxOne.setBounds(100, 100, 250, 50);
        JCheckBox checkBoxTwo = new JCheckBox("Web(HTML)");
        checkBoxTwo.setBounds(100, 150, 350, 50);
        f.add(checkBoxOne);
        f.add(checkBoxTwo);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBox();
    }
}
