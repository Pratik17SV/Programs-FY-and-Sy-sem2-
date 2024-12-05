package JFrame;

import javax.swing.*;
import java.awt.event.*;
public class RadioButtonAL extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JButton b;
    RadioButtonAL() {
        rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 50, 100, 30);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        b = new JButton("Click me!");
        b.setBounds(100, 150, 100, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(400,  250);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You selected Male.");
        }
        if(rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You selected Female.");
        }
    }
    public static void main(String[] args) {
        new RadioButtonAL();
    }
}

