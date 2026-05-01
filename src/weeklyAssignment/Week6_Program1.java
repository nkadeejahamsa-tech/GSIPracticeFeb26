package weeklyAssignment;

public class Week6_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EBook ebook = new EBook("Life is a Game", "Kadeeja N", 150, "This is physical book");
		Book.showLibrary();
		Book e = new EBook("Java", "James", 5);
		e.display();
		e.getDescription();
		Book.showLibrary();
		e.displayIsbn();
		String bookTitle = "My Life is a FairyLand";
		System.out.println(bookTitle.toUpperCase());
		System.out.println(bookTitle.length());
		boolean result = bookTitle.contains("Life");
		System.out.println(result);
	}

}
