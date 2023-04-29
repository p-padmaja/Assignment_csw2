package csw2_Assignment4;

public class q8 {
	public static int[] findOddElements(int[] arr) {
	    int x = 0;
	    for (int i = 0; i < arr.length; i++) {
	        x ^= arr[i];
	    }
	    int rightmostSetBit = x & -x; // get the rightmost set bit
	    int odd1 = 0, odd2 = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if ((arr[i] & rightmostSetBit) != 0) {
	            odd1 ^= arr[i];
	        } else {
	            odd2 ^= arr[i];
	        }
	    }
	    return new int[]{odd1, odd2};
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 3, 1, 4, 2, 5};
		int[] result = findOddElements(arr);
		System.out.println("Odd occurrences: " + result[0] + " and " + result[1]);


	}

}
//o/p:Odd occurrences: 5 and 1