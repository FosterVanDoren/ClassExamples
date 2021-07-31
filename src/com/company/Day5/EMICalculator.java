package com.company.Day5;

import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Enter 0 if you wish to quit");
            System.out.println("Please enter loan amount");
            double loanAmount = scan.nextDouble();

            if(loanAmount == 0){
                flag = false;
                System.out.println("Goodbye");
            }else{
                System.out.println("Please enter ROI");
                double roi = scan.nextDouble();

                if(roi == 0){
                    flag = false;
                    System.out.println("Goodbye");
                }else{
                    roi =roi /(12 * 100);

                    System.out.println("Please enter tenure in years");
                    double  tenure = scan.nextDouble();

                    if(tenure==0){
                        flag = false;
                        System.out.println("Goodbye");
                    }else {
                        tenure = tenure * 12;

                        double emi = ((loanAmount * roi) * Math.pow(1 + roi, tenure))  / (Math.pow(1 + roi, tenure)- 1);
                        System.out.println("Your monthly EMI is: " +emi);
                    }
                }

            }
        }

    }
}
