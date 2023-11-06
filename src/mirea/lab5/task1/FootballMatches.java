package mirea.lab5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatches extends JFrame {
    private int ACMilan = 0;
    private int RM = 0;
    private JButton button1 = new JButton("Real Madrid");
    private JButton button2 = new JButton("AC Milan");

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;



    public FootballMatches() {
        super("Football Match");
        this.setBounds(600, 300, 200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 2));

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        resultLabel.setVerticalAlignment(JLabel.TOP);
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        lastScorerLabel.setVerticalAlignment(JLabel.BOTTOM);
        lastScorerLabel.setHorizontalAlignment(JLabel.CENTER);

        winnerLabel.setVerticalAlignment(JLabel.BOTTOM);
        winnerLabel.setHorizontalAlignment(JLabel.CENTER);

        button1.addActionListener(new ButtonEventListener());
        button2.addActionListener(new ButtonEventListener());
        container.add(button1);
        container.add(button2);
        container.add(resultLabel);
        container.add(lastScorerLabel);
        container.add(winnerLabel);
    }

    // Обновление надписи победителя
    private void updateWinnerLabel() {
        if (ACMilan > RM) {
            winnerLabel.setText("Winner: AC Milan");
        }
        else if (ACMilan < RM) {
            winnerLabel.setText("Winner: Real Madrid");
        }
        else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                RM++;
                resultLabel.setText("Result: " + ACMilan + " X " + RM);
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateWinnerLabel();
            }
            else if (e.getSource() == button2) {
                ACMilan++;
                resultLabel.setText("Result: " + ACMilan + " X " + RM);
                lastScorerLabel.setText("Last Scorer: AC Milan");
                updateWinnerLabel();
            }
        }
    }

    public static void main(String[] args) {
        FootballMatches app = new FootballMatches();
        app.setVisible(true);
    }


}