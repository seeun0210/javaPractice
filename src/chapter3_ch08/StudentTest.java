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
        System.out.println(studentLee.getStudentId());//private접근제한자인 studentId를 이렇게 확인할 수 있다.
        //private접근제한자인 studentName을 setStudentName을 호출해서 바굴 수 있다
        studentKim.setStudentName("James");
        System.out.println(studentKim.getStudentName());//Kim의 이름이 James로 바뀐 것을 확인할 수 있다.


    }
}
