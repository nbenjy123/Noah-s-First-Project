import java.util.Scanner;


public class LibraryManager {
	private static Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		
		Library library = new Library();
	
	
	while (true) {
		System.out.println("\n Personal Library Manager");
		System.out.println("1. Add a Book");
		System.out.println("2. Remove a Book");
		System.out.println("3. List All Books");
		System.out.println("4. Search Books");
		System.out.println("5. Exit");
		System.out.print("Choose an option: ");
		
		int choice = getValidInt();

		
		switch (choice ) {
		case 1 -> {
			System.out.print("Title: ");
			String title = scnr.nextLine();
			System.out.print("Author: ");
			String author = scnr.nextLine();
			System.out.print("Genre: ");
			String genre = scnr.nextLine();
			System.out.print("Year: ");
			int year = getValidInt();
			library.addBook(title, author, genre, year);
		}
		
		case 2 -> {
			System.out.print("Enter book ID to remove: ");
			int id = getValidInt();
			library.removeBook(id);
		}
		case 3 -> library.listBooks();
		case 4 -> {
			System.out.print("Enter keyword: ");
			String keyword = scnr.nextLine();
			library.searchBooks(keyword);
		}
		case 5 -> {
			System.out.println("Exiting...");
			scnr.close();
			System.exit(0);
		}
		default -> System.out.println("Invalid choice. Try again.");
		}
	  }
	}
	private static int getValidInt() {
		while(true) {
			try {
			return Integer.parseInt(scnr.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.print("Invalid input!!!! Please enter a number: ");
			}
		}
	}
	
}
