package ch11;

public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        int num1=10;
        int i=2;
        boolean value;
        value=((num1=num1+10)<10)&&((i=i+2)<10);
        System.out.println(value);//false이기 때문에
        System.out.println(num1);//여기까지 실행되고
        System.out.println(i);//이건 실행되지 않아서 i는 여전히 2임

        value=((num1=num1+10)<10)||((i=i+2)<10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
