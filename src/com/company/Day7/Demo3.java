package com.company.Day7;

class Calculator2<T>{
    public boolean areEqual(T a, T b){
        if(a.equals(b))
            return true;
        else
            return false;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Calculator2<Integer> cal = new Calculator2<>();

        cal.areEqual(10, 20);

        Calculator2<Character> cal2 = new Calculator2<>();
        cal2.areEqual('b', 'c');
    }
}
