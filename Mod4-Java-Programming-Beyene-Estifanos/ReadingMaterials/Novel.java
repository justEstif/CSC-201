
public class Novel extends Books{
	private int volume;
	public Novel() {
	}
	private Novel(int volume) {
		this.volume = volume;
	}
	public Novel(String title, String author, String genre, 
			int volume, int pageNumber, int year) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPageNumber(pageNumber);
		setYear(year);
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
}
