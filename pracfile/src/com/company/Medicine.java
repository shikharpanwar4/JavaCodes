package com.company;

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

