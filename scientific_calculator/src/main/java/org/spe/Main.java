package org.spe;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

public static void main(String[] args) {

        Calculator cal =new Calculator();
        int ch,num1=0,num2=0,ansi;
        double ansd;
        Scanner sc = new Scanner(System.in);

        Main main=new Main();

        do {
            System.out.println("1.Square Root");
            System.out.println("2.Factorial");
            System.out.println("3.Natural Logarithm");
            System.out.println("4.Power");
            System.out.println("5.Exit");
            System.out.println("Enter choice:\t");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:System.out.println("Enter num1:\t");
                         num1 = sc.nextInt();
                         ansd = cal.squareRoot(num1);
                         if(ansd==-1) System.out.println("Invalid number entered");
                         else System.out.println("Square Root of "+ num1+"= " +ansd);
                    break;

                case 2:System.out.println("Enter num1:\t");
                    num1 = sc.nextInt();
                    ansi = cal.factorial(num1);
                    if(ansi==-1) System.out.println("Invalid number entered");
                    else System.out.println("Factorial of "+ num1+" = "+ansi );
                    break;
                case 3:System.out.println("Enter num1:\t");
                    num1 = sc.nextInt();
                    ansd = cal.naturalLogarithm(num1);
                    if(ansd==-1) System.out.println("Invalid number entered");
                    else System.out.println("Natural Logarithm of "+ num1+" = "+ansd );
                    break;
                case 4:System.out.println("Enter num1:\t");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2:\t");
                    num2 = sc.nextInt();
                    ansd = cal.power(num1,num2);
                    System.out.println("power  = "+ansd );
                    break;

                case 5:
                    System.out.println("Exiting app...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while (ch!=5);
    }

}
