package com.company.Day3;

/**
 * ArrayIndexOutOfBoundsException
 * <p>
 * Throwable -> Exception -> RuntimeException -> IndexOutOfBounds
 */


public class Demo25 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;


        try {
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index is out of bounds");
        }
    }
}
