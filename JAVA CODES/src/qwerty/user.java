package qwerty;
import java.util.Scanner;
public class user {

	public static void main(String[] args) {
		        Inventory1 myInvent = new Inventory1();
		        Scanner scannerObject = new Scanner(System.in);
		        int Choice = 0;

		        do{
		            dispMenu();

		            Choice = getChoice(scannerObject);

		            proChoice(Choice, myInvent);

		        }while (Choice !=0);
		    }

		    public static void dispMenu()
		    {
		        System.out.println("|                                             |");
		        System.out.println("|       Press [1] To Add An Item              |");
		        System.out.println("|                                             |");
		        System.out.println("|       Press [2] To Display One Item         |");
		        System.out.println("|                                             |");
		        System.out.println("|       Press [3] To Display All Items        |");
		        System.out.println("|                                             |");
		        System.out.println("|       Press [0] To Exit                     |");
		       
		    }

		    public static int getChoice(Scanner scannerObject)
		    {
		        boolean x = false;
		        int pChoice = 0;
		        do{
		            try{
		                pChoice = scannerObject.nextInt();
		                x = true;
		            }catch (Exception e){
		                scannerObject.next();
		                System.out.println("\nInvalid command! Please try again:\n");
		            }
		        }while (x == false);
		        return pChoice;
		    }

		    public static void proChoice(int Choice, Inventory1 myInvent)
		    {
		        switch(Choice){
		            case 1: myInvent.addItem();
		                break;
		            case 2: myInvent.displayOne();
		                break;
		            case 3: myInvent.displayAll();
		                break;
		               
		            case 0: System.out.println("\nHave a nice day!");
		                break;
		        }myInvent.saveFile();
		    }
		
	}


