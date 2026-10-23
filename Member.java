/** Represents a registered library member. */
public class Member {
    // Seven attributes
    private int memberId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private int booksBorrowed;
    private boolean active;

    // Default constructor
    public Member() {
        this(0, "Unknown", "Not provided", "Not provided", "Not provided", 0, true);
    }

    // Parameterized constructor
    public Member(int memberId, String name, String email, String phone,
                  String address, int booksBorrowed, boolean active) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.booksBorrowed = Math.max(0, booksBorrowed);
        this.active = active;
    }

    // Seven getters
    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public int getBooksBorrowed() { return booksBorrowed; }
    public boolean isActive() { return active; }

    // Seven setters
    public void setMemberId(int memberId) { this.memberId = memberId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setBooksBorrowed(int booksBorrowed) { this.booksBorrowed = Math.max(0, booksBorrowed); }
    public void setActive(boolean active) { this.active = active; }

    // Additional methods
    public void borrowBook() { booksBorrowed++; }
    public void returnBook() {
        if (booksBorrowed > 0) booksBorrowed--;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Books Borrowed: " + booksBorrowed);
        System.out.println("Account Active: " + (active ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
