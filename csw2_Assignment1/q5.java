package csw2_Assignment1;

public class q5 {
	static void Rotate(int a[], int n, int k){
		//if rotation is greater than n
         k=k%n;
     for(int i = 0; i < n; i++){
       if(i<k){
           // Printing rightmost
           // kth elements
           System.out.print(a[n + i - k]+ " ");
           }
       else{
            // Prints array after
            // 'k' elements
             System.out.print(a[i - k] + " ");
             }
      }
     System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Array[] = {1, 2, 3, 4, 5};
		    int N = Array.length;		 
		    int K = 2;
		    Rotate(Array, N, K);
		 
	}

}
