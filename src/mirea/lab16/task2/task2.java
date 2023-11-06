package mirea.lab16.task2;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame {
    private JTextArea textArea;

    public task2() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        add(new JScrollPane(textArea));

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        colorMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                JMenu menu = (JMenu) e.getSource();
                menu.removeAll();

                JMenuItem blueItem = new JMenuItem("Синий");
                blueItem.addActionListener(new ColorActionListener(Color.BLUE));
                menu.add(blueItem);

                JMenuItem redItem = new JMenuItem("Красный");
                redItem.addActionListener(new ColorActionListener(Color.RED));
                menu.add(redItem);

                JMenuItem blackItem = new JMenuItem("Черный");
                blackItem.addActionListener(new ColorActionListener(Color.BLACK));
                menu.add(blackItem);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });
        menuBar.add(colorMenu);

        JMenu fontMenu = new JMenu("Шрифт");
        fontMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                JMenu menu = (JMenu) e.getSource();
                menu.removeAll();

                JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
                timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
                menu.add(timesNewRomanItem);

                JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
                msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
                menu.add(msSansSerifItem);

                JMenuItem courierNewItem = new JMenuItem("Courier New");
                courierNewItem.addActionListener(new FontActionListener("Courier New"));
                menu.add(courierNewItem);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            task2 textEditor = new task2();
            textEditor.setVisible(true);
        });
    }

    private class ColorActionListener implements ActionListener {
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(fontName, Font.PLAIN, 12));
        }
    }
}