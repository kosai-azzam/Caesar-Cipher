import edu.duke.*;
/**
 * Write a description of WordLength here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordLength {
    
    public void countWordLength (FileResource resource, int[] counts) {
        int index = 0;
        for(String word: resource.words()) {
            
            counts[index] += 1;
            index +=1;
        }
    }
    
    
        public void countWordLengths(FileResource resource,  int[] counts){
        for(String word : resource.words()){
            int adjustedLength = word.length();
            
            for(int k=0; k<word.length();k++){
              if( (k==0) || (k==(word.length()-1) )) {
                  
                  if (!Character.isLetter(word.charAt(k)))
                  
                  adjustedLength--;}
            }
            counts[adjustedLength]++;      
    }
  }
    
  
  void test_countWordLengths(){
    String[] plays = {"smallHamlet.txt"};
    int[] counts = new int[30];
    for(int k=0; k < plays.length; k++){
        FileResource resource = new FileResource("C:/Users/LunarArcane/Desktop/Java Projects/Cesar/" + plays[k]);
        countWordLengths(resource,counts);
        System.out.println("done with " + plays[k]);
    }
    
    for(int k=0; k < counts.length; k++){
        System.out.println(counts[k] + " words of length " + k  );
    }
    
    System.out.println("Index of Max count is " + indexOfMax(counts));
  } 


  public int indexOfMax(int[] values){
    int maxIndex = 0;
    int maxCount = 0;
    
    for (int k=0; k<values.length; k++){
        if (values[k]>maxCount) {
            maxIndex=k;
            maxCount=values[k];
        }
    }
    return maxIndex;
   }
    
    public void testisLetter () {
       
        if (!Character.isLetter('-')) 
        { 
            System.out.println("true");
        }
        else {System.out.println("false");}
    }
       
       
    
    
}
