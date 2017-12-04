package esparta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Guimarães
 */
public class Distinct {
    
    public int distinct(int[]array){        
        
        int counter = 0;
          
        if(array.length > 0){
            counter ++;
            for(int i = 1; i< array.length; i++){
                for (int j = i-1; j >= 0; j--)
                    if(array[i] == array[j])
                        break;
                    else if (j == 0)
                        counter ++;                          
            }                
        }      
        return counter;
    }
    
    public static void main(String[] args) {
               
        int[]array;
        
        array = new Random().ints(100000, -1000000, 1000000).toArray();
        //array = new Random().ints(10, -20, 20).toArray();
        //array = new int[]{2,1,1,2,3,1, 1, 2, 4, 9, 9, 9};                   
        System.out.println("Number of distinct values: " + new Distinct().distinct(array));                
    }
}
