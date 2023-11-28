package ch08;

public class LocalVariableType {
    public static void main(String[] args) {
        var i=10;
        var j=10.0;
        var str="hello";
        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        str="test";
//        str=3; 이미 String으로 선언되었디 때문에 다른 자료형안됨
        System.out.println(str);
    }
}
