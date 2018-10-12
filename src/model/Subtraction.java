package model;

import interfaces.OperationInterface;

public class Subtraction implements OperationInterface {

    @Override
    public double total(double num1, double num2) {
        double total = num1 - num2;
        System.out.println("the total of the subtraction is: " + total);
        return total;
    }
    
}
