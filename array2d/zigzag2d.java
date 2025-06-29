package array2d;

import java.util.Scanner;

public class zigzag2d {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            
            int[][] arr = new int[n][m];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }
            // zig-zag

            //  for (int i = 0; i < n; i++) {
            //     if (i % 2 == 0) {
            //         for (int j = 0; j < m; j++) {
            //             System.out.print(arr[i][j] + " ");
            //         }
            //     } else {
            //         for (int j = m-1; j >= 0; j--) {
            //             System.out.print(arr[i][j] + " ");
            //         }
            //     }
            // }
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) { // Even rows (0-based index)
                    for (int j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                } else { // Odd rows
                    for (int j = m - 1; j >= 0; j--) { // Print in reverse order
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }

  public static void fun( int[][] arr) {
    arr[0][0] = 100;
  }
}
