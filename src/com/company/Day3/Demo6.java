package com.company.Day3;

public class Demo6 {
    public static void main(String[] args) {

        String str = "Hello" + " World";
        System.out.println(str); //prints Hello World

        String str2 = 10 + 20 +"Sum" + 30 + 40 + "Sum" + 50; //prints 30Sum3040Sum50
        System.out.println(str2);

        //The statement below runs in the background when working with strings in this example
        //String str2 = (new StringBuilder()).append("Hello").append("World").toString()
    }
}
