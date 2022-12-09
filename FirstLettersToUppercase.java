
package first.letters.to.uppercase;

/**
 *
 * @author Emmanuel C. 
 */
public class FirstLettersToUppercase {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) 
    {
        String letter = ("hello everyone. let's write some useful Java code today. we will begin with strings."); 
        String firstLetter = letter.substring(0,1);
        String otherLetters = letter.substring(1);
        
        firstLetter = firstLetter.toUpperCase();
        
        String sentenceCapitalized =  firstLetter + otherLetters;
        
        
                
        
        
        
        System.out.println(sentence );
        
        
    }
}
    

