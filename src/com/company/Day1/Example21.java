package com.company.Day1;

class Car {
    public String name;
    public String color;
    public String engineType;
    public int price;

    public Car(String name, String color, String engineType, int price) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
    }

    public Car(Car carObj) {
        this.name = carObj.name;
        this.color = carObj.color;
        this.engineType = carObj.engineType;
        this.price = carObj.price;
    }

    public Car(Car carObj, int price) {
        this.name = carObj.name;
        this.color = carObj.color;
        this.engineType = carObj.engineType;
        this.price = price;
    }
}

public class Example21 {
    public static void main(String[] args) {
        Car car1 = new Car("Lincoln", "Black", "Petrol", 20000);
        Car car2 = new Car(car1);
        Car car3 = new Car(car1, 40000);

    }
}
