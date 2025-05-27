package arrays;
import java.util.Scanner;

/**
 * RevesePart
 */
public class RevesePart {
public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int []arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int s = scn.nextInt();
        int e = scn.nextInt();
        
        reverse(arr,s,e);
        
        for( int k = 0 ; k<n; k++){
          System.out.print(arr[k]+" ");  
        }
    }
    
    public static void reverse(int [] arr , int s ,int e ){
        int sp = s;
        int ep = e;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] =  arr[ep];
            arr[ep] = temp ;
            
            sp++;
            ep--;
            
        }
    }
    
}

// arrays 2 que no 1
