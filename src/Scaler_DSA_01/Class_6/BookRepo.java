package Scaler_DSA_01.Class_6;


import java.io.IOException;
import java.util.ArrayList;

public class BookRepo {
    ArrayList<Book> bookList;

    public BookRepo(String filePath) throws IOException{
        CSVDataLoader ld = new CSVDataLoader(filePath);
        bookList = ld.loadBookList();

    }
    public void printTitlesOFAllbooks(){
        for (Book book : bookList) {
            System.out.println(book.author);
        }
    }
  /*
    Implement all your functions here
  */
//    void print(){
//        for(int i = 0; i < bookList.size(); i++) {
//            bookList.get(i);
//        }
//    }
    void giveCount(String authorname){
        int c = 0;
        for (Book book : bookList) {
            if (book.author.equals(authorname)) {
                c++;
            }

        }
        System.out.println(c);
    }

}
