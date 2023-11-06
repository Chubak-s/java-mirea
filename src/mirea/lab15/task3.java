package mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task3 {
    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame("Menu Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание контейнера для компонентов
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2, 1));

        // Создание текстового поля
        JTextArea textArea = new JTextArea();

        // Создание кнопок
        JButton copyButton = new JButton("Копировать");
        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        JButton pasteButton = new JButton("Вставить");
        pasteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        // Создание меню и добавление пунктов
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        JMenu editMenu = new JMenu("Правка");
        JMenu helpMenu = new JMenu("Справка");

        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");

        // Добавление обработчика событий для пунктов меню
        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Сохранено");
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        cutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });

        pasteMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        // Добавление пунктов в подменю
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        // Добавление меню на панель меню
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Добавление компонентов на контейнер
        container.add(new JScrollPane(textArea));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(copyButton);
        buttonPanel.add(pasteButton);
        container.add(buttonPanel);

        // Установка панели меню на окно
        frame.setJMenuBar(menuBar);

        // Отображение окна
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
