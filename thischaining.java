public class Student {
    int id;
    String name;
    String course;

    // Default constructor using this() to call parameterized constructor
    Student() {
        this(101, "Default Student", "Computer Science");
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Method using this.variable
    void displayDetails() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Course: " + this.course);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor
        Student s2 = new Student(102, "Maeve", "AI & ML"); // parameterized constructor

        s1.displayDetails();
        s2.displayDetails();
    }
}
