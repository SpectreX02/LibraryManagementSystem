import java.util.ArrayList;

/** Manages books and members and stores librarian details. */
public class Librarian {
    // Seven librarian attributes
    private int librarianId;
    private String name;
    private String email;
    private String phone;
    private String shift;
    private int yearsExperience;
    private boolean onDuty;

    // Collections managed by this librarian
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Default constructor
    public Librarian() {
        this(0, "Unknown", "Not provided", "Not provided", "Day", 0, true);
    }

    // Parameterized constructor
    public Librarian(int librarianId, String name, String email, String phone,
                     String shift, int yearsExperience, boolean onDuty) {
        this.librarianId = librarianId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.shift = shift;
        this.yearsExperience = Math.max(0, yearsExperience);
        this.onDuty = onDuty;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Seven getters
    public int getLibrarianId() { return librarianId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getShift() { return shift; }
    public int getYearsExperience() { return yearsExperience; }
    public boolean isOnDuty() { return onDuty; }

    // Seven setters
    public void setLibrarianId(int librarianId) { this.librarianId = librarianId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setShift(String shift) { this.shift = shift; }
    public void setYearsExperience(int yearsExperience) { this.yearsExperience = Math.max(0, yearsExperience); }
    public void setOnDuty(boolean onDuty) { this.onDuty = onDuty; }

    // Additional method: display librarian details
    public void displayLibrarian() {
        System.out.println("Librarian ID: " + librarianId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Shift: " + shift);
        System.out.println("Years of Experience: " + yearsExperience);
        System.out.println("On Duty: " + (onDuty ? "Yes" : "No"));
    }

    // Add a book, preventing duplicate IDs
    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Cannot add an empty book record.");
            return;
        }
        for (Book existing : books) {
            if (existing.getBookId() == book.getBookId()) {
                System.out.println("Book ID already exists!");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Register a member, preventing duplicate IDs
    public void addMember(Member member) {
        if (member == null) {
            System.out.println("Cannot add an empty member record.");
            return;
        }
        for (Member existing : members) {
            if (existing.getMemberId() == member.getMemberId()) {
                System.out.println("Member ID already exists!");
                return;
            }
        }
        members.add(member);
        System.out.println("Member registered successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) book.displayBook();
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        for (Member member : members) member.displayMember();
    }

    // Borrow a book if the member and book exist and the book is available
    public void borrowBook(int bookId, int memberId) {
        Member foundMember = null;
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                foundMember = member;
                break;
            }
        }
        if (foundMember == null) {
            System.out.println("Member not found!");
            return;
        }
        if (!foundMember.isActive()) {
            System.out.println("This member's account is inactive.");
            return;
        }
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (!book.isAvailable()) {
                    System.out.println("Book is already borrowed!");
                } else {
                    book.markBorrowed();
                    foundMember.borrowBook();
                    System.out.println("Book borrowed successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return a borrowed book
    public void returnBook(int bookId, int memberId) {
        Member foundMember = null;
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                foundMember = member;
                break;
            }
        }
        if (foundMember == null) {
            System.out.println("Member not found!");
            return;
        }
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isAvailable()) {
                    System.out.println("Book was not borrowed!");
                } else {
                    book.markReturned();
                    foundMember.returnBook();
                    System.out.println("Book returned successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
