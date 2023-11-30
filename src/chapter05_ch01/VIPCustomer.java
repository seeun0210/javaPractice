package chapter05_ch01;

public class VIPCustomer extends Customer{
    private int agentID;
    double salesRatio;
    public VIPCustomer(){
        //super class에서 customerGrade를 private로 선언한 경우
//        setCustomerGrade("VIP");
        //protected 접근제한자로 선언한 경우
        customerGrade="VIP";
        salesRatio=0.05;
        bonusRatio=0.1;
    }
    public int getAgentID(){
        return agentID;
    }

}
