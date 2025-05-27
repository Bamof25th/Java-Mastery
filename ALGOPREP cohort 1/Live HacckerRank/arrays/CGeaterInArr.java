package arrays;
import java.util.Scanner;

public class CGeaterInArr {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int []arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }   
        System.out.println(countGreater(arr));
    }

 public static int countGreater(int [] arr){
       int max  = Integer.MIN_VALUE ;
     for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max = arr[i];
        }
     }
     int count = 0;
     for (int i = 0; i < arr.length; i++) {
        if (arr[i] == max) {
            count++;
        }
     }

     return arr.length - count ;
    
 }
}
