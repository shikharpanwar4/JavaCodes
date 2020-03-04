package com.company;
public class Car {
    double speed;
    int noOfGear;

    public void drive(double speed, int noOfGear){
        this.speed = speed;
        this.noOfGear = noOfGear;
    }
    public void display(){
        System.out.println("Speed: " +this.speed);
        System.out.println("No of gears: " +this.noOfGear);
    }
}
