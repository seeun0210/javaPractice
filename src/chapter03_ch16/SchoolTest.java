package chapter03_ch16;

import java.util.Calendar;

public class SchoolTest {
    public static void main(String[] args) {
//        School s= new School();
        //constructor를 private로 만들었기 때문에 class외부에서 생성할 수 없다.
        School school1=School.getInstance();
        School school2=School.getInstance();
        System.out.println(school1==school2);//같은 주소를 가진다=> school1과 school2는 같은 인스턴스
        Calendar calender=Calendar.getInstance();
    }
}
