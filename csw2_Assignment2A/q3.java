package csw2_Assignment2A;
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        while(n != 0) {
            s.push(n % 2);
            n /= 2;
        }
        System.out.print("Binary equivalent: ");
        while(!s.empty()) {
            System.out.print(s.pop());
        }
        sc.close();
	}

}
