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
        
        List<Integer> values = new ArrayList<Integer>();
        
        for(int i = 0; i< array.length; i++){            
            if(values.contains(array[i]))
                continue;
            else
                values.add(array[i]);            
        }    
        
        return values.size();
    }
    
    public static void main(String[] args) {
               
        int[]array;
        
        //array = new Random().ints(100000, -1000000, 1000000).toArray();
        //array = new Random().ints(10, -20, 20).toArray();
        array = new int[]{2,1,1,2,3,1};
                
        System.out.println("Number of distinct values: " + new Distinct().distinct(array));
        
        //System.out.print("Entre com o tamanho do vetor: ");
        //tamanho = scan.nextInt();        
        
    }
}
