package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionalClassTest {

    public static String[] authors = {"William Shakespeare", "Agatha Christie", "Barbara Cartland", "Danielle Steel", "Harold Robbins"};
    public static String[] authors2 = {"William Shakespeare", "Agatha Christie", "Barbara Cartland", "Danielle Steel", "Harold Robbins"};
    public static String[] authors3 = {"Agatha Christie", "Barbara Cartland", "Danielle Steel", "Harold Robbins", "William Shakespeare"};

    public AdditionalClassTest() {
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
    
//  assertNull return null since the id 7 does not exist
    @Test
    public void testGetAuthor1() {
        System.out.println("getAuthor1");
        int id = 7;
        String result = AdditionalClass.getAuthor2(authors, id);
        assertNull(result);

    }

//  assertTrue  return true since Barbara Cartland is in the array
    @Test
    public void testAuthorCompare() {
        System.out.println("AuthorCompare");
        String author = "Barbara Cartland";
        boolean result = AdditionalClass.AuthorCompare(authors, author);
        assertTrue(result);
    }
    
    //  assertTrue  return false since J.R.R Tolkien is not in the array
    @Test
    public void testAuthorCompare2() {
        System.out.println("AuthorCompare");
        String author = "J.R.R Tolkien";
        boolean result = AdditionalClass.AuthorCompare(authors, author);
        assertFalse(author,result);
    }
    
    @Test
    public void testArrays() {
        System.out.println("testArrays");
        assertArrayEquals(authors,authors2);
    }
    

}
