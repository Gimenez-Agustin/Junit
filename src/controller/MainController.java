package controller;

import interfaces.OperationInterface;
import java.util.HashMap;
import model.Addition;
import model.Division;
import model.Multiplication;
import model.Subtraction;

public class MainController {
    
    public static HashMap<String, OperationInterface> map = new HashMap <String, OperationInterface>();
	
	public void Controller() {
		
	}
	
	public double handleRequest(String operation, double num1, double num2) {
		
		map.put("A", new Addition()); 
		map.put("S", new Subtraction());
		map.put("M", new Multiplication());
		map.put("D", new Division());
                
		OperationInterface operationInterface = map.get(operation);
		double total = operationInterface.total(num1, num2);
		
		return total;
		
	}
}
