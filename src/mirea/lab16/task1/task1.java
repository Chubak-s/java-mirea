package mirea.lab16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class task1 {
    private static final int MAX_ATTEMPTS = 3;
    private static final int MAX_NUMBER = 20;
    private static int randomNum;
    private static int attemptsLeft;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Угадай число");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JLabel messageLabel = new JLabel("Угадай число от 0 до 20");
        JTextField guessField = new JTextField();
        JButton guessButton = new JButton("Угадать");
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(messageLabel, BorderLayout.NORTH);
        centerPanel.add(guessField, BorderLayout.CENTER);
        centerPanel.add(guessButton, BorderLayout.SOUTH);

        frame.add(centerPanel, BorderLayout.CENTER);

        guessButton.addActionListener(e -> {
            int guess;
            try {
                guess = Integer.parseInt(guessField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Ошибка! Введите число от 0 до 20.", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (guess < 0 || guess > MAX_NUMBER) {
                JOptionPane.showMessageDialog(frame, "Ошибка! Введите число от 0 до 20.", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return;
            }

            attemptsLeft--;

            if (guess == randomNum) {
                JOptionPane.showMessageDialog(frame, "Поздравляю! Вы угадали число.", "Успех", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else if (attemptsLeft == 0) {
                JOptionPane.showMessageDialog(frame, "Вы проиграли! Правильное число: " + randomNum, "Поражение", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                String message;
                if (guess < randomNum) {
                    message = "Загаданное число больше.";
                } else {
                    message = "Загаданное число меньше.";
                }
                JOptionPane.showMessageDialog(frame, message + " У вас осталось " + attemptsLeft + " попытки.", "Неверно", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == frame.getContentPane()) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JPanel westPanel = new JPanel();
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(westPanel, BorderLayout.WEST);

        JPanel southPanel = new JPanel();
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать ЮАО", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(southPanel, BorderLayout.SOUTH);

        JPanel northPanel = new JPanel();
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(northPanel, BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(eastPanel, BorderLayout.EAST);

        frame.setVisible(true);

        randomNum = new Random().nextInt(MAX_NUMBER + 1);
        attemptsLeft = MAX_ATTEMPTS;
    }
}
