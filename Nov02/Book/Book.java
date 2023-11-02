package train.Nov02.Book;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;


    public Book(int bookNo, String title, String author) {
        // TODO Auto-generated constructor stub
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        stateCode = 1;
        // this.stateCode = stateCode;
    }

    public void rent() {
        stateCode = 0;
    }

    public void print() {
        if(stateCode == 0)
            System.out.println(bookNo+" 책 제목: "+ title+" 저자: "+ author+ " 대여 유무: 대여 중");
        else
            System.out.println(bookNo+" 책 제목: "+ title+", 저자: "+ author+ ", 대여 유무: 재고 있음");
    }

}