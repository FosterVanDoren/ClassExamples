package com.company.Day1;

class Parent {
    public Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child constructor called");
    }
}

public class Example23 {
    public static void main(String[] args) {
        //Parent p = new Parent();
        Child c = new Child();
    }
}
