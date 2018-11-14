package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {
    
    public SubtractionTest() {
    }    
    
    @Test
    public void testTotal() {
        System.out.println("total");
        double num1 = 10.0;
        double num2 = 5.0;
        Subtraction instance = new Subtraction();
        double expResult = 5.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal2() {
        System.out.println("total");
        double num1 = 84.0;
        double num2 = 22.0;
        Subtraction instance = new Subtraction();
        double expResult = 62.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal3() {
        System.out.println("total");
        double num1 = 20.0;
        double num2 = 35.0;
        Subtraction instance = new Subtraction();
        double expResult = -15.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal4() {
        System.out.println("total");
        double num1 = 1540.0;
        double num2 = 320.0;
        Subtraction instance = new Subtraction();
        double expResult = 1220.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal5() {
        System.out.println("total");
        double num1 = 0.0;
        double num2 = 0.0;
        Subtraction instance = new Subtraction();
        double expResult = 0.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
}
