package qwerty;

public class Medicine {
	
	    String name, addressOfCompany;
	    public Medicine(String name, String addressOfCompany)
	    { 
	        this.name = name;
	        this.addressOfCompany = addressOfCompany;
	    }
	    public void displayLabel()
	    { 
	        System.out.println("The Name of Medicine is "+ name);
	        System.out.println("Manufactured By : "+addressOfCompany);
	    }
	}
	class Tablet extends Medicine
	{
	    public Tablet(String name, String addressOfCompany) 
	    { 
	        super(name, addressOfCompany);
	    }
	    public void displayLabel() 
	    { 
	        super.displayLabel();
	        System.out.println("Store it in a cool and dry place");
	    }
	}
	class Ointment extends Medicine
	{ 
	    public Ointment(String name, String addressOfCompany) 
	    { 
	        super(name, addressOfCompany);
	    }
	    public void displayLabel() 
	    { 
	        super.displayLabel();
	        System.out.println("For External Use Only and be careful");
	    }
	}
	class Syrup extends Medicine
	{ 
	    public Syrup(String name, String addressOfCompany) 
	    {
	        super(name, addressOfCompany);
	    }
	    public void displayLabel() 
	    {
	        super.displayLabel();
	        System.out.println("Shake Well Before Use and check expiry");
	    }
	}
	

