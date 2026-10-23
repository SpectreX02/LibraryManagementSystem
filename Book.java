/** Represents a book in the library. */
public class Book {
    // Seven attributes
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private int publicationYear;
    private boolean available;

    // Default constructor
    public Book() {
        this(0, "Unknown", "Unknown", "Unknown", "Unknown", 0, true);
    }

    // Parameterized constructor
    public Book(int bookId, String title, String author, String genre,
                String publisher, int publicationYear, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.available = available;
    }

    // Seven getters
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getPublisher() { return publisher; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return available; }

    // Seven setters
    public void setBookId(int bookId) { this.bookId = bookId; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    public void setAvailable(boolean available) { this.available = available; }

    // Additional methods
    public void markBorrowed() { available = false; }
    public void markReturned() { available = true; }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
