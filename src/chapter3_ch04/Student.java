package chapter3_ch04;

public class Student {
    int studentId;
    String studentName;
    String studentAddress;
    public Student(){};
    public Student(int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public Student(int studentId, String studentName, String studentAddress){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }
    public void showStudentInfo(){
        System.out.println(studentId+","+studentName+","+studentAddress);
    }
    public String getStudentName(){
        return studentName;
    }

    public static void main(String[] args) {
        Student student = new Student(123,"kim");
        student.studentAddress="Seoul";
        student.showStudentInfo();
    }
}
