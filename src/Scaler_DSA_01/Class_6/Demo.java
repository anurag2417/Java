package Scaler_DSA_01.Class_6;

import java.io.IOException;


public class Demo {
    public static void main(String[] args) throws IOException {
        BookRepo repo = new BookRepo("C:/Users/amarj/Downloads/Sheet.csv");
        //repo.printTitlesOFAllbooks();

        repo.giveCount("George Orwell");

    }
}
