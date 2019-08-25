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
    
    PalindromeGenerator instance;
    @Before
    public void setUp() {
        instance = new PalindromeGenerator();
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of generatePalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testGeneratePalindrome_WithPalindromeInput() {
        String original = "aba";
        
        System.out.println("generatePalindrome with Palindrome Input");

        String expResult = "aba";
        String result = instance.generatePalindrome(original);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of generatePalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testGeneratePalindrome_WithNonPalindromeInput() {
        String original = "ab";
        
        System.out.println("generatePalindrome with Non Palindrome Input");

        String expResult = "aba";
        String result = instance.generatePalindrome(original);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of generatePalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testGeneratePalindrome_WithSingleCharacterInput() {
        String original = "a";
        
        System.out.println("generatePalindrome with single Character Input");

        String expResult = "a";
        String result = instance.generatePalindrome(original);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkForPalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testCheckForPalindrome_WithValidPalindromeAndEvenCharacters() {
        String original = "abccba";
        
        System.out.println("checkForPalindrome with valid palindrome and odd characters :: " + original);

        boolean expResult = true;
        boolean result = instance.checkForPalindrome(original);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of checkForPalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testCheckForPalindrome_WithValidPalindromeAndOddCharacters() {
        String original = "abcba";
        
        System.out.println("checkForPalindrome with valid palindrome and odd characters :: " + original);

        boolean expResult = true;
        boolean result = instance.checkForPalindrome(original);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of checkForPalindrome method, of class PalindromeGenerator.
     */
    @Test
    public void testCheckForPalindrome_WithInValidPalindrome() {
        String original = "abc";
        
        System.out.println("checkForPalindrome with invalid palindrome :: " + original);

        boolean expResult = false;
        boolean result = instance.checkForPalindrome(original);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getReverseString method, of class PalindromeGenerator.
     */
    @Test
    public void testGetReverseString() {
        String original = "abcde";
        
        System.out.println("getReverseString with parameter :: " + original);

        String expResult = "edcba";
        String result = instance.getReverseString(original);
        assertEquals(expResult, result);
        
    }

}
