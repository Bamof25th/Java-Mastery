package loops;

import java.util.Scanner;

public class whilelop {
    public static void main(String[] args) {
        // While loop =  executes a block of code as long as a  it's condition remains true.

        Scanner scn = new Scanner(System.in);

        String name  = "" ; 
        
        while (name.isBlank()) {
            System.out.println("enter your name:");
            name = scn.nextLine();
        }

        System.out.println("hello : " + name);
        scn.close();
    }
}
