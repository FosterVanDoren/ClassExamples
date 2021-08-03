package com.company.Day7;

class GenericMethodDemo{
    public static <E> void printArray(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }
        System.out.println("************************");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"Hello", "My", "Name", "Is", "Blank"};
        Boolean[] booleanArray = {true, false};

        GenericMethodDemo.printArray(intArray);
        GenericMethodDemo.printArray(charArray);
        GenericMethodDemo.printArray(stringArray);
        GenericMethodDemo.printArray(booleanArray);
    }
}
