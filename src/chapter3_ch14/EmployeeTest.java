package chapter3_ch14;

import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmployeeName("이순신");
        Employee employeekim=new Employee();
        employeekim.setEmployeeName("김유신");
        //pulbic으로 static 변수를 선언했다면?
//        employeekim.serialNum++;//증가시키면 아래에서도 값이 증가함(serialNum이라는 static 변수가 공유되고 있음을 알 수 있다)
//        System.out.println(employee.serialNum);//참조할 때 참조변수로 호출하지말고
//        System.out.println(employeekim.serialNum);
//        System.out.println(Employee.serialNum);//클래스 이름으로 호출하는게 더 적적함

        //private로 static 변수를 선언했다면?
        System.out.println(Employee.getSerialNum());
        System.out.println(employee.getEmployeeId());//1000
        System.out.println(employeekim.getEmployeeId());//1001
    }
}
