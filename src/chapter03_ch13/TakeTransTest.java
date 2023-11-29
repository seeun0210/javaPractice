package chapter03_ch13;

public class TakeTransTest {
    public static void main(String[] args) {
        Student student1=new Student("James",5000);
        Student student2=new Student("Tomas",10000);
        Bus bus100 =new Bus(100);
        Subway subwayGreen=new Subway(2);
        student1.takeBus(bus100);
        student2.takeSubway(subwayGreen);
        student1.showStudentInfo();
        student2.showStudentInfo();
        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();


    }
}
