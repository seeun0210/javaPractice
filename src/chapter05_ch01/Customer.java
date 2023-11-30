package chapter05_ch01;

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

    public Customer(){
        customerGrade="SILVER";
        bonusRatio=0.01;
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
