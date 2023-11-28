package chapter3_ch08;

import java.util.Formatter;

public class Student {
    int studentId;
    String studentName;
    Subject korean;
    Subject math;
    public Student(int id, String name){
        this.studentId= id;
        this.studentName=name;
        korean=new Subject();
        math=new Subject();


    }
    public void setKoreanSubject(String name, int score){
        korean.subjectName=name;
        korean.score=score;
    }
    public void setMathSubject(String name, int score){
        math.subjectName=name;
        math.score=score;
    }
    public void showStudentScore(){
        int total =korean.score+math.score;
        System.out.println(studentName+"학생의 총점은"+total+"점 입니다.");
    }
}
