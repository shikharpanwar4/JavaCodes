package qwerty;
import java.io.*;
public class EmpClass {
public static void main (String[]args) throws LowSalExceptiom
{
	Emp e1=new Emp(101,"Rahul","manager",1400);
	e1.calculateHRA();
	e1.printDET();
}

}