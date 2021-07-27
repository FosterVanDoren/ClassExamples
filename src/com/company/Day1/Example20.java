package com.company.Day1;

class Calculator {
    int a = 10;
    int b = 20;

    public Calculator() {
        System.out.println("Parameter less constructor");
    }

    public Calculator(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public void addNumber() {
        System.out.println(a + b);
    }
}

public class Example20 {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.addNumber();

        Calculator calc2 = new Calculator(100, 200);
        calc2.addNumber();
    }
}
