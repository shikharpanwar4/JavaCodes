package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        try {
            File f = new File("C:\\My Files\\bcd.txt");
            Demo d1 = new Demo();
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream o = new ObjectOutputStream(fo);
            o.writeObject(d1);

            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream i = new ObjectInputStream(fi);
            Demo d2 = (Demo) i.readObject();
            System.out.println("i: " +d2.i +" j: " +d2.j +" k: " +d2.k +" l: " +d2.l);
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class not found");
        }
    }
}
