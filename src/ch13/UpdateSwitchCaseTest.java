package ch13;

import java.util.Scanner;

public class UpdateSwitchCaseTest {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        month=sc.nextInt();
        int day=switch(month){
            case 1,3,7,8,10,12->{yield 31;}

            case 2->{yield 28;}

            case 4,6,9,11->{yield 30;}

            default->{ System.out.println("error");
            yield 0;}

        };

        System.out.println(month+"달은 "+day+"일까지 있습니다.");
    }
}
