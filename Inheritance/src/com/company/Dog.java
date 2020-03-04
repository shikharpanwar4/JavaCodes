package com.company;

public class Dog extends Animal {
    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;

    }
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
}
