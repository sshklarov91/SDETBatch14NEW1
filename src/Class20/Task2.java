package Class20;

public class Task2 {
    public static void main(String[] args) {
        Book iHateJava = new Book("hatejava","hate",25,3125);
    }
}
class Book {
    String name;
    String author;
    int numOfPages;
    int ISBN;

    public Book(String name, String author, int numOfPages,int ISBN) {
        this(name,author,numOfPages);
        this.ISBN = ISBN;
    }

    public Book(String name, String author, int numOfPages) {
        this.name = name;
        this.author = author;
        this.numOfPages = numOfPages;
    }
}




