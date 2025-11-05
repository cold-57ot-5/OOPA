import java.util.*;

class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Riya");
        students.add("Arjun");
        students.add("Meena");

        // Insert at specific index
        students.add(1, "Karan");

        // Display list
        System.out.println("Student List: " + students);

        // Remove an element
        students.remove("Arjun");
        System.out.println("After removal: " + students);

        // Check for element presence
        System.out.println("Contains 'Riya'? " + students.contains("Riya"));

        // Size of list
        System.out.println("Total students: " + students.size());
    }
}
