package JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator extends JFrame {
    private JTextField textField;
    private JLabel resultLabel;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JPanel panel = new JPanel();
        JLabel inputLabel = new JLabel("Enter a number:");
        textField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        // Add components to the panel
        panel.add(inputLabel);
        panel.add(textField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        // Add panel to the frame
        add(panel);

        // Add ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
    }

    // Method to calculate factorial
    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(textField.getText());
            if (number < 0) {
                resultLabel.setText("Factorial undefined for negative numbers");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                resultLabel.setText("Factorial of " + number + " is: " + factorial);
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter an integer.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FactorialCalculator().setVisible(true);
            }
        });
    }
}

