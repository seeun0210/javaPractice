package chapter03_ch11;

public class Person {
    private String name;
    private int age ;
    public Person(){
//        this.name=name;//this() statement이전에 statement를 쓸 수 없음.
        this("이름없음",1);
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Person getPerson(){//this를 반환할 때는 class자체를 type으로 두면 된다
        return this;
    }

    public static void main(String[] args) {
        Person person =new Person();
        System.out.println(person.name);
        System.out.println(person.age);
    }

}
