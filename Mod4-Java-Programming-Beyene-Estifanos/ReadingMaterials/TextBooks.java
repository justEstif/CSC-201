
public class TextBooks extends Books{
	private String subject;
	public TextBooks() {
	}
	private TextBooks(String subject) {
		this.subject = subject;
	}
	public TextBooks(String title, String author, String genre, 
			String subject, int pageNumber, int year) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPageNumber(pageNumber);
		setYear(year);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
}

