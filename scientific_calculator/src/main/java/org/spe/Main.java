package org.spe;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Calculator cal =new Calculator();
        int ch,num1=0,num2=0;
        Scanner sc = new Scanner(System.in);

        Main main=new Main();

        do {
            System.out.println("1.ADD");
            System.out.println("2.SUB");
            System.out.println("5.Exit");
            System.out.println("Enter choice:\t");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:System.out.println("Enter num1:\t");
                         num1 = sc.nextInt();
                        System.out.println("Enter num2:\t");
                        num2 = sc.nextInt();
                    System.out.println("Addition of two number = \t"+cal.add(num1,num2));
                    break;

                case 2:System.out.println("Enter num1:\t");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2:\t");
                    num2 = sc.nextInt();
                    System.out.println("Substraction of two number = \t"+cal.sub(num1,num2));
                    break;

                case 5:
                    System.out.println("Exiting app...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while (ch!=5);
    }



    public void getTwonumbers(int num1,int num2)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:\t");
        num1 = sc.nextInt();
        System.out.println("Enter num2:\t");
        num2 = sc.nextInt();


    }

}