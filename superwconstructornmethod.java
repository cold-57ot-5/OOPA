class Person {
    String name;

    // Parent class constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called.");
    }

    void display() {
        System.out.println("Person Name: " + name);
    }
}

class Student extends Person {
    int id;

    // Child class constructor using super()
    Student(String name, int id) {
        super(name);  // calls Person(String name)
        this.id = id;
        System.out.println("Student constructor called.");
    }

    void show() {
        super.display(); // calling parent method
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        Student s = new Student("Divya", 501);
        s.show();
    }
}
