package ch13;

import java.util.Scanner;

public class SwitchCaseTest1 {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        month=sc.nextInt();
        int day=0;
        switch(month){
            case 1: case 3: case 5: case 7:  case 8: case 10: case 12:
                day=31;
                break;
            case 2:
                day=28;
                break;
            case 4:  case 6:  case 9:  case 11:
                day=30;
                break;
            default:
                System.out.println("error");
        }
        System.out.println(month+"달은 "+day+"일까지 있습니다.");
    }
}
