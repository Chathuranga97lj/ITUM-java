package com.itum;

public class Vehicle {
    String modelYear = "2000";
    String brand = "Toyota";

    public void  checkEngine(){
        System.out.println("Engine is running");
    }

}

class Car extends Vehicle{
    String modelYear = "2010";
    String brand = "Honda";

    public Car(){
        super(); // immedatly call the super class // this dont need wirte. its alrady work automatically
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.checkEngine();
        System.out.println("Model Year: " + myCar.modelYear + "Brand: " + myCar.brand);
    }

}