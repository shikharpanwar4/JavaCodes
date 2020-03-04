package com.company;

public class LowSalException extends Exception{

    LowSalException(String str) {
        super();
    }

    public String toString() {
        return "CustomException : Salary less than 500 ";
    }

}
