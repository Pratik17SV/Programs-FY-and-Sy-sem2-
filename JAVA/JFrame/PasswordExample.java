package JFrame;

import javax.swing.*;

public class PasswordExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Example");
        JPasswordField password = new JPasswordField();
        JLabel l1 = new JLabel("Password");
        l1.setBounds(20, 100, 80, 30);
        password.setBounds(100, 100, 100, 30);
        f.add(l1);
        f.add(password);
        f.setSize(350, 350);
        f.setLayout(null);
        f.setVisible(true);
    }
}
