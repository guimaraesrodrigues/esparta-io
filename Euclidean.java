package esparta;

/**
 *
 * @author Rodrigo Guimarães
 */
public class Euclidean {
    
    public int euclidean(int N, int M){
        
        int chocolates = 0;//Number of chocolates that will be eaten
        
        int array[] = new int[N];//An array to represent the circle of chocolates
        
        int X = 0;//Chocolate number       
                
        //One represents an wrapped chocolate
        for(int i = 0; i < N; i ++)
            array[i] = 1;             
        
        array[X] = 0;//Zero represents an empty wrapper. 
        chocolates++;
        X = M;        
        
        if (X < N){   
            //if array[X] is not an empty wrapper, eat a chocolate
            while(array[X] != 0 && X < N){
                array[X] = 0;//Signals as empty wrapper
                X = (X + M)%N;//Next chocolat that will be eaten
                chocolates++;
            }
        }        
        return chocolates;
    }    
    
    public static void main(String[] args) {
        
        System.out.println("Chocolates that you will eat: " + new Euclidean().euclidean(10, 4));
        
    }
}
