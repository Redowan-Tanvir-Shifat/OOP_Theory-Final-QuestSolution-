package Ques_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {
    JFrame jFrame = new JFrame("Calculator");
    JButton button_add = new JButton("Add");
    JButton button_sub = new JButton("Subtract");
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        int c = 0;
        if (e.getSource() == button_add) {
            c = a+b;
            textField3.setText(String.valueOf(c));
        } else if (e.getSource() == button_sub) {
            c = a-b;
            textField3.setText(String.valueOf(c));
        }
    }
    public Gui() {
        jFrame.setBounds(100,100,500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textField1.setBounds(50, 100, 150, 50);
        textField2.setBounds(300, 100, 150, 50);
        textField3.setBounds(170, 300, 150, 50);
        button_add.setBounds(50, 200, 150, 50);
        button_sub.setBounds(300, 200, 150, 50);
        jFrame.add(button_add);
        jFrame.add(button_sub);
        jFrame.add(textField1);
        jFrame.add(textField2);
        jFrame.add(textField3);
        button_add.addActionListener(this);
        button_sub.addActionListener(this);
    }
}
class Main{
    public static void main(String[] args) {
        new Gui();
    }
}
