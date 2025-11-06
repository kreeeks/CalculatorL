package org.example;

public class division {
    double calculate(double num1, double num2) {
        if (num2==0){
            System.out.println("δεν επιτρεπετα!διαιρεση με μηδεν");
            return 0;
        }
        return num1 / num2;
    }
}
