package JFrame;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example1 {
    public static void main(String[] args) {
       ImageIcon img= new ImageIcon("About.jpg");

       JLabel label = new JLabel();
       label.setText("Bro do you even code.");
       label.setIcon(img);

       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       frame.setVisible(true);
       frame.add(label);
    }
}
