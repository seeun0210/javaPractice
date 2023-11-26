package chapter3_ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee=new Student(100,"lee");//생성자
studentLee.studentAddress="Seoul";
Student studentKim=new Student(101,"kim","newYork");//생성자 overloading 호출

studentLee.showStudentInfo();
studentKim.showStudentInfo();
        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
