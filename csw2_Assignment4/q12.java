package csw2_Assignment4;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        List<Integer> X = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> Y = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        int value = 11;

        Set<Integer> set = new HashSet<>();

        for (int x : X) {
            set.add(x);
        }

        for (int y : Y) {
            if (set.contains(value - y)) {
                System.out.println("Pair found: (" + (value - y) + ", " + y + ")");
                return;
            }
        }

        System.out.println("No pair found.");
    }
}

//o/p:Pair found: (5, 6)
