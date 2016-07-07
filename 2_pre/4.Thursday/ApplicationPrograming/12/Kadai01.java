package kg12;

public class Kadai01 {
    public static void main(String[] args){
        Student s1 = new Student("C0115901", 58);
        Student s2 = new Student("C0115902", 76);
        
        System.out.println("=== RAW SCORE ===");
        System.out.println(s1.getStudentId() + ", " + s1.getScore() + ", " + s1.isPass());
        System.out.println(s2.getStudentId() + ", " + s2.getScore() + ", " + s2.isPass());
        System.out.println("");
        
        s1.adjust(5);
        s2.adjust(-10);
        
        System.out.println("=== TUNED SCORE ===");
        System.out.println(s1.getStudentId() + ", " + s1.getScore() + ", " + s1.isPass());
        System.out.println(s2.getStudentId() + ", " + s2.getScore() + ", " + s2.isPass());
        
        
    }
}
