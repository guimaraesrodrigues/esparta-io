package esparta;

/**
 *
 * @author Rodrigo Guimarães
 */
public class ArrayUnpaired {
    
    //This function uses -1 to signal that the index has a pair.        
    public int arrayUnpaired(int[]array){
        int unpaired = -1;//will store the unpaired value. Initilizes with a number out of array's range
        
        for (int i = 0; i < array.length; i++){
            
            if(array[i] == -1)
                continue;//if already has a pair, goes to the next index
            
            for(int j = i+1; j < array.length; j++){//search for array[i] pair
                if(array[i] == array[j]){
                    //if found, signals as paired
                    array[i] = -1;
                    array[j] = -1;
                }
                else if (j == array.length -1)//if no pair found and end of array, array[i] is the unpaired element
                    unpaired = array[i];
            }
        }               
        return unpaired;
    }    
}
