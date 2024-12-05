package JFrame;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class fac {
    public static void main(String[] args) {
        JFrame f = new JFrame("Factorial");
        JLabel l1 = new JLabel("Enter the number:");
        l1.setBounds(50,50,100,30);
        JTextField t1 = new JTextField();
        JButton b = new JButton("Result");
        JLabel result = new JLabel();
        b.addActionListener();
        f.add(result);
        f.add(b);
        f.add(t1);
        f.add(l1);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,300);
    }
    public void actionPerformed()
    {
        Calculatefac();
    }
    public void Calculatefac(){
        int number = Integer.parseInt(t1.getText());
            
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                result.setText("Factorial of " + number + " is: " + factorial);
            }
    }
}
