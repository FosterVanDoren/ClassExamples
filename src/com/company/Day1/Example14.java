package com.company.Day1;

public class Example14 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            if(i == 5){
               continue;
               //this will skip the statement that meets this condition.
            }
            System.out.println(i);
        }
    }
}
