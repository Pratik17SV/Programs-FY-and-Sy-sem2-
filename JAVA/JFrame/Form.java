package JFrame;

import javax.swing.*;
public class Form
{
    public static void main(String args[])
    {
        JFrame f = new JFrame ("Form");
        JLabel l1 = new JLabel("Name: ");
        l1.setBounds(50,50,100,30);
        JTextField t1 = new JTextField();
        t1.setBounds(150,50,100,30);
        JLabel l2 = new JLabel("Address: ");
        l2.setBounds(50,100,100,60);
        JTextArea a1 = new JTextArea();
        a1.setBounds(150,100,100,30);
        JLabel l3 = new JLabel("Username: ");
        l3.setBounds(50,150,100,30);
        JTextField t2 = new JTextField();
        t2.setBounds(150,150,100,30);
        JLabel l4 = new JLabel("Password: ");
        l4.setBounds(50,200,100,30);
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(150,200,100,30);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(a1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(p1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
