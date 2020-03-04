package com.company;

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
