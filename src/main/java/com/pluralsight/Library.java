package com.pluralsight;
import java.util.Scanner;
import java.util.Scanner;

public class Library {
    private Book[] books;
    protected Scanner scanner;

    public Library() {
        books = new Book[20];
        initializeBooks();
        scanner = new Scanner(System.in);
    }

    private void initializeBooks() {
        books[0] = new Book(1, "0-545-01023-1", "101 Ways to Cook an Ooze");
        books[1] = new Book(2, "0-545-01023-2", "Physiologies of Magical Creatures");
        books[2] = new Book(3, "0-545-01023-3", "The Prophecies");
        books[3] = new Book(4, "0-545-01023-4", "How to Spot a Mimic");
        books[4] = new Book(5, "0-545-01023-5", "Bordrick’s Fantastic Adventure");
        books[5] = new Book(6, "0-545-01023-6", "Planeshifting");
        books[6] = new Book(7, "0-545-01023-7", "On Monstrous Races");
        books[7] = new Book(8, "0-545-01023-8", "The Outside");
        books[8] = new Book(9, "0-545-01023-9", "Human?");
        books[9] = new Book(10, "0-545-01024-0", "Landmarks to Visit Before You Die");
        books[10] = new Book(11, "0-545-01024-1", "The Hitchhiker’s Guide to the Kingdom");
        books[11] = new Book(12, "0-545-01024-2", "Incredible Creatures and How to Kill Them");
        books[12] = new Book(13, "0-545-01024-3", "Magic for Dummies");
        books[13] = new Book(14, "0-545-01024-4", "Wish It, Want It, Screw It");
        books[14] = new Book(15, "0-545-01024-5", "So Long, and Thanks for All the Ale");
        books[15] = new Book(16, "0-545-01024-6", "Flumphs; the Pleasant Surprises of the Underdark");
        books[16] = new Book(17, "0-545-01024-7", "Taming the Beast");
        books[17] = new Book(18, "0-545-01024-8", "A Day in the Life of a Lemure");
        books[18] = new Book(19, "0-545-01024-9", "The Spider King");
        books[19] = new Book(20, "0-545-01025-0", "The Bjernson Family Tree And Exploits");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book != null && !book.isCheckedOut()) {
                System.out.println("ID: " + book.getId());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Checked Out: " + book.isCheckedOut());
                System.out.println("Checked Out To: " + book.getCheckedOutTo());
                System.out.println();
            }
        }
    }

    public void showCheckedOutBooks() {
        System.out.println("Checked Out Books:");
        for (Book book : books) {
            if (book != null && book.isCheckedOut()) {
                System.out.println("ID: " + book.getId());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Checked Out: " + book.isCheckedOut());
                System.out.println("Checked Out To: " + book.getCheckedOutTo());
                System.out.println();
            }
        }
    }

    public void checkOutBook() {
        System.out.println("Enter the ID of the book you want to check out: ");
        if (scanner.hasNextInt()) {
            int bookId = scanner.nextInt();
            scanner.nextLine();

            for (Book book : books) {
                if (book != null && book.getId() == bookId) {
                    if (!book.isCheckedOut()) {
                        System.out.println("Enter your name: ");
                        String name = scanner.nextLine().trim();
                        book.checkOut(name);
                        System.out.println("You have checked out the book successfully!");
                    } else {
                        System.out.println("Sorry, this book is already checked out.");
                    }
                    return;
                }
            }
            System.out.println("Book with ID " + bookId + " not found.");
        } else {
            System.out.println("Invalid input. Please enter a valid book ID (a number).");
            scanner.next();
        }
    }

    public void checkInBook() {
        System.out.println("Enter the ID of the book you want to check in: ");
        if (scanner.hasNextInt()) {
            int bookId = scanner.nextInt();
            scanner.nextLine();

            for (Book book : books) {
                if (book != null && book.getId() == bookId) {
                    if (book.isCheckedOut()) {
                        book.checkIn();
                        System.out.println("You have checked in the book successfully!");
                    } else {
                        System.out.println("This book is not checked out.");
                    }
                    return;
                }
            }
            System.out.println("Book with ID " + bookId + " not found.");
        } else {
            System.out.println("Invalid input. Please enter a valid book ID (a number).");
            scanner.next();
        }
    }
}
