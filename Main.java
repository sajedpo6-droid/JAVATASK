class Student {
    String studentName;
    String registrationStatus;
    String examinationCentre;

    static {
        System.out.println("1. Static Block: Loading UNEB examination settings...");
        System.out.println("   Exam Year: 2026");
        System.out.println("   Registration Fee: UGX 50,000");
        System.out.println("   Grading Policy: UNEB Standard Grading");
    }

    {
        System.out.println("2. Instance Initialization Block: Setting default values...");
        registrationStatus = "Registered";
        examinationCentre = "UNEB Main Centre";
    }

    Student(String name) {
        System.out.println("3. Constructor: Creating student object...");
        studentName = name;
    }


    void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Status: " + registrationStatus);
        System.out.println("Examination Centre: " + examinationCentre);
        System.out.println("--------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== UNEB CANDIDATE REGISTRATION ===");

        System.out.println("\nCreating first student...");
        Student student1 = new Student("John");

        System.out.println("\nCreating second student...");
        Student student2 = new Student("Mary");

        System.out.println("\n=== STUDENT DETAILS ===");
        student1.displayStudent();
        student2.displayStudent();
    }
}