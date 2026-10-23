import java.util.Scanner;

/** Main entry point and menu for the Library Management System. */
public class Main {
    // Read an integer safely so invalid text does not crash the program.
    private static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = input.nextLine().trim();
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static String readText(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Librarian librarian = new Librarian(501, "Aina Rahman",
                "aina@library.com", "012-3456789", "Morning", 4, true);
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Display Books");
            System.out.println("4. Display Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Display Librarian");
            System.out.println("8. Exit");
            choice = readInt(input, "Enter your choice: ");

            switch (choice) {
                case 1: {
                    int id = readInt(input, "Enter Book ID: ");
                    String title = readText(input, "Enter Title: ");
                    String author = readText(input, "Enter Author: ");
                    String genre = readText(input, "Enter Genre: ");
                    String publisher = readText(input, "Enter Publisher: ");
                    int year = readInt(input, "Enter Publication Year: ");
                    librarian.addBook(new Book(id, title, author, genre,
                            publisher, year, true));
                    break;
                }
                case 2: {
                    int id = readInt(input, "Enter Member ID: ");
                    String name = readText(input, "Enter Member Name: ");
                    String email = readText(input, "Enter Email: ");
                    String phone = readText(input, "Enter Phone: ");
                    String address = readText(input, "Enter Address: ");
                    librarian.addMember(new Member(id, name, email, phone,
                            address, 0, true));
                    break;
                }
                case 3:
                    librarian.displayBooks();
                    break;
                case 4:
                    librarian.displayMembers();
                    break;
                case 5: {
                    int bookId = readInt(input, "Enter Book ID: ");
                    int memberId = readInt(input, "Enter Member ID: ");
                    librarian.borrowBook(bookId, memberId);
                    break;
                }
                case 6: {
                    int bookId = readInt(input, "Enter Book ID: ");
                    int memberId = readInt(input, "Enter Member ID: ");
                    librarian.returnBook(bookId, memberId);
                    break;
                }
                case 7:
                    librarian.displayLibrarian();
                    break;
                case 8:
                    System.out.println("Thank you for using the Library Management System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose 1-8.");
            }
        } while (choice != 8);

        input.close();
    }
}
