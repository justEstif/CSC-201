/*add the book's info here
 * it is display according to the Volume and Books class*/
public class DemoVolume {
	public static void main(String[] args) {
		Book []list = new Book[3];
      	list[0] = new Book("The Sorceror's Stone", "JK Rowling", 309);
 		list[1] = new Book("Deathly Hollows", "JK Rowling", 257);
      	list[2] = new Book("The Helf Blood Prince", "JK Rowling", 267);

		Volume stuff = new Volume(" Harry Potter ", 3, list);
      
      	
		System.out.println(stuff.toString());
		System.out.println (stuff.getBookArray());
	}
}     
