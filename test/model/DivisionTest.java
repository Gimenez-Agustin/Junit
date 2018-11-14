package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {
    
    public DivisionTest() {
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
        double num1 = 6.0;
        double num2 = 3.0;
        Division instance = new Division();
        double expResult = 2.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal2() {
        System.out.println("total");
        double num1 = 12.0;
        double num2 = 2.0;
        Division instance = new Division();
        double expResult = 6.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal3() {
        System.out.println("total");
        double num1 = 6.0;
        double num2 = 0.0;
        Division instance = new Division();
        double expResult = 0.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal4() {
        System.out.println("total");
        double num1 = 8.0;
        double num2 = 4.0;
        Division instance = new Division();
        double expResult = 2.0;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTotal5() {
        System.out.println("total");
        double num1 = 5.0;
        double num2 = 4.0;
        Division instance = new Division();
        double expResult = 1.25;
        double result = instance.total(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
}
