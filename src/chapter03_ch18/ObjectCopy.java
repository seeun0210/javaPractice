package chapter03_ch18;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library=new Book[5];
        Book[] copyLibrary=new Book[5];
        library[0]=new Book("태백산맥1","조정래");
        library[1]=new Book("태백산맥2","조정래");
        library[2]=new Book("태백산맥3","조정래");
        library[3]=new Book("태백산맥4","조정래");
        library[4]=new Book("태백산맥5","조정래");

        System.arraycopy(library,0,copyLibrary,0,5);
        for(Book book :library){
            book.showBookInfo();
        }
        System.out.println("=========");
        for(Book book:copyLibrary){
            book.showBookInfo();
        }
        //얕은 복사
        //한쪽에서 값을 바꾸면 다른 쪽에서도 값이 바뀜
        //같은 주소를 바라보고 있었음
        System.out.println("===얕은 복사===");
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");
        System.arraycopy(library,0,copyLibrary,0,5);
        for(Book book :library){
            book.showBookInfo();
        }
        System.out.println("=========");
        for(Book book:copyLibrary){
            book.showBookInfo();
        }

    }
}
