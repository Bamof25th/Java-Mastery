
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoThree {

    public static int facto(int n) {
        if (n == 1)
            return 1;
        int ans = n * facto(n - 1);
        return ans;
    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrime(List<Integer> list) {
        return list.stream()
                .filter(n -> isPrime(n) == true)
                .map(n -> facto(n)).collect(Collectors.toList());
    }

    public static Integer maxPrime(List<Integer> list) {
        return list.stream().filter(n -> isPrime(n) == true).max(Integer::compare).get();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add some numbers to the list
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // Find factorials of prime numbers in the list
        List<Integer> result = findPrime(list);

        // Print the result
        System.out.println("Factorials of prime numbers in the list: " + result);

        System.out.println("max of prime numbers in the list: " + maxPrime(list));
    }
}
