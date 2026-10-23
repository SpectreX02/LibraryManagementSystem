public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    // Default constructor
    public Book() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        available = true;
    }

    // Parameterized constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
        System.out.println("----------------------");
    }
}