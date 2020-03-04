package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr [] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int sum = 0;
        int avg = 0;
        int min = arr[0];
        for(int i = 0; i <= 14; i++)
        {
            sum = sum + arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        avg = sum/15;
        arr[15] = sum;
        arr[16] = avg;
        arr[17] = min;
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);



    }
}
