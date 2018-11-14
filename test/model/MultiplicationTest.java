package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
    
    public MultiplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    @Test
    public void testTotal() {
        System.out.println("total");
        double num1 = 0.0;
        double num2 = 0.0;
        Multiplication instance = new Multiplication();
        double expResult = 0.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }  
    
    @Test
    public void testTotal2() {
        System.out.println("total");
        double num1 = 3.0;
        double num2 = 5.0;
        Multiplication instance = new Multiplication();
        double expResult = 15.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal3() {
        System.out.println("total");
        double num1 = 24.0;
        double num2 = 2.0;
        Multiplication instance = new Multiplication();
        double expResult = 48.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal4() {
        System.out.println("total");
        double num1 = 710.0;
        double num2 = 123.0;
        Multiplication instance = new Multiplication();
        double expResult = 87330.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal5() {
        System.out.println("total");
        double num1 = 9.0;
        double num2 = -9.0;
        Multiplication instance = new Multiplication();
        double expResult = -81.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
}
