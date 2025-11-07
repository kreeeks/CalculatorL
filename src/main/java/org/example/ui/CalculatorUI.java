package org.example.ui;
import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));
        setVisible(true);
        setLocationRelativeTo(null);

        JTextField display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("arial", Font.BOLD,32));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display,borderLayout.NORTH);

        Jpanel panel = new Jpanel();
        panel.setLayout(new GridLayout(4,4,5,5));
        String[] buttons={
                "7","8","9","C",
                "4","5","6","+",
                "1","2","3","-",
                "0","=","*","/",
        };
        for (String text : labels){
            Jlabel lbl = new Jlabel(text,SwingConstants.Center);
            lbl.setFont(new Font("Arial", Font.BOLD,22));
            lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(lbl);
        }



    }


    public static void main(String[] args) {
        new CalculatorUI();
    }
}
