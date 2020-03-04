package com.company;

public class Main {

    public static void main(String[] args) throws LowSalException{
		Emp e = new Emp(23006, "Rohit", "manager", 2500);
		e.calculateHRA();
		e.printDET();
    }
}
