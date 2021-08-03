package com.company.Day7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing a rectangle...");
    }
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing a circle");
    }
}

class Cone{
    void draw(){
        System.out.println("drawing a cone...");
    }
}

class Test{
    /*the wild card (?) will allow us to create a method
    that will only accept child classes of the Shape class
     */
    public static void drawShape(List<? extends Shape> list){
        for(Shape shape: list){
            shape.draw(); //calling the method of the shape class from the child class instance
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Test.drawShape(rectangleList);
        Test.drawShape(circleList);
        //Test.drawShape(coneList);
        //throws a compile-time error because the Cone class is not a child of the Shape class
    }
}
