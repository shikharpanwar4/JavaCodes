package qwerty;
import java.io.*;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int length1 = s.nextInt();
		int breadth1 = s.nextInt();
		int length2 = s.nextInt();
		int breadth2 = s.nextInt();
		Rectangle rec1 = new Rectangle(length1, breadth1);
		Rectangle rec2 = new Rectangle(length2, breadth2);
		rec1.PrintRectangle();
		rec2.PrintRectangle();
	}

}
