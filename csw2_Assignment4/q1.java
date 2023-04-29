package csw2_Assignment4;
import java.util.*;
public class q1 {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 3, 6, 2 };
        int firstRepeatedElement = findFirstRepeatedElement(arr);
        if (firstRepeatedElement != -1) {
            System.out.println("The first repeated element is: " + firstRepeatedElement);
        } else {
            System.out.println("There are no repeated elements in the array.");
        }
    }

    public static int findFirstRepeatedElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return arr[i];
            } else {
                map.put(arr[i], i);
            }
        }
        return -1;
    }
}
//o/p:The first repeated element is: 3

