

public class Books extends ReadingMaterial{
	public Books() {
	}
	public Books(String title, String author, String genre, 
			int pageNumber, int year) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPageNumber(pageNumber);
		setYear(year);
	}
}
