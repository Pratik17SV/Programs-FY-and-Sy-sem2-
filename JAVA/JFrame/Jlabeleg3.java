package JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jlabeleg3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel l = new JLabel("Enter the Name:");
        l.setBounds(10,100,100,30);
        JTextField t = new JTextField("Hello java");
        t.setBounds(10,150,100,30);
        f.setVisible(true); 
        f.setSize(300, 300);
        f.add(t);
        f.add(l);
        f.setLayout(null);
    }
}
