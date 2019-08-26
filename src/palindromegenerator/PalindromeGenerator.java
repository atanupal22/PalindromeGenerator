/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromegenerator;

/**
 *
 * @author atanu
 */
public class PalindromeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        if(args==null || args.length==0)
            throw new Exception("Invalid argument");
        
        String original = args[0];
        
        PalindromeGenerator pg = new PalindromeGenerator();
        
        System.out.println(pg.generatePalindrome(original));
            
    }
    
    /**
     * Checks if given String is a palindrome or not
     * @param original - The String to be verified
     * @return 
     */
    public boolean checkForPalindrome(String original){
        String reverse = getReverseString(original);
        
        if (reverse.equals(original)){
            return true;
        }
        return false;
    }
    
    /**
     * Returns reverse of a given String, Example : if given String is "abc"
     * the method will return "cba"
     * @param original - String to be reversed
     * @return 
     */
    public String getReverseString(String original){
        StringBuilder reverse = new StringBuilder("");
        int length = original.length();
        
        for (int i = length-1; i >=0 ; i--){
            reverse.append(original.charAt(i));
        }
        
        return reverse.toString();
    }
    
    /**
     * This method always return a palindrome String with minimum length,
     * if given string is already a palindrome then no change made
     * or else creates a minimum length palindrome by adding some characters by end of the given String
     * @param original - The original String from which palindrome to be created
     * @return 
     */
    public String generatePalindrome(String original){
        if(checkForPalindrome(original))
            return original;
        else
            return original+getReverseString(original).substring(1);
    }
    
}
