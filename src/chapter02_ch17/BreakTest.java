package chapter02_ch17;

public class BreakTest {
    public static void main(String[] args) {
        int sum=0;
        int num;
        for(num=1; true; num++){
            sum+=num;
            if(sum>100)
                break;

        }
        System.out.println(sum);
        System.out.println(num);//14까지 더했을 때 105가 되었고, 15가 되었을 때 빠져나옴
    }
}
