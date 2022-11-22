
public class ReadingMaterial{
	private String title;
	private String author;
	private String genre;
	private int pageNumber;
	private int year;
	public ReadingMaterial() {
		}
	public ReadingMaterial(String title, String author, String genre, 
				int pageNumber, int year) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageNumber = pageNumber;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return  author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return author + " is the author of " + title + ". \nIts genre is "
				+ genre + " and it has " + pageNumber + " pages.";
	}
}

