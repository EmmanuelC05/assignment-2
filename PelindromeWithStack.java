
package pelindromewithstack;
import java.util.Stack;
/**
 *
 * @author manny
 */
public class PelindromeWithStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Stack<Character> stack = new Stack();
        String input = "level";
        
        for(int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
        }
        String backwordsInput = "";
        
        while (!stack.isEmpty()){
            backwordsInput += stack.pop();
        }
        if (input.equals(backwordsInput))
            System.out.println("True");
        else System.out.println("False");
        
      
        
        
    }
    
}
