package chapter3_ch08;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee=new Student(100,"Lee");
        Student studentKim=new Student(101, "Kim");
        studentLee.setKoreanSubject("국어",100);
        studentLee.setMathSubject("수학",100);
        studentLee.showStudentScore();
        studentKim.setKoreanSubject("국어",100);
        studentKim.setMathSubject("수학",100);
        studentKim.showStudentScore();

    }
}
