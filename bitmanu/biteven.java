package bitmanu;

import java.util.Scanner;

public class biteven {
    public static void main(String[] args) {
        try (// * for this you will have to check the rightmost bit is 0 or 1 if it is o then
                // its even
                // * do bitwise AND with 1 to check for the even or odd .
        Scanner scn = new Scanner(System.in)) {
            double n = scn.nextDouble();
                int z = (int) n & 1;
            if (z == 0) {
                System.out.println("even");
            } else {
                System.out.println("Odd");
            }
        }

    }
}
