package mirea.lab15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task4 {
    private static double currentValue = 0;
    private static String pendingOperation = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        JButton[] buttons = new JButton[16];

        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3",
                "-", "0", ".", "=", "+"};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
        }

        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonText = button.getText();
                    String currentText = textField.getText();

                    switch (buttonText) {
                        case "+":
                            currentValue = Double.parseDouble(currentText);
                            pendingOperation = "+";
                            textField.setText("");
                            break;
                        case "-":
                            currentValue = Double.parseDouble(currentText);
                            pendingOperation = "-";
                            textField.setText("");
                            break;
                        case "*":
                            currentValue = Double.parseDouble(currentText);
                            pendingOperation = "*";
                            textField.setText("");
                            break;
                        case "/":
                            currentValue = Double.parseDouble(currentText);
                            pendingOperation = "/";
                            textField.setText("");
                            break;
                        case "=":
                            double secondOperand = Double.parseDouble(currentText);
                            double result = 0;

                            switch (pendingOperation) {
                                case "+":
                                    result = currentValue + secondOperand;
                                    break;
                                case "-":
                                    result = currentValue - secondOperand;
                                    break;
                                case "*":
                                    result = currentValue * secondOperand;
                                    break;
                                case "/":
                                    result = currentValue / secondOperand;
                                    break;
                            }

                            currentValue = result;
                            textField.setText(String.valueOf(result));
                            break;
                        default:
                            currentText += buttonText;
                            textField.setText(currentText);
                            break;
                    }
                }
            });
        }

        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}