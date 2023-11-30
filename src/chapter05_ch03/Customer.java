package chapter05_ch03;

public class Customer {

//    private int customerId;
//    private String customerName;
//    private String customerGrade;
    //자식클레스에 상속할 거라면 protected로 선언한다
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    String agentID;
//default constructor(생성자):매개변수가 없는것
    //자식클래스에서 상속을 받으면 프리 컴파일 상태에서 자동으로 호출 됨
    //default constructor가 없으면 하위클래스에서 명시적으로 super()를 호출해주어야 함.
//    public Customer(){
//        customerGrade="SILVER";
//        bonusRatio=0.01;
//        System.out.println("Customer call");
//    }

    public Customer(int customerId, String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
        customerGrade="SILVER";
        bonusRatio=0.01;
        System.out.println("Customer(int,String) call");
    }
    public int calcPrice(int price){
        bonusPoint +=price*bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
    public String showCustomerInfo(){
        return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다";
    }
}
