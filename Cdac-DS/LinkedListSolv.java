
import java.util.LinkedList;

public class LinkedListSolv {
    // LinkedList
    // 1. Display singly list in the reverse order
    // 2. Delete all prime numbers from singly linked list
    // 3. Reverse the singly linked list
    // 4. Add a value in singly linked list before given value
    

    public static boolean isPrime(int n) {

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // public static void reverseTheLinkedList() {

    //     list.

    // }

    public static void deleteAllPrime(LinkedList<Integer> list) {
        list.removeIf(LinkedListSolv::isPrime);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Original list: " + list);
        deleteAllPrime(list);
        System.out.println("After deleting primes: " + list);
    }

}
