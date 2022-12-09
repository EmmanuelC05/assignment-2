
package reversing.a.given.array;
import java.util.Arrays;
/**
 *
 * @author Emmanuel C.
 */
public class ReversingAGivenArray {
    public static void main(String[] args) 
    {
        String name[]={"s","a","b","a",""};      
        System.out.println(Arrays.toString(name));
        String s="";
        String rev="";
        for (int i=0; i<name.length; i++){
            if (name[i]==""||i==name.length-1){
            for (int j=s.length()-1;j>=0;j--) {
                rev=rev+s.charAt(j);
            }
        System.out.println(rev);
        s="";
        rev="";}
            else{s=s+name[i];
        
            }     
    }}}
        
                
            
        
    
    

