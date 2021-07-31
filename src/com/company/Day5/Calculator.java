package com.company.Day5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter 0 if you wish to quit");
            System.out.println("Please enter a number.");
            int number1 = scan.nextInt();

            if (number1 == 0) {
                flag = false;
                System.out.println("Goodbye");
            } else {


                System.out.println("Please enter another number.");
                int number2 = scan.nextInt();

                if (number2 == 0) {
                    flag = false;
                    System.out.println("Goodbye");
                } else {

                    System.out.println("Please select a mathematical operation.");
                    System.out.println("1.Addition\n" + "2.Subtraction\n" + "3.Multiplication\n" + "4.Division");

                    switch (scan.nextInt()) {
                        case 0:
                            flag = false;
                            System.out.println("Goodbye");
                            break;
                        case 1:
                            int addition = number1 + number2;
                            System.out.println(addition);
                            break;
                        case 2:
                            int subtraction = number1 - number2;
                            System.out.println(subtraction);
                            break;
                        case 3:
                            int multiplication = number1 * number2;
                            System.out.println(multiplication);
                            break;
                        case 4:
                            int division = number1 / number2;
                            System.out.println(division);
                            break;
                        default:
                            System.out.println("That is not one of the listed options");
                            System.out.println("1.Addition\n" + "2.Subtraction\n" + "3.Multiplication\n" + "4.Division");
                    }
                }
            }
        }
    }
}
