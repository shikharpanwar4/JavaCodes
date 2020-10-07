package qwerty;
import java.io.*;
import java.util.*;

public class TEST {
public static void main(String[]args) throws IOException
{
	Demo d=new Demo();
FileOutputStream f= new FileOutputStream("C:\\abc.txt");
ObjectOutputStream o=new ObjectOutputStream(f);
	o.writeObject(d);
	try
	{FileInputStream fi=new FileInputStream("C:\\abc.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	Demo d2=(Demo)oi.readObject();
	System.out.println(d2.i);
	System.out.println(d2.j);
	System.out.println(d2.k);
	System.out.println(d2.l);
	System.out.println(d2.m);
	
	}
	catch(ClassNotFoundException c)
	{
	System.out.println(c);
	}
}

}
