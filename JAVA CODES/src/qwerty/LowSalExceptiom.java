package qwerty;

class LowSalExceptiom extends Exception{
	
	    LowSalExceptiom(String str)
	    {
	        super();
	    }
	    public String toString() 
	    {
	      return "CustomException : Salary less than 500 ";
	   }
	

}
