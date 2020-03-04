package com.company;

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

