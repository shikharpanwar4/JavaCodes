package qwerty;
	import java.util.Scanner;
	import java.io.PrintWriter;
	import java.io. FileOutputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class Inventory1
	{
	    int max = 30;
	    int count = 0;
	    item myItem[] = new item[max];
	    Scanner scannerObject = new Scanner(System.in);

	    public void addItem()
	    {
	        try{
	            if (count >= max)
	            {
	                System.out.println("\nNo more room!");
	            }else{
	                System.out.print("\nPlease enter name of item: ");
	                String lname = scannerObject.nextLine();
	                System.out.print("\nPlease enter unit price of the item: $");
	                Double lunitPrice = scannerObject.nextDouble();
	                myItem[count] = new item(count + 1, lname, lunitPrice);
	                count++;
	                System.out.println("\nThank you. The ID number for " + lname + " is " + count);
	                scannerObject.nextLine();
	            }
	        }catch(Exception e)
	        {
	            System.out.println("\nERROR! Please try again:\n");
	            scannerObject.nextLine();
	        }

	    }

	    public int findItem()
	    {
	        int found = -1;
	        int inputID =0;
	        try{
	            System.out.print("\nGreetings, please enter the ID number for item:\n");
	            inputID = scannerObject.nextInt();
	            for(int i = 0; i < count; i++){
	                if(myItem[i].getID() == inputID){
	                    found = i;
	                    scannerObject.nextLine();
	                }
	            }
	        }catch(Exception e)
	        {
	            System.out.println("\nERROR!");
	            scannerObject.nextLine();
	        }
	        return found;
	    }

	   
	  
	    public void displayAll()
	    {   System.out.println("_______________________________________________________________________________\n");
	        System.out.println("                                 Inventory                                     ");
	        System.out.println("_______________________________________________________________________________\n");
	        System.out.printf("\n%-6s%-20s%-24s%-12s%-6s\n", "ID:", "Name:", "Description:","On Hand:", "Unit Price:\n");
	        System.out.println("_______________________________________________________________________________\n");
	        for(int i = 0; i < count; i++){
	            myItem[i].display();
	        }
	    }

	    public void displayOne()
	    {
	        int lfound = findItem();
	        if (lfound == -1){
	            System.out.println("\nInvalid input! Please try again:");
	        }else{
	            System.out.println("_______________________________________________________________________________\n");
	            System.out.printf( "ID:", "Name:", "Unit Price:\n"); 
	            myItem[lfound].display();
	        }
	    }

	    public void saveFile()
	    {
	        PrintWriter outputStream = null;
	        try{
	            outputStream =
	                new PrintWriter(new FileOutputStream("C:\\Invent.txt"));
	        }catch (FileNotFoundException e)
	        {
	            System.out.println("Error!");

	        }
	        if(outputStream != null)
	            for(int i = 0; i < count; i++){
	                outputStream.println(myItem[i].getID());
	             
	                outputStream.println(myItem[i].getUnitPrice());
	                outputStream.println(myItem[i].getName());
	             }
	        outputStream.close();
	    }
	}

