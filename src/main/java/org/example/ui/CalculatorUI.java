package org.example.ui;
import javax.swing.*;
import java.awt.*;

import org.example.prosthesi;
import org.example.subtract;
import org.example.pollaplasiasmos;
import org.example.division;

public class CalculatorUI extends JFrame {


    private JTextField display;
    private double firstNumber = 0;
    private String operation = null;
    private boolean startNewNumber = true;

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
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD,22));
            btn.addActionListener(e -> {
                String current = display.getText();
                if(text.equals("C")){
                    firstNumber = 0;
                    operation = null;
                    display.setText("0");
                } else if (text.equals("=")){


                    // εδω θα βαλουμε τι κανει στο = καθε πραξη κλπ

                  if (operation != null && !startNewNumber){
                        double second = Double.parseDouble(current);
                       double result;

                    if (operation != null && !startNewNumber) {

                        String[] parts = current.split("[+\\-*/]");
                        if (parts.length < 2) return;

                       // double second = Double.parseDouble(parts[1]);

                        //double result;

                        if (operation.equals("+")) {
                            result = new prosthesi().calculate(firstNumber, second);
                        } else if (operation.equals("-")) {
                            result = new subtract().calculate(firstNumber, second);
                        } else if (operation.equals("*")) {
                            result = new pollaplasiasmos().calculate(firstNumber, second);
                        } else if (operation.equals("/")) {
                            if (second == 0) {
                                display.setText("Error");
                                operation = null;
                                startNewNumber = true;
                                return;
                            }
                            result = new division().calculate(firstNumber, second);
                            } else {
                                result = 0;
                            }
                        } else {
                            result = 0;
                        }

                        display.setText(current + "=" + result);
                        operation = null;
                        startNewNumber = true;
                    }

                }
                else if (text.matches("[+\\-*/]")) {
                    if("Error".equals(current)) current="0";

                    firstNumber = Double.parseDouble(current.replaceAll("[^0-9.\\-]",""));
                    operation = text;
                    display.setText(current + text);
                    startNewNumber = false;

            }
                else {
                    if (startNewNumber || "0".equals(current) || "Error".equals(current)) {
                        display.setText(text);
                        startNewNumber = false;
                    }
                    else{
                    if (current.equals("0")){
                      display.setText(text);}
                    else{
                            display.setText(current + text);
                        }
                }
                }
            });




            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(CalculatorUI::new);
    }
}
