package mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 {
    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame("Menu Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание ComboBox
        JComboBox<String> menuComboBox = new JComboBox<>();
        menuComboBox.addItem("Italy");
        menuComboBox.addItem("France");
        menuComboBox.addItem("Spain");
        menuComboBox.addItem("Greece");
        menuComboBox.addItem("Germany");
        menuComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Получение выбранного элемента ComboBox
                String country = (String) menuComboBox.getSelectedItem();
                // Вывод информации о выбранной стране
                JOptionPane.showMessageDialog(frame, "Выбрана страна: " + country);
            }
        });

        // Добавление ComboBox на панель
        JPanel panel = new JPanel();
        panel.add(menuComboBox);

        // Добавление панели на окно
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Отображение окна
        frame.pack();
        frame.setVisible(true);
    }
}