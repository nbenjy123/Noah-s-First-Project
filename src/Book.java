import java.io.Serializable;

public class Book implements Serializable{
	private static int idCounter = 1; // Auto-increment ID
	private int id;
	private String title;
	private String author;
	private String genre;
	private int year;
	
	public Book(String title, String author, String genre, int year) {
		this.id = idCounter++;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	
	@Override
	public String toString() {
		return id + ". " + title + " by " + author + " (" + year + ") -" + genre;
	}
	
}
