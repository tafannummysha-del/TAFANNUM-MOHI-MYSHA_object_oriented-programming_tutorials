public class Student {
    // Attributes (Variables)
    String name;
    int age;
    double gpa;

    // Constructor (This sets up the student's information)
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to show student details
    public void displayInfo() {
        System.out.println("----- Student Info -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Another Method
    public void study() {
        System.out.println(name + " is currently studying Java.");
    }
}