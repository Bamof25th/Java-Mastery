
import java.util.Arrays;

public class Five {

    // 5. Create a array of size 20, accept string from user and store it in the
    // array,
    // in such a fashion that all the string whose 2nd character is same should
    // be together in the array In the following array
    // if user adds bat, then this string should get added after xamp, if user adds
    // linux, then add at the end.

    public static void FiveFun(String[] arr) {
        // Create result array with size 20 as per requirement
        String[] result = new String[20];
        int currentIndex = 0;

        // First, group strings by their second character
        Arrays.sort(arr, (a, b) -> {
            if (a.length() < 2 || b.length() < 2) {
                return a.compareTo(b);
            }
            char aSecond = a.charAt(1);
            char bSecond = b.charAt(1);
            if (aSecond == bSecond) {
                return a.compareTo(b);
            }
            return aSecond - bSecond;
        });

        // Copy sorted array to result
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
            currentIndex++;
        }

        System.out.println("Grouped by second character: " + Arrays.toString(result));

        // Method to add a new string
        System.out.println("To add a new string, use addString(result, newString, currentIndex)");
    }

    // Helper method to add new strings while maintaining the grouping
    public static int addString(String[] result, String newStr, int currentIndex) {
        if (newStr.length() < 2 || currentIndex >= result.length) {
            return currentIndex;
        }

        // Find the position to insert the new string
        int insertPos = 0;
        char newSecond = newStr.charAt(1);

        while (insertPos < currentIndex &&
                result[insertPos] != null &&
                result[insertPos].charAt(1) <= newSecond) {
            insertPos++;
        }

        // Shift elements to make space
        for (int i = currentIndex; i > insertPos; i--) {
            result[i] = result[i - 1];
        }

        // Insert the new string
        result[insertPos] = newStr;
        return currentIndex + 1;
    }

    public static void main(String[] args) {
        String[] arr = { "pom", "dom", "mom", "jkl", "mnb", "hjk", "lom", "com", "rock", "aniket" };
        FiveFun(arr);

        // Example of how to add new strings
        String[] testArr = new String[20];
        int idx = 0;
        for (String s : arr) {
            testArr[idx] = s;
            idx++;
        }

        // Adding "bat" (should go with other 'a' second characters)
        idx = addString(testArr, "bat", idx);
        // Adding "linux" (should go with other 'i' second characters)
        idx = addString(testArr, "linux", idx);

        System.out.println("\nAfter adding new strings: " + Arrays.toString(testArr));
    }
}
