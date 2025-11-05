package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print( "ΔΩΣΕ ΠΡΩΤΟ ΑΡΙΘΜΟ" );
        double num1 = scanner.nextDouble();
        System.out.print("ΔΩΣΕ ΠΡΑΞΗ (+,-,/,*) ");
        String operation = scanner.next();
        System.out.print("ΔΩΣΕ ΔΕΥΤΕΡΟ ΑΡΙΘΜΟ");
        double num2 = scanner.nextDouble();
        scanner.close();

        if (operation.equals("+")) {
            prosthesi a=new prosthesi();
            System.out.print(a.calculate(num1,num2) );

        }
        else if (operation.equals("-")) {

        }
        else if (operation.equals("*")) {

        }
        else if (operation.equals("/")) {

        }
        else {
            System.out.print("ΑΓΝΩΣΤΗ ΠΡΑΞΗ ");
        }

    }
}
