public class Student {
    int id;
    String name;
    static String college;

    // Static block - runs once when class loads
    static {
        college = "KL University";
        System.out.println("Static block executed: College initialized.");
    }

    // Constructor for student object
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Static method to change college name
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Instance method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Divya");
        Student s2 = new Student(102, "Lioren");

        s1.display();
        s2.display();

        // Changing college name using static method
        Student.changeCollege("MIT");

        System.out.println("\nAfter changing college name:");
        s1.display();
        s2.display();
    }
}
