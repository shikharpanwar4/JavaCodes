package com.company;

public class Main {

    public static void main(String[] args) {


        int n = 8;
        for (int i=0; i<8; i++)
        {
            Mythread t = new Mythread();
            t.start();
        }

    }
}
