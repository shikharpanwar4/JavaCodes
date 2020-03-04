package com.company;

public class Complex {
    private float real;
    private float imaginary;

    Complex(){
        real = 0;
        imaginary = 0;

    }
    Complex(int a, int b){
        real = a;
        imaginary = b;

    }
    Complex add(Complex b){
        Complex c = new Complex();
        c.real = real + b.real;
        c.imaginary = imaginary + b.imaginary;
        return c;
    }

    Complex subtract(Complex b){
        Complex c = new Complex();
        c.real = real - b.real;
        c.imaginary = imaginary - b.imaginary;
        return c;
    }

    String display(){
        return (real + " + " +imaginary +"i");
    }
}
