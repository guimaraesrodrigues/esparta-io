
package esparta;

/**
 *
 * @author Rodrigo Guimarães
 */
//Main class to test the solutions
public class MainClass {
    
    public static void main(String[] args) {
    
    int[]array;        
    
    //array = new Random().ints(100000, -1000000, 1000000).toArray();
    //array = new Random().ints(10, -20, 20).toArray();
    array = new int[]{2,1,1,2,3,1, 1, 2, 4, 9, 9, 9};                   
    System.out.println("Number of distinct values: " + new Distinct().distinct(array));
    
    array = new int[]{9, 3, 9, 3, 9, 7, 9};        
    System.out.println("The unpaired element is: " + new ArrayUnpaired().arrayUnpaired(array));
    
    System.out.println("Chocolates that you will eat: " + new Euclidean().euclidean(10, 4));    
    
    }       
}
