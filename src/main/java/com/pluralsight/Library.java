package com.pluralsight;

import java.util.Scanner;

public class Library {
    private Book[] books;
    private Scanner scanner;

    public Library() {
        books = new Book[20];
        books[0] = new Book(1, "ISBN1", "101 Ways to Cook an Ooze");
        books[1] = new Book(2, "ISBN2", "Physiologies of Magical Creatures");
        books[2] = new Book(3, "ISBN3", "The Prophecies");
        books[3] = new Book(4, "ISBN4", "How to Spot a Mimic");
        books[4] = new Book(5, "ISBN5", "Bordrick’s Fantastic Adventure");
        books[5] = new Book(6, "ISBN6", "Planeshifting");
        books[6] = new Book(7, "ISBN7", "On Monstrous Races");
        books[7] = new Book(8, "ISBN8", "The Outside");
        books[8] = new Book(9, "ISBN9", "Human?");
        books[9] = new Book(10, "ISBN10", "Landmarks to Visit Before You Die");
        books[10] = new Book(11, "ISBN11", "The Hitchhiker’s Guide to the Kingdom");
        books[11] = new Book(12, "ISBN12", "Incredible Creatures and How to Kill Them");
        books[12] = new Book(13, "ISBN13", "Magic for Dummies");
        books[13] = new Book(14, "ISBN14", "Wish It, Want It, Screw It");
        books[14] = new Book(15, "ISBN15", "So Long, and Thanks for All the Ale");
        books[15] = new Book(16, "ISBN16", "Flumphs; the Pleasant Surprises of the Underdark");
        books[16] = new Book(17, "ISBN17", "Taming the Beast");
        books[17] = new Book(18, "ISBN18", "A Day in the Life of a Lemure");
        books[18] = new Book(19, "ISBN19", "The Spider King");
        books[19] = new Book(20, "ISBN20", "The Bjernson Family Tree And Exploits");

        scanner = new Scanner(System.in);
    }

    public void showHomeScreen() {
        while (true) {
            System.out.println("Welcome to the Neighborhood Library!");
            System.out.println("Options:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Search for a Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    showAvailableBooks();
                    break;
                case 2:
                    searchForBook();
                    break;
                case 3:
                    System.out.println("Thank you for using the Neighborhood Library. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void searchForBook() {
        System.out.print("Enter a keyword to search for a book: ");
        String keyword = scanner.nextLine();

        System.out.println("Search results:");
        for (Book book : books) {
            if (book != null && book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}
