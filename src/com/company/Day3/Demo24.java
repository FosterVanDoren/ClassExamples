package com.company.Day3;

public class Demo24 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws Exception {
        doSomethingElse();
    }

    private static void doSomethingElse() throws Exception {
        doSomethingElseAgain();
    }

    private static void doSomethingElseAgain() throws Exception {
        throw new Exception();
    }
}
