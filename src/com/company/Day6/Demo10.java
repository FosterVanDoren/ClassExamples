package com.company.Day6;

interface Hello{
    public String greeting();
}

interface Welcome{
    public String greeting(String name);
}

interface Calculation{
    public int addNumber(int a, int b, int c);
}

interface Say{
    public void sayHello(String name);
}


public class Demo10 {
    public static void main(String[] args) {

        //lambda without parameters
        Hello hello = () -> {
            return "Welcome User";
        };

        System.out.println(hello.greeting());

        //lambda with a single parameter
        Welcome welcome = (name) -> {
            return "Welcome " + name;
        };
        System.out.println(welcome.greeting("James"));

        //lambda with multiple parameters
        Calculation calculation = (a, b, c) -> {
            return a + b  + c;
        };
        System.out.println(calculation.addNumber(10, 20, 30));

        //lambda without a return statement
        Say say = (name) -> {
            System.out.println("Hello " + name);
        };
        say.sayHello("Fredrick");
    }
}
