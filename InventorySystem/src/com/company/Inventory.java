package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Inventory implements Serializable {
    String name;
    int prodNum;
    int price;

    public Inventory(String name, int prodNum, int price) {
        this.name = name;
        this.prodNum = prodNum;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public int getProdNum() {
        return prodNum;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProdNum(int prodNum) {
        this.prodNum = prodNum;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
