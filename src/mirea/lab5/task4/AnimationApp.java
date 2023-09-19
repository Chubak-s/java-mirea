package mirea.lab5.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationApp extends JFrame {
    private ImageIcon[] frames;
    private JLabel animationLabel;
    private int currentFrame = 0;

    public AnimationApp() {
        setTitle("AnimationApp");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        frames = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            frames[i] = new ImageIcon("D:\\lab2\\img\\" + (i + 1) + ".png");
        }

        animationLabel = new JLabel(frames[currentFrame]);
        add(animationLabel, BorderLayout.CENTER);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        AnimationApp app = new AnimationApp();
        app.setVisible(true);
    }
}