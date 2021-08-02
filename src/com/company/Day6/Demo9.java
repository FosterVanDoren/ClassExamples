package com.company.Day6;

 //1st way
//interface Rectangle{
//    public void draw();
//}
//
//class Test implements Rectangle{
//
//    @Override
//    public void draw() {
//        System.out.println("drawing....");
//    }
//}

interface Rectangle{
    void draw();
}

public class Demo9 {
    public static void main(String[] args) {
        //1st way
//        Test test = new Test();
//        test.draw();
        /*2nd way without the use of a lambda. (an anonymous class needs
        to be declared without the use of a lambda)*/
//        Rectangle rectangle = new Rectangle() {
//            @Override
//            public void draw() {
//                System.out.println("drawing...");
//            }
//        };
//        rectangle.draw();

        //3rd way using a lambda
        Rectangle rectangle = () -> {
            System.out.println("drawing...");
        };
        rectangle.draw();
    }
}
