package model;

import interfaces.OperationInterface;

public class Division implements OperationInterface {

    @Override
    public double total(double num1, double num2) {
        if (num2 != 0) {
            double total = num1 / num2;
            System.out.println("the total of the subtraction is: " + total);
            return total;
        } else {
            System.out.println("you cannot perform this operation");
            return 0;
        }
    }

}
