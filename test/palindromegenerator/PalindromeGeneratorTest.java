/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromegenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atanu
 */
public class PalindromeGeneratorTest {
    
    public PalindromeGeneratorTest() {
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


    /**
     * Test of generatePalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testGeneratePalindrome_WithPalindromeInput() {
        System.out.println("generatePalindrome with Palindrome Input");
        String original = "aba";
        PalindromeGenerator instance = new PalindromeGenerator();
        String expResult = "aba";
        String result = instance.generatePalindrome(original);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of generatePalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testGeneratePalindrome_WithNonPalindromeInput() {
        System.out.println("generatePalindrome with Non Palindrome Input");
        String original = "ab";
        PalindromeGenerator instance = new PalindromeGenerator();
        String expResult = "aba";
        String result = instance.generatePalindrome(original);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of generatePalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testGeneratePalindrome_WithSingleCharacterInput() {
        System.out.println("generatePalindrome with single Character Input");
        String original = "a";
        PalindromeGenerator instance = new PalindromeGenerator();
        String expResult = "a";
        String result = instance.generatePalindrome(original);
        assertEquals(expResult, result);
        
    }
    
}
