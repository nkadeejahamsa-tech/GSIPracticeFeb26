package weeklyAssignment;

public class Book {
	String title;
	String author;
	public static String libraryName = "City Library";
	final int isbn = 12345;
//	String description;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
//		this.description = description;
	}

	static void showLibrary() {
		System.out.println("Library: " + libraryName);
	}

	public void getDescription() {
//		this.description = description;
		System.out.println("This is a physical book");
	}

	void displayIsbn() {
//		isbn=4567;
	}

	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + isbn);

	}
}

class EBook extends Book {
	int fileSize;

	public EBook(String title, String author, int fileSize) {
		super(title, author);
		this.fileSize = fileSize;
	}

	void display() {
		super.display();
		System.out.println("File Size: " + fileSize + " mb");
	}

	public void getDescription() {
		super.getDescription();
		System.out.println("This is a Electronic book");

	}

}
