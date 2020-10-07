package qwerty;
import java.io.*;
import java.util.*;

class  Inventory
{
    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;
    public static void main(String[] args) throws IOException
    {
           DataOutputStream dos = new DataOutputStream(
                          new FileOutputStream("Invent.txt"));
           System.out.print("Enter code number : ");
           System.out.flush();
           st = new StringTokenizer(din.readLine());
           int code = Integer.parseInt(st.nextToken());

           System.out.print("Enter Item : ");
           System.out.flush();
           st =new StringTokenizer(din.readLine());
           int item = Integer.parseInt(st.nextToken());

           System.out.print("Enter Cost of Item : ");
           System.out.flush();
           st =new StringTokenizer(din.readLine());
           double cost = new Double(st.nextToken()).doubleValue();

           //Writing to the file Invent.txt
           dos.writeInt(code);
           dos.writeInt(item);
           dos.writeDouble(cost);
           dos.close();
           
           //processing data from the file
           DataInputStream dis = new DataInputStream( new 
                      FileInputStream("Invent.txt"));
           int codeNumber = dis.readInt();
           int  totalItems = dis.readInt();
           double itemCost = dis.readDouble();
           double totalCost = totalItems * itemCost;

           //Writing to Console
           System.out.println("\nCode Number : " + codeNumber);
           System.out.println("Item cost          : " + itemCost);
           System.out.println("Total Items       : " + totalItems);
           System.out.println("Total Cost         : " + totalCost);
    }
}


