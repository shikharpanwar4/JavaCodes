package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        int sum=0;
        while(count!=9){
            boolean b = s.hasNextInt();


            if(b){
                int a = s.nextInt();
                sum+=a;
                count++;
            }else{
                System.out.println("Invalid number");
            }
            s.nextLine();

        }
        System.out.println(sum);

        s.close();
    }
}
