package qwerty;
import java.text.NumberFormat;
public class item {
	    private int ID;
	    private String name;
	    private double unitPrice;

	    public item(int ID)
	    {
	        this.ID = ID;
	    }

	    public item(int ID, String name, Double UnitPrice)
	    {
	       this.ID = ID;
	        this.name = name;
	        this.unitPrice = UnitPrice;
	    }

	    public void display()
	    {
	        NumberFormat dollars = NumberFormat.getCurrencyInstance();
	        System.out.printf("information about item is", ID, name, dollars.format(unitPrice));
	    }
	    public int getID()
	    {
	        return ID;
	    }

	    public void setName(String Name)
	    {
	        this.name = Name;
	    }

	    public String getName()
	    {
	        return name;
	    }
	    public void setUnitPrice(double pUnitPrice)
	    {
	        unitPrice = pUnitPrice;
	    }

	    public double getUnitPrice()
	    {
	        return unitPrice;
	    }

	}

