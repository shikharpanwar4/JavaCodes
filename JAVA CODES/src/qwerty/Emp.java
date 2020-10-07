package qwerty;

public class Emp {
	
	    int empid;
	    String empname;
	    String desig;
	    double basic;
	    double hra;
	    Emp(int id, String name, String des, double bas)throws LowSalExceptiom
	    {
	        empid = id;
	        empname = name;
	        desig = des;
	        basic = bas;
	        if(basic<500)
	        {
	            throw new LowSalExceptiom("Salary less than 500");
	        }
	    }
	    public void printDET()
	    {
	        System.out.println("Employee ID : "+empid);
	        System.out.println("Employee Name : "+empname);
	        System.out.println("Employee Designation : "+desig);
	        System.out.println("Employee Basic : "+basic);
	        System.out.println("Employee HRA : "+hra);
	    }
	    public void calculateHRA()
	    {
	        if(desig.equals("manager"))
	        {   
	            hra = 0.1*basic;
	        }
	        else if(desig.equals("officer"))
	        {   
	            hra = 0.12*basic;
	        }
	        else if(desig.equals("clerk"))
	        {   
	            hra = 0.05*basic;
	        }
	    }
	}
	

