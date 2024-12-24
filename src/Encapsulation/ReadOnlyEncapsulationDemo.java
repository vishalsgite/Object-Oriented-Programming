package Encapsulation;

//Fields are made immutable by providing only getters and no setters.
class Book {
    private final String title;
    private final String author;

    // Constructor to initialize fields
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Only getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class ReadOnlyEncapsulationDemo {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
    }
}
