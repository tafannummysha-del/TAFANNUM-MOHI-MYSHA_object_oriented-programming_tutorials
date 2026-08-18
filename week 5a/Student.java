public class Student {

    // Private variables (encapsulation)
    private String studentID;
    private String name;
    private double cgpa;

    // Setter method for Student ID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Setter method for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter method for Student ID
    public String getStudentID() {
        return studentID;
    }

    // Getter method for Name
    public String getName() {
        return name;
    }

    // Getter method for CGPA
    public double getCGPA() {
        return cgpa;
    }
}