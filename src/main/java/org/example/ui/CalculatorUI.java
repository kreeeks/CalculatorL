package org.example.ui;
import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorUI();
    }
}
