package ch06;

public class DoubleTest {
    public static void main(String[] args) {
        double dnum=3.14;
        float fnum=3.14F;
        System.out.println(dnum);
        System.out.println(fnum);

        //부동소수점의 오류
        double mynum=1;
        for(int i=0;i<10000;i++){
            mynum=mynum+0.1;

        }
        System.out.println(mynum);//1001.000000000159
    }
}
