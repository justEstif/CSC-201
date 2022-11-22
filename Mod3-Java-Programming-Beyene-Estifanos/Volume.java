/*class to input volume name, number of book and books
 * it returns String */
public class Volume {
	private String volumeName;
	private int numberOfBooks;
	public Book[] books;
	public Volume(String volumeName, int numberOfBooks, Book[] books) {
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.books= books;
	}
  public String getBookArray(){
    String volumeBooks = "";
    for(int i = 0; i < books.length;i++){
      volumeBooks += books[i].toString();
    }
    return volumeBooks;
  
  }
  public String toString() {
		return "Volume name is "
				+ this.volumeName + "and the number of books is  " 
				+ numberOfBooks;
	}

}
