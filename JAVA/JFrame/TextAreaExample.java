package JFrame;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Area Example");
        JTextArea area = new JTextArea("Welcome to Text Area!");
        area.setBounds(40, 50, 300, 200);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

