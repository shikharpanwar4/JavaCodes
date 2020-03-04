package com.company;

public class SportsCar extends com.company.Car {
    String airbaloon;

    public void drive(double speed, int noOfGear, String airbaloon){
        super.drive(speed, noOfGear);
        this.airbaloon = airbaloon;
    }
    public void display(){
        super.display();
        System.out.println("Airbaloon Type: " +this.airbaloon);
    }
}
