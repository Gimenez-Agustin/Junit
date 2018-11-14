package model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionTest {
     
    @Test
    public void testTotal() {
        System.out.println("total");
        double num1 = 0.0;
        double num2 = 0.0;
        Addition instance = new Addition();
        double expResult = 0.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);     
    }
    
    @Test
    public void testTotal2() {
        System.out.println("total");
        double num1 = 5.0;
        double num2 = 7.0;
        Addition instance = new Addition();
        double expResult = 12.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);     
    }
    
    @Test
    public void testTotal3() {
        System.out.println("total");
        double num1 = 4.0;
        double num2 = 5.0;
        Addition instance = new Addition();
        double expResult = 9.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);     
    }
    
    @Test
    public void testTotal4() {
        System.out.println("total");
        double num1 = -2.0;
        double num2 = -5.0;
        Addition instance = new Addition();
        double expResult = -7.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);     
    }
    
}
