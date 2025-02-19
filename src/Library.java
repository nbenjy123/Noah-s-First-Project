import java.io.*;
import java.util.*;

public class Library {
	private List<Book> books;
	private static final String FILE_NAME = "books.txt";
	
	public Library() {
		books = new ArrayList<>();
		loadBooks(); // Load books from file
	}
	
	public void addBook(String title, String author, String genre, int year) {
		books.add(new Book(title, author, genre, year));
		saveBooks();
		System.out.println("Book added successfully!");
	}
	
	public void removeBook(int id) {
		boolean removed = books.removeIf(book -> book.getId() == id);
		if(removed) {
			saveBooks();
			System.out.println("Book removed successfully!");
		}
		else {
			System.out.println("Book with ID " + id + " not found.");
		}
	}
	
	public void listBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the libary");
		}
		else {
			books.forEach(System.out::println);
		}
	}
	
	public void searchBooks(String keyword) {
		books.stream()
			.filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase())||
							book.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
			.forEach(System.out::println);
	}
	
	public void saveBooks() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
			oos.writeObject(books);
		} catch (IOException e) {
			System.out.println("Error saving books: " + e.getMessage());
		}
	}
	
	private void loadBooks() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
			books = (List<Book>) ois.readObject();
		} catch (FileNotFoundException e){
			books = new ArrayList<>(); //No file yet, start fresh
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading books: " + e.getMessage());
		}
	}
}
