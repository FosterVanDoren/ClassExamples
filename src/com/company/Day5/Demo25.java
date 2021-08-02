package com.company.Day5;

public class Demo25 {
    public static void main(String[] args) {
        //converting all primitive data types into their respective wrapper classes
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 12.3f;
        double f = 12.24;
        char g = 'a';
        boolean h = true;

        //Autoboxing: converting primitives into an object
        Byte byteWrapper = a;
        Short shortWrapper = b;
        Integer intWrapper = c;
        Long longWrapper = d;
        Float floatWrapper = e;
        Double doubleWrapper = f;
        Character charWrapper = g;
        Boolean boolWrapper = h;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
        System.out.println(byteWrapper.toString() + " " + shortWrapper.toString() + " " + intWrapper.toString()
                + " " + longWrapper.toString() + " " + floatWrapper.toString()
                + " " + doubleWrapper.toString() + " " + charWrapper.toString() + " " + boolWrapper.booleanValue());

        //Unboxing: converting an object back into a primitive value
        byte byteValue = byteWrapper;
        short shortValue = shortWrapper;
        int intValue = intWrapper;
        long longValue = longWrapper;
        float floatValue = floatWrapper;
        double doubleValue = doubleWrapper;
        char charValue = charWrapper;
        boolean boolValue = boolWrapper;

        System.out.println(byteValue + " " + shortValue + " " + intValue + " " + longValue + " " + floatValue + " " + doubleValue + " " + charValue + " " + boolValue);

    }
}
