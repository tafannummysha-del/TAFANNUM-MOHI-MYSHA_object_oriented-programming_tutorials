public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setStudentID("202505010344");
        s.setName("NABID REAZUL ISLAM");
        s.setCGPA(3.75);

        System.out.println("Student ID : " + s.getStudentID());
        System.out.println("Name       : " + s.getName());
        System.out.println("CGPA       : " + s.getCGPA());
        System.out.println("Programme  : BIT");
    }
}
