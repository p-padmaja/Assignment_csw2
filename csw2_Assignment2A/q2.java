package csw2_Assignment2A;
import java.util.*;
class Student {
    String name;
    int age;
    int mark;  
    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", mark=" + mark + "]";
    }
}

public class q2 {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        
        // Add some students to the list
        list.add(new Student("Padmaja", 20, 95));
        list.add(new Student("Shreya", 19, 94));
        list.add(new Student("Ayusha", 21, 95));
        list.add(new Student("Trishna", 21, 91));
        
        // (a.) Display the list
        System.out.println("The list contains:");
        for (Student student : list) {
            System.out.println(student);
        }
        
        // (b.) Ask the user to enter a student object and print the existence of the object.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Student student : list) {
            if (student.name.equals(name)) {
                System.out.println("The student " + name + " exists in the list.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The student " + name + " does not exist in the list.");
        }
        
        // (c.) Remove a specified student object.
        System.out.print("Enter a student name to remove: ");
        name = scanner.nextLine();
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.name.equals(name)) {
                iterator.remove();
                System.out.println("The student " + name + " has been removed from the list.");
                break;
            }
        }
        
        // (d.) Count the number of object present in the list.
        int count = 0;
        for (Student student : list) {
            count++;
        }
        System.out.println("There are " + count + " students in the list.");
    }
}



