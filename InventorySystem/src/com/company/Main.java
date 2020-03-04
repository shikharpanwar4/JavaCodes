package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Add product in inventory");
            System.out.println("2. Modify a product in inventory");
            System.out.println("3. Delete a product in inventory");
            System.out.println("4. Display inventory status");
            System.out.println("5. Exit");
            choice = s.nextInt();
            s.nextLine();

            switch(choice){
                case 1:{
                    System.out.println("Enter name, product number, price");
                    String name = s.nextLine();
                    int prodNum = s.nextInt();
                    int price = s.nextInt();

                    add(name, prodNum, price);
                    break;
                }
                case 2:
                case 3: {
                 break;
                }
                case 4:{
                    display();
                    break;
                }
                default:
                    break;
            }
        }while(choice!=5);
    }

    public static void add(String name, int prodNum, int price) throws IOException {
        File f = new File("C:\\My Files\\Inventory.txt");

        Inventory i = new Inventory(name, prodNum, price);
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(i);
        fo.flush();
        o.flush();
        fo.close();
        o.close();

    }

    public static void modify(int prodNum){

    }

    public static void delete(int prodNum){

    }
    public static void display() throws IOException{

            File f = new File("C:\\My Files\\Inventory.txt");
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream i = new ObjectInputStream(fi);

            System.out.println("Name \t Product Number \t Price");
            Inventory i1=null;
            boolean flag = true;
            while(flag){
                try {
                    if (fi.available() != 0) {
                        i1 = (Inventory) i.readObject();
                        System.out.println(i1.name +"\t     " +i1.prodNum +"\t\t" +i1.price);
                    }
                    else{
                        flag = false;
                    }
                    }catch (ClassNotFoundException e){

                }

            }
            fi.close();
            i.close();
    }

}
