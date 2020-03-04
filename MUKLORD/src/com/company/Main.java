package com.company;

import com.company.Car;
import com.company.SportsCar;

public class Main {

    public static void main(String[] args) {
        Car a = new Car();
        a.drive(50.0d, 5);
	    a.display();
        SportsCar b = new SportsCar();
        b.drive(60.0, 6, 7);
        b.display();
    }
}
