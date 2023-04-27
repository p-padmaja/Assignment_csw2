package Assignment3;
import java.util.*;
public class q9{
    public static void main(String[] args) {
        int[] arr1 = { 7, 2, 5, 1, 3 };
        int[] arr2 = { 3, 9, 1, 10, 5 };
        
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        
        List<Integer> intersection = new ArrayList<>();
        for (int i : arr2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
            set.add(i);
        }
        
        System.out.println("Union: " + set);
        System.out.println("Intersection: " + intersection);
    }
}


