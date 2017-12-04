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
        
        int counter = 0;//number of distinct elements
          
        if(array.length > 0){
            
            counter ++;//the first element will be the first distinct
            
            //starts from the second element in array
            for(int i = 1; i< array.length; i++){
                //checks if we already found array[i] before
                for (int j = i-1; j >= 0; j--)
                    if(array[i] == array[j])
                        break;//if we have already passed the number array[i], goes to next i
                    
                    else if (j == 0)//if we reached the beggining of array, array[i] is a distinct number
                        counter ++;                          
            }                
        }      
        return counter;
    }
}
