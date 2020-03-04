package com.company;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    double getFirstNumber(){
        return firstNumber;
    }
    double getSecondNumber(){
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    double getAdditionResult(){
        return(firstNumber+secondNumber);
    }
    double getSubtractionResult(){
        return(firstNumber-secondNumber);
    }
    double getMultiplicationResult(){
        return(firstNumber*secondNumber);
    }
    double getDivisionResult(){
        if(secondNumber!=0)
        return(firstNumber/secondNumber);
        else
            return 0;
    }
}
