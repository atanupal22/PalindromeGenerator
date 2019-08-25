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
    
    public boolean checkForPalindrome(String original){
        String reverse = getReverseString(original);
        
        if (reverse.equals(original)){
            return true;
        }
        return false;
    }
    
    public String getReverseString(String original){
        StringBuilder reverse = new StringBuilder("");
        int length = original.length();
        
        for (int i = length-1; i >=0 ; i--){
            reverse.append(original.charAt(i));
        }
        
        return reverse.toString();
    }
    
    public String generatePalindrome(String original){
        if(checkForPalindrome(original))
            return original;
        else
            return original+getReverseString(original).substring(1);
    }
    
}
