public class StudentGrade {
    public static void main(String[] args) {
        String name = "Mysha"; // You can put your name here
        int score = 90;
        
        System.out.println("Student Name: " + name);
        System.out.println("Student Score: " + score);
        
        if (score >= 50) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}