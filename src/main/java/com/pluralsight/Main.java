package com.pluralsight;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to the Neighborhood Library!");

        while (true) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Check In a Book");
            System.out.println("5. Exit");

            int choice = library.scanner.nextInt();

            switch (choice) {
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    library.showCheckedOutBooks();
                    break;
                case 3:
                    library.checkOutBook();
                    break;
                case 4:
                    library.checkInBook();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
