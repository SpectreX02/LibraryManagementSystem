# Library Management System

## Project Description

The Library Management System is a Java-based project developed for an Object-Oriented Programming assignment. The system allows users to manage books, register library members, borrow and return books, and view librarian information through a menu-driven program.

The project demonstrates the use of classes, objects, encapsulation, constructors, getter and setter methods, selection statements, and looping structures in Java.

## Features

- Add books with details such as book ID, title, author, genre, publisher, and publication year.
- Register library members and store their personal information.
- Display all registered books and members.
- Borrow available books and update their availability status.
- Return borrowed books and update member borrowing records.
- Display librarian information.
- Prevent duplicate book IDs and member IDs.
- Validate integer input to reduce errors caused by invalid user input.
- Check member account status before allowing book borrowing.

## Project Structure

The project contains the following Java source files:

- **Book.java** — Represents a book and stores seven attributes. It includes constructors, getters, setters, methods for borrowing and returning books, and a method to display book details.
- **Member.java** — Represents a library member and stores seven attributes. It includes constructors, getters, setters, methods to update borrowing records, and a method to display member details.
- **Librarian.java** — Stores librarian information and manages book and member records, including borrowing and returning operations.
- **Main.java** — Contains the main method and menu system used to interact with the application.

## Object-Oriented Programming Concepts

This project applies several OOP concepts:

**Encapsulation:** Attributes are declared private, with public getter and setter methods providing access to the data.

**Classes and Objects:** The Book, Member, and Librarian classes represent different entities in the library system.

**Constructors:** Default and parameterized constructors initialize objects with default or specified values.

**Methods:** Additional methods perform operations such as displaying information, borrowing books, and returning books.

**Selection Structures:** Switch and conditional statements are used to process menu choices and check conditions.

**Looping Structures:** Loops are used to repeat the menu, search records, and display collections of books and members.

## Requirements

- Java Development Kit (JDK)
- A Java IDE or terminal that supports Java compilation and execution

## How to Compile and Run

1. Download or clone this repository.
2. Open a terminal in the project folder.
3. Compile all Java source files:

   ```bash
   javac *.java
   ```

4. Run the application:

   ```bash
   java Main
   ```

## Menu Options

The program provides eight menu options:

1. Add Book
2. Register Member
3. Display Books
4. Display Members
5. Borrow Book
6. Return Book
7. Display Librarian
8. Exit

## Limitations

The current version stores book and member records in memory while the program is running. The records are not saved permanently, so they are lost when the program closes.

## Future Improvements

Possible improvements include permanent data storage, book searching, borrowing history, due dates, overdue notifications, and a graphical user interface.

## Purpose

This project provides practical experience in Java programming and demonstrates how Object-Oriented Programming principles can be applied to a simple library management application.
