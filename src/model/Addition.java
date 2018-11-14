package model;

import interfaces.OperationInterface;

public class Addition implements OperationInterface {
    
    public Addition(){}

    @Override
    public double total(double num1, double num2) {
        double total = num1 + num2;
        System.out.println("the total of the addition is: " + total);
        return total;
    }
    
}
