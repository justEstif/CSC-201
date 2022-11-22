/*this class takes in the book title, author, and number of pages*/
public class Book {
	private String bookTitle;
	private String author;
	private int numberOfPages;
	public Book(String bookTitle, String author, int numberOfPages) {//parameters of the book consructor
			this.bookTitle = bookTitle;
			this.author = author;
			this.numberOfPages = numberOfPages;	
	}
	public String toString() {
		return "\nThe book " + bookTitle + " by " + author  + " has " 
				+ numberOfPages + " pages.";
	}
}
