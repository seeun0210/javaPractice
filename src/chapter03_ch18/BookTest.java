package chapter03_ch18;

public class BookTest {
    public static void main(String[] args) {
        Book[] library=new Book[5];
        library[0]=new Book("태백산맥","조정래");
        library[1]=new Book("태백산맥","조정래");
        library[2]=new Book("태백산맥","조정래");
        library[3]=new Book("태백산맥","조정래");
        library[4]=new Book("태백산맥","조정래");
        for(Book book:library){
            System.out.println(book);
            book.showBookInfo();
        }

    }
}
