package Ques_4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    //static int cnt = 0;
    public static void main(String[] args) {
        JFrame fr = new JFrame("Run");
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(250, 100);

        JLabel label = new JLabel();
        JButton button = new JButton("Click");

        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        fr.add(label);
        fr.add(button);


        button.addActionListener(new ActionListener() {
            int cnt = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                cnt++;
                if (cnt == 1) {
                    label.setText("3...");
                }
                if (cnt == 2) {
                    label.setText("2...");
                }
                if (cnt == 3) {
                    label.setText("1...");
                }
                if (cnt == 4) {
                    label.setText("GO!");
                }
            }
        });
    }
}
