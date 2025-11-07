package org.example.ui;
import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));


        JTextField display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("arial", Font.BOLD,32));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));
        String[] labels={
                "7","8","9","C",
                "4","5","6","+",
                "1","2","3","-",
                "0","=","*","/",
        };
        for (String text : labels){
            JLabel lbl = new JLabel(text,SwingConstants.CENTER);
            lbl.setFont(new Font("Arial", Font.BOLD,22));
            lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(lbl);
        }
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(CalculatorUI::new);
    }
}
