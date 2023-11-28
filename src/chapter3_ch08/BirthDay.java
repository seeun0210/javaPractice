package chapter3_ch08;

public class BirthDay {
    private int year;
    private int month;

    public boolean isValid() {
        return isValid;
    }

    boolean isValid=true;
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<0){
            isValid=false;
            return;
        }
        this.year = year;
    }

    private int day;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        if(month<1 ||month>12){
            isValid=false;
            return;
        }
        this.month = month;
    }
    public void printThis(){
        System.out.println(this);
    }


}
