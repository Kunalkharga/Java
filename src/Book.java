public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.display();

        Book parameterizedBook = new Book("OOP Java", " Pradyumna Bhattrai", 45.00);
        parameterizedBook.display();

        Book copiedBook = new Book(parameterizedBook);
        copiedBook.display();
    }
}
