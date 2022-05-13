import java.util.Scanner;

abstract class Book {
    String title;
    String author;
    Book(String title ,String author){
        this.author= author;
        this.title = title;
    }
    abstract void display();

}

