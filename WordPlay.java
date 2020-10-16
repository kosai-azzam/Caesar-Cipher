import edu.duke.*;
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {

    public boolean isVowel (char ch) {
     
        String vowels = "uaeioUAEIO";
        //char newChar = Character.toLowerCase(ch);
        boolean value = false; 
        for (int i=0; i < vowels.length(); i++) {
            
            
            //int indexOfChar = vowels.indexOf(newChar);
            int indexOfChar = vowels.indexOf(ch);
            if (indexOfChar != -1){
                System.out.println("true");
                value = true;
                break;
            }
            else {
                System.out.println("false");
                
                break;
            }
        }
        return value;
    }
    
    public void testIsVowel() {
     
        isVowel('F');
        isVowel('u');
        isVowel('U');
        isVowel('O');
    }
    
    public String replaceVowels (String phrase, char ch) {
     
        StringBuilder sb = new StringBuilder(phrase);
        String currString = phrase; 
        
        for (int i=0; i<currString.length(); i++) {
            //int charIdx = currString.indexOf(ch);
            char currChar = currString.charAt(i);
            
            if(isVowel(currChar)) {
               
               sb.setCharAt(i, ch); 
            }
        }
        return sb.toString();
    }
    
    public void testReplaceVowels () {
        
        System.out.println(replaceVowels("Hello World", 'z'));
    }
    
    public String emphasize (String phrase, char ch) {
        
        StringBuilder sb = new StringBuilder(phrase);
        String s = phrase;
        
        for (int i=0; i<s.length(); i++) {
             char currChar = s.charAt(i);
             //int startIndex = s.indexOf(ch);
             currChar = Character.toLowerCase(currChar);
            if (currChar == ch && i%2 == 0  ) {
                
                sb.setCharAt(i, '*');
                //startIndex = startIndex + 1;
                
            }
            else if (currChar == ch && i%2 != 0  ){
                
                sb.setCharAt(i, '+');
                //startIndex = startIndex + 1;
            }
            
        }
        return sb.toString();
    }
    
    public void testEmphasize() {
     
        System.out.println(emphasize("Hello World", 'o'));
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
    
}
