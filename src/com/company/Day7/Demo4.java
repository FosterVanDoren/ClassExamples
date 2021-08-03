package com.company.Day7;

class GenericDemo<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class Demo4 {
    public static void main(String[] args) {

        GenericDemo<Integer> genericDemo = new GenericDemo<>();
        genericDemo.setObj(10);
        System.out.println(genericDemo.getObj());

        GenericDemo<String> genericStringDemo = new GenericDemo<>();
        genericStringDemo.setObj("Hello");
        System.out.println(genericStringDemo.getObj());

        GenericDemo<Character> characterGenericDemo = new GenericDemo<>();
        characterGenericDemo.setObj('B');
        System.out.println(characterGenericDemo.getObj());

        GenericDemo<Boolean> booleanGenericDemo = new GenericDemo<>();
        booleanGenericDemo.setObj(true);
        System.out.println(booleanGenericDemo.getObj());
    }
}
