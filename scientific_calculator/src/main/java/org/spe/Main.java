package org.spe;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Calculator cal =new Calculator();
        int ch,ansi;
        float num1=0,num2=0;
        double ansd;
        Scanner sc = new Scanner(System.in);


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
                case 1:System.out.print("Enter number:\t");
                         num1 = sc.nextFloat(); 
                         ansd = cal.squareRoot(num1);
                         if(ansd==-1) System.out.println("Invalid number entered");
                         else System.out.println("Square Root of "+ num1+"= " +ansd);
                    break;

                case 2:System.out.println("Enter number:\t");
                    int n = sc.nextInt();
                    ansi = cal.factorial(n);
                    if(ansi==-1) System.out.println("Invalid number entered");
                    else System.out.println("Factorial of "+ n+" = "+ansi );
                    break;
                case 3:System.out.print("Enter number:\t");
                    num1 = sc.nextFloat(); 
                    ansd = cal.naturalLogarithm(num1);
                    if(ansd==-1) System.out.println("Invalid number entered");
                    else System.out.println("Natural Logarithm of "+ num1+" = "+ansd );
                    break;
                case 4:System.out.print("Enter base:\t");
                    num1 = sc.nextFloat(); 
                    System.out.println("Enter power:\t");
                    num2 = sc.nextFloat(); 
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
