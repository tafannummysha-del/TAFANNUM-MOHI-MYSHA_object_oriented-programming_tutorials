public class Main {
    public static void main(String[] args) {
        // Person, Student, and Lecturer only take (Name, ID) in this tutorial
        Person p1 = new Person("Generic Person", "000");
        Student s1 = new Student("Mysha", "S123");
        Lecturer l1 = new Lecturer("Sir Nazmirul", "L456");

        p1.introduce();
        s1.introduce();
        l1.introduce();
    }
}