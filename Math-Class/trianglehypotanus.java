import java.util.Scanner;

public class trianglehypotanus {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side x : ");
        x= scn.nextDouble();
        System.out.println("Enter side y : ");
        y= scn.nextDouble();

        z =  Math.sqrt(((x*x) + (y*y)));


        System.out.println(" The hypotanus is :"+ Math.round(z));
        scn.close();

    }
}
