class Person {
    String name;

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String studentID;

    void setDetails(String name, String id) {
        this.name = name;
        this.studentID = id;
    }

    void showStudent() {
        System.out.println("Student ID: " + studentID);
    }
}

class GraduateStudent extends Student {
    void submitThesis() {
        System.out.println("Thesis submitted successfully.");
    }

    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.setDetails("Lioren", "S102");
        gs.displayInfo();
        gs.showStudent();
        gs.submitThesis();
    }
}
