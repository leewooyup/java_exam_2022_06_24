package com.example.untitled;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.maxSpeed = 100;
        c2.maxSpeed = 200;
    }
}

class Car {
    int maxSpeed;
}