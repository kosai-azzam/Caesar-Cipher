import edu.duke.*;
import java.io.*;
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesarCipher {

    public String encrypt (String input, int key) {
     
        StringBuilder encrypted = new StringBuilder(input);
        String alphapit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphapit = alphapit.substring(key) + alphapit.substring(0, key);
        
        for (int i=0; i<encrypted.length(); i++) {
         
            char currChar = encrypted.charAt(i);
            //currChar = Character.toUpperCase(currChar);
            if (Character.isUpperCase(currChar)) {
            int idx = alphapit.indexOf(currChar);
            }
            if(Character.isLowerCase(currChar)) 
                   
                    alphapit = alphapit.toLowerCase();  
                   int idx = alphapit.indexOf(currChar);
                
            
            //&& (currChar == Character.toUpperCase(currChar) || currChar == Character.toLowerCase(currChar))
            if (idx != -1 ) {
                //String Alphabet = alphapit.toLowerCase();
                char newChar = shiftedAlphapit.charAt(idx);
                
                //newChar = Character.toLowerCase(newChar);
                encrypted.setCharAt(i, newChar);
            }
          }  
          return encrypted.toString();
        }
        
    
    
    public void testEncrypt() {
    FileResource fr = new FileResource();
    String message = fr.asString();
    String encrypted = encrypt(message, 15);
    System.out.println("key is " + 15 + "\n" + encrypted);
    }
    
    public String encryptTwoKeys (String input, int key1, int key2) {
     
        StringBuilder encrypted = new StringBuilder(input);
       
        String alphapit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphapit = alphapit.substring(key1) + alphapit.substring(0, key1);
        String shiftedAlphapit2 = alphapit.substring(key2) + alphapit.substring(0, key2);
        
        for (int i=0; i<encrypted.length(); i++) {
            
            char currChar = encrypted.charAt(i);
            
            char upperChar = Character.toUpperCase(currChar);
            
            int idx = alphapit.indexOf(upperChar);
            
            
            if (idx !=-1 && idx%2!=0) {
               
                char newChar = shiftedAlphapit.charAt(idx);
                if (Character.isLowerCase(currChar)) {
                    newChar = Character.toLowerCase(newChar);
                    ;
                //encrypted2.setCharAt(i, newChar2);
                }
                
                encrypted.setCharAt(i, newChar);
            }
                
            if (idx !=-1 && idx%2==0) {
                 char newChar = shiftedAlphapit2.charAt(idx);
                if (Character.isLowerCase(currChar)){
                    newChar = Character.toLowerCase(newChar);
                
            }
            encrypted.setCharAt(i, newChar);
        }
        
    }
    return encrypted.toString();
  } 
    
  public void testEncryptTwoKeys() {
     FileResource fr = new FileResource();
     String message = fr.asString();
     String encrypted = encryptTwoKeys(message, 8, 21);
     System.out.println("keys are " + 23 + " " + 17 + "\n" + encrypted);
  }
}
