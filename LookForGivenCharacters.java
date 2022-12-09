/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package look.pkgfor.given.characters;

/**
 *
 * @author manny
 */
public class LookForGivenCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int array1 [] = {1,77,-5,2,65,30};
       
       int find = 65;
       
       
       boolean check = false;
       for(int values: array1){
           if(values == find){
               check = true;
               break;
              
           }
    }
    if(check){
    System.out.println("True");
}
    else{
    System.out.println("False");
}
}}
