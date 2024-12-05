package JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jlabelex2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Field Eexample");
        JTextField t1,t2;
        t1 = new JTextField("Welcom to Java");
        t1.setBounds(10,100,200,30);
        t2 = new JTextField("Pratik");
        t2.setBounds(10,150,200,30);
        f.add(t1);
        f.add(t2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
