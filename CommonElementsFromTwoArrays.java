
package common.elements.from.two.arrays;

/**
 *
 * @author manny
 */
public class CommonElementsFromTwoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int array0[]={1,5,-5,2,12,30};
        int array1[]= {-10,50,15,2};
        
        for (int i = 0; i < array0.length; i++){
            for (int l = 0; l < array1.length; l++) {
                if (array0[i]==array1[l]){
                    System.out.println("The common element between the two arrays is " +array1[i]);
                }
            }
        }
        
    }
    
}
