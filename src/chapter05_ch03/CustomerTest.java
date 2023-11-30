package chapter05_ch03;


public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee=new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerId(10010);
//        customerLee.bonusPoint=1000;
//        System.out.println(customerLee.showCustomerInfo());
        //default constructor인경우(매개변수 없음)
//        VIPCustomer customerKim=new VIPCustomer();
        //super class의 constructor가 매개변수를 갖는 경우
        VIPCustomer customerKim=new VIPCustomer(10020,"김유신");
//        Customer(int,String) call
//        VIPCustomer() call
//        김유신님의 등급은VIP이며, 보너스 포인트는10000입니다

        customerKim.bonusPoint=10000;

        System.out.println(customerKim.showCustomerInfo());
        //Customer call
        //VIPCustomer() call
        //자식클래스를 호출하면 부모클래스가 먼저 생성되고, 자식 클래스가 생성되는 것을 볼 수 있다
    }
}
