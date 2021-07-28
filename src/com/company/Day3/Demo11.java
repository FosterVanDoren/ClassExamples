package com.company.Day3;

public class Demo11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb); //prints HelloWorld because string buffers are mutable
    }
}
