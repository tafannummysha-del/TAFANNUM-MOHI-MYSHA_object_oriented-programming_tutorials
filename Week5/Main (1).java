public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setStudentID("202505010137");
        s.setName("Mysha");
        s.setCGPA(3.89);

        System.out.println("Student ID : " + s.getStudentID());
        System.out.println("Name       : " + s.getName());
        System.out.println("CGPA       : " + s.getCGPA());
        System.out.println("Programme  : BIT");
    }
}
