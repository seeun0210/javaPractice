package chapter3_ch08;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay day=new BirthDay();
        day.setDay(15);
        day.setYear(2023);
        day.setMonth(12);
        System.out.println(day.isValid());

        day.printThis();
    }
}
