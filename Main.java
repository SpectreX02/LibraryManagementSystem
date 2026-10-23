import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        int choice = 0;

        while (choice != 7) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display Books");
            System.out.println("4. Display Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                input.nextLine();
                continue;
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Title: ");
                    String title = input.nextLine();

                    System.out.print("Enter Author: ");
                    String author = input.nextLine();

                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Member Name: ");
                    String name = input.nextLine();

                    Member member = new Member(memberId, name);
                    library.addMember(member);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    library.displayMembers();
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int borrowId = input.nextInt();

                    System.out.print("Enter Member ID: ");
                    int borrowMemberId = input.nextInt();

                    library.borrowBook(borrowId, borrowMemberId);
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    int returnId = input.nextInt();

                    library.returnBook(returnId);
                    break;

                case 7:
                    System.out.println("Thank you for using the Library System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        input.close();
    }
}