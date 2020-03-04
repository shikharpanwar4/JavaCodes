package com.company;

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

