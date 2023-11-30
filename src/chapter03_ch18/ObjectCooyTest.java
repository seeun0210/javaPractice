package chapter03_ch18;

import javax.swing.plaf.IconUIResource;

public class ObjectCooyTest {
    public static void main(String[] args) {
        Book[] library=new Book[5];
        Book[] copyLibrary=new Book[5];
        library[0]=new Book("태백산맥1","조정래");
        library[1]=new Book("태백산맥2","조정래");
        library[2]=new Book("태백산맥3","조정래");
        library[3]=new Book("태백산맥4","조정래");
        library[4]=new Book("태백산맥5","조정래");

        for(int i=0;i< library.length;i++){
            copyLibrary[i]=new Book();
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());

        }
        //위에서 copyLibrary배열에 새로운 Book 인스턴스를 각각 생성하고 각각의 원소에 library를 할당함
        System.out.println("===깊은 복사===");
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        for(Book book :library){
            book.showBookInfo();
        }
        System.out.println("=========");
        for(Book book:copyLibrary){
            book.showBookInfo();
        }
        //출력결과 library[0]의 값만 바뀌고, copyLibrary의 값은 바뀌지 않았음을 알 수 있음
        //서로 다른 주소값을 바라보고 있었기 때문!!(인스턴스가 분리되어있었던거임!!)
    }
}
