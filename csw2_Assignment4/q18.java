package csw2_Assignment4;
import java.util.*;

public class q18 {
	public static int findSecondLargest(int[] arr) {
	    int largest = arr[0];
	    int secondLargest = Integer.MIN_VALUE;
	    
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            secondLargest = largest;
	            largest = arr[i];
	        } else if (arr[i] > secondLargest && arr[i] != largest) {
	            secondLargest = arr[i];
	        }
	    }
	    
	    return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 15, 25};
		int secondLargest = findSecondLargest(arr);
		System.out.println("Second largest element: " + secondLargest);


	}

}
//o/p:Second largest element: 20