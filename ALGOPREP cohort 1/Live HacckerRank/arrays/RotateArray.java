package arrays;
import java.util.Scanner;

/**
 * RotateArray
 */
public class RotateArray {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int []arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
         
        k = k % n ;
        
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        
        for( int l = 0 ; l<n; l++){
          System.out.print(arr[l]+" ");  
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

// Arr2 que 2 RotateArray complete