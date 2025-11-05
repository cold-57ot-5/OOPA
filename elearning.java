public abstract class Course {
    String courseName;

    abstract void startCourse();
    abstract void endCourse();

    void getCourseDetails() {
        System.out.println("Course Name: " + courseName);
    }

    void giveCertificate() {
        System.out.println("Certificate issued successfully!");
    }
}

class ProgrammingCourse extends Course {
    ProgrammingCourse(String name) {
        courseName = name;
    }

    void startCourse() {
        System.out.println(courseName + " started with coding assignments.");
    }

    void endCourse() {
        System.out.println(courseName + " completed with final project submission.");
    }
}

class LanguageCourse extends Course {
    LanguageCourse(String name) {
        courseName = name;
    }

    void startCourse() {
        System.out.println(courseName + " started with grammar lessons.");
    }

    void endCourse() {
        System.out.println(courseName + " completed with fluency test.");
    }
}

public class ELearning {
    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse("Java Programming");
        c1.startCourse();
        c1.endCourse();
        c1.giveCertificate();
    }
}
 {
    
}
