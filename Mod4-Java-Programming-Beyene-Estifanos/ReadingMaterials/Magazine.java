
public class Magazine extends ReadingMaterial{
	private String cover;
	public Magazine() {
	}
	public Magazine(String cover) {
		this.cover = cover;
	}
	public Magazine(String title, String author, String genre, String cover, 
			int pageNumber, int year) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPageNumber(pageNumber);
		setYear(year);
		this.cover = cover;
	}
	public String getCover() {
		return cover;
	}
}
