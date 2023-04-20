package csw2_Assignment2A;
import java.util.*;
public class q1 {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
      ArrayList<Integer> a = new ArrayList<Integer>();
      a.add(1); 
      a.add(2);
      a.add(3);
      System.out.println("List: " + a);
      System.out.println("Enter a number to search for:");
      int searchNum = sc.nextInt();
      if (a.contains(searchNum)) 
           System.out.println(searchNum + " is present in the list."); 
      else 
          System.out.println(searchNum + " is not present in the list.");
      System.out.println("Enter the position of the element to remove (starting from 0):");
      int pos = sc.nextInt();
      if (pos < 0 || pos >= a.size()) 
    	 System.out.println("Invalid position."); 
      else 
    	 a.remove(pos);
      System.out.println("After removing the element the List: " + a);
      System.out.println("Array IsEmpty: " + a.isEmpty());
   }
}



