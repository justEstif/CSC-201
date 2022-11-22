import java.util.Scanner;
public class CalculatingaNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student ID Number: ");
		int studentId = input.nextInt();
		int chapterNumber = (studentId % 3) +3;
		int x = 0;
		if (chapterNumber == 3) 
			x = x + 34;
		else if (chapterNumber == 4) 
			x = x + 38;
			chapterNumber = 6;
		if (chapterNumber == 5)
			x = x + 46; 
		int numberofProgQ = (studentId % x) + 1;
		System.out.println("You have " + numberofProgQ + " questions from chapter " + chapterNumber);
		System.out.print("Enter the page number where the problem is located in the textbook: ");
		int pageNumber = input.nextInt();
		System.out.println("Please solve programming exercise " + numberofProgQ + " from chapter " + chapterNumber + ", from page " + pageNumber + ".");
		
	}

}
