package mirea.lab5.task3;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Image extends JFrame{

    public Image(String path) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame(path);
                frame.setDefaultCloseOperation(3);
                BufferedImage img;
                try {
                    img = ImageIO.read(new File(path));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon(img));
                frame.getContentPane().add(label, BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        new Image(args[0]);
        //"C:\\Users\\chuba\\Downloads\\bugatti.jpg"
    }

}