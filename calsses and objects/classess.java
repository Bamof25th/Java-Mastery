public class classess {
    public static void main(String[] args) {
        Pair p1 = new Pair(20, 10);
        System.out.println(p1.x); // prints the object's value
        System.out.println(p1.y); // prints the object's value

        Pair p2 = new Pair(55, 1); // create a pair with no arguments
        System.out.println(p2.x);
        System.out.println(p2.y);
    }

    /**
     * Innerclassess
     */
    public static class Pair {
        int x;
        int y;

        Pair(int a, int b) {
            x = a;
            y = b;
        }

        Pair(int d1, double d2) {

        }
    }
}