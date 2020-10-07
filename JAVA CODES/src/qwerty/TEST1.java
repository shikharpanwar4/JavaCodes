package qwerty;

public class TEST1 {

	public static void main(String[] args) {
	
		        Matrix a = new Matrix(10, 10);
		        a.setElement(1, 0, 10);
		        a.setElement(3, 4, 26);
		        a.setElement(6, 8, 18);
		        a.setElement(7, 7, 9);
		        a.setElement(2, 3, 1);
		        System.out.println("Original Matrix:");
		        a.show();
		        a.transpose();
		        System.out.println("Transpose Matrix:");
		        a.show();
		    }
		}
