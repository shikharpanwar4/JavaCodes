package com.company;
import esg.itp.shape.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Square s = new Square(4);
        s.calcArea();
        s.calcPeri();
        s.display();
        Rectangle r = new Rectangle(3, 2);
        r.calcArea();
        r.calcPeri();
        r.display();
    }
}
