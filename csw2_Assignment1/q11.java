package csw2_Assignment1;

public class q11 {
	public static int maxCircularSum(int[] arr, int size){
		int sumAll = 0;
		int currVal = 0;
		int maxVal;
		for(int i = 0; i< size ; i++){
		  sumAll += arr[i];
		  currVal += ((i+1)*arr[i]);
		}
		maxVal = currVal;
		for(int i= 1; i< size; i++){
		    currVal = ( currVal + sumAll ) - ( size * arr[size-i] );
		    if (currVal > maxVal){
		       maxVal = currVal;
		    }
		}
		return maxVal;
		}
		
	public static void main(String[] args) {
		int[] arr = {5,7,6,2,3};
		System.out.println("MaxCirculrSum: " + maxCircularSum(arr, arr.length));
		}
	}


