package csw2_Assignment4;
import java.util.*;

public class q4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        
        System.out.println("Original List: " + numbers);
        
        // Create a Set to store unique values
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.addAll(numbers);
   
        // Create a new list with unique values
        List<Integer> uniqueList = new ArrayList<>(uniqueNumbers);
        
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
//o/p:
//Original List: [1, 2, 3, 2, 4, 1]
//List after removing duplicates: [1, 2, 3, 4]