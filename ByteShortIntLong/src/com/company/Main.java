package com.company;

public class Main {

    public static void main(String[] args) {
	    int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMinIntValue +" " +myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println(myMinshortValue);
        System.out.println(myMaxshortValue);

        long myLongValue = 100L;

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println(myMinlongValue);
        System.out.println(myMaxlongValue);

        byte n = (byte)(myMinByteValue/2);
        byte a = 55;
        short b = 257;
        int c = 100000;
        long d = 50000L + 10L*(a+b+c);
    }
}
