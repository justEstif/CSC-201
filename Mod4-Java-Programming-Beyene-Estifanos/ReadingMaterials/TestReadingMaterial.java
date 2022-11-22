
public class TestReadingMaterial {
	public static void main(String[] args) {
		TextBooks textbooks = new TextBooks("Introduction to Java programming", "Liang, Y. Daniel", 
				"nonfiction", "Computer Science", 824, 2018);
		System.out.print(textbooks.toString());
		System.out.println("\nThe book covers the subject " + textbooks.getSubject());
		Novel novel = new Novel("Harry Potter and the Half Blood Prince", "JK Rowling", 
					"fantasy", 6, 607, 2014);
		System.out.print(novel.toString());
		System.out.println("\nThe novel is the "+ novel.getVolume() + " of the series.");
		Magazine magazine = new Magazine("Men's Health March Issue", "Hearst magazine", 
				"nonfiction", "Chris Hemsworth", 50, 2019 );
		System.out.println(magazine.toString());
		System.out.println("The magazine cover is " + magazine.getCover());
		TechnicalJournal technicaljournal = new TechnicalJournal("Bell Labs Technical Journal", "AT&T Technical Journal", 
				"nonfiction", "Information and Communications Technology (ICT)", 50, 1992);
		System.out.println(technicaljournal.toString());
		System.out.println("The technical journal covers topics on " + technicaljournal.getTopicOn());
	}
}
