import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getBookId() == book.getBookId()) {
                System.out.println("Book ID already exists!");
                return;
            }
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Add a member
    public void addMember(Member member) {
        for (Member m : members) {
            if (m.getMemberId() == member.getMemberId()) {
                System.out.println("Member ID already exists!");
                return;
            }
        }

        members.add(member);
        System.out.println("Member added successfully!");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }

    // Display all members
    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            for (Member member : members) {
                member.displayMember();
            }
        }
    }

    // Borrow a book
    public void borrowBook(int bookId, int memberId) {
        boolean memberFound = false;

        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                memberFound = true;
                break;
            }
        }

        if (!memberFound) {
            System.out.println("Member not found!");
            return;
        }

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book is already borrowed!");
                }
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Return a book
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not borrowed!");
                }
                return;
            }
        }

        System.out.println("Book not found!");
    }
}