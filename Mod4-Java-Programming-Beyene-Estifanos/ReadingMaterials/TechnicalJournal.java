
public class TechnicalJournal extends ReadingMaterial{
	private String topicOn;
	public TechnicalJournal() {
	}
	public TechnicalJournal(String topicOn) {
		this.topicOn = topicOn;
	}
	public TechnicalJournal(String title, String author, String genre, 
			String topicOn ,int pageNumber, int year) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPageNumber(pageNumber);
		setYear(year);
		this.topicOn = topicOn;
	}
	public String getTopicOn() {
		return topicOn;
	}
}
