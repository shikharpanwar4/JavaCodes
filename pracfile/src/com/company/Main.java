package com.company;

public class Main {

    public static void main(String[] args) {
        int choice = (int) (Math.random() * 10);
        while(choice>=0)
        {
            choice = (int) (Math.random() * 10);
            switch (choice)
            {
                case 1:
                    Tablet tab = new Tablet("Crocin", "Dr. Reddy Pharmaceuticals");
                    tab.displayLabel();
                    break;
                case 2:
                    Ointment oint = new Ointment("Vaseline", "Unilever Pharmaceuticals");
                    oint.displayLabel();
                    break;
                case 3:
                    Syrup syr = new Syrup("Honitus", "Dabur Pharmaceuticals");
                    syr.displayLabel();
                    break;
                default:
                    choice-=3;
            }
        }

    }
}
