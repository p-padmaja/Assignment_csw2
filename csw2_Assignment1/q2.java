package csw2_Assignment1;
import java.util.Scanner;

public class q2 {
	 public void decToBinary(int n)
	    {
	        for (int i = 31; i >= 0; i--) {
	            int k = n >> i;
	            if ((k & 1) > 0)
	                System.out.print("1");
	            else
	                System.out.print("0");
	        }
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	int n =sc.nextInt();
    	q2 a =new q2();
    	a.decToBinary(n);

	}

}
