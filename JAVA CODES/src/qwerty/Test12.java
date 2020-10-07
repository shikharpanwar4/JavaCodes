
package qwerty;
import java.util.Scanner;
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
	     int N=scn.nextInt();
	     int []arr= new int [N];
	     while (t !=0) {
	     for(int i=0;i<arr.length;i++){

	    	 String s = "";

	    	 for(int j=i;j<arr.length;j++){

	    	 s = s + arr[j] + " ";

	    	 System.out.println(s);
	    	 }
	    	 }
	     }
	}

}
