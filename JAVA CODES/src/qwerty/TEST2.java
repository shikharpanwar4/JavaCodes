package qwerty;

public class TEST2 {

    public static void main(String[] args)
    { 
        int choice = (int) (Math.random() * 10);
        while(choice>=0)
        {
            choice = (int) (Math.random() * 10);
            switch (choice)
            {
                case 1:
                    Tablet tab = new Tablet("Omnacotel", "Symboisis Pharmaceuticals");
                    tab.displayLabel();
                    break;
                case 2:
                    Ointment oint = new Ointment("Odomos", "Dabur Pharmaceuticals");
                    oint.displayLabel();
                    break;
                case 3:
                    Syrup syr = new Syrup("Honitus", "Himalyan Pharmaceuticals");
                    syr.displayLabel();
                    break;
                default:
                    choice-=3;
            }
        }
    }
}
