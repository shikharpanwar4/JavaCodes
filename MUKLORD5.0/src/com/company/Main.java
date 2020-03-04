package com.company;

public class Main {

    public static void main(String[] args) {
	    Complex a = new Complex(2, 5);
	    Complex b = new Complex(1, 3);

	    Complex c = new Complex();
	    c = a.add(b);
		System.out.println(a.display() +" + " +b.display() +" = " +c.display());
		Complex d = new Complex();
		d = a.subtract(b);
		System.out.println(a.display() +" - " +b.display() +" = " +d.display());
    }
}
