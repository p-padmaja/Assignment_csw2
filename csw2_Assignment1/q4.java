package csw2_Assignment1;

public class q4 {
	int binarySearch(int arr[], int x, int low, int high) {

	    if (high >= low) {
	      int mid = low + (high - low) / 2;
	      if (arr[mid] == x)
	        return mid;

	      if (arr[mid] > x)
	        return binarySearch(arr, x, low, mid - 1);

	      return binarySearch(arr, x, mid + 1, high);
	    }

	    return -1;
	  }
	public static void main(String[] args) {
		q4 a = new q4();                                   
	    int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
	    int n = arr.length;
	    int x = 4;
	    int result = a.binarySearch(arr, x, 0, n - 1);
	    if (result == -1)
	      System.out.println("Not found");
	    else
	      System.out.println("Element found at index " + result);
	}

}
