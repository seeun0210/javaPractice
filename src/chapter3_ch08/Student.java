package chapter3_ch08;

import java.util.Formatter;

public class Student {
    private int studentId;
    private String studentName;
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
    public int getStudentId(){//private한 접근 제한자를 갖는 studentId를 외부 클래스에서 보여주기 위함
        return studentId;
    }
    //private으로 접근제한자로 선언된 변수는 클래스 외부에서 값을 변경할 수 없는데 set을 써서 변경할 수 있도록 한다
    public void setStudentName(String name){
        this.studentName=name;
    }
    public String getStudentName(){
        return studentName;
    }
    //즉, private접근제한자에 대해 setter를 제공하지 않으면 마음대로 값을 바꿀 수 없다.

}
