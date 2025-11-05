import java.util.*;

class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Buy groceries");
        tasks.add("Finish assignment");
        tasks.add("Call plumber");

        // Retrieve by index
        System.out.println("Task at index 1: " + tasks.get(1));

        // Remove completed task
        tasks.remove("Finish assignment");

        // Sort tasks
        Collections.sort(tasks);

        // Display sorted tasks
        System.out.println("Sorted To-Do List: " + tasks);

        // Check if list is empty
        System.out.println("Is To-Do List empty? " + tasks.isEmpty());
    }
}
