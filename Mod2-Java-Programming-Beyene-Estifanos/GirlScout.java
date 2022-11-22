/*The user is prompted to input the total number of girls and that number 
 * the number is equal to the length of the array that is to be created
 * the user then enters said number of input and it creates an array. 
 * The array is displayed in a table form */
import java.util.Scanner;
public class GirlScout {	
	public static void main(String[] args) {
		int total;
        int[] counters = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of girls in the troop selling cookies: ");
		total = input.nextInt();
		for (int i = 0; i < total; i++)
		{
			System.out.print("Enter the boxes of cookies for girl #" + (i + 1) + ": ");
			int boxes = input.nextInt();
            
            if(boxes <= 10) {
				counters[0]++;
			}
			else if(boxes <= 20) {
				counters[1]++;
			}
			else if(boxes <= 30) {
				counters[2]++;
			}
			else if(boxes <= 40) {
				counters[3]++;
			}
			else {
				counters[4]++;
			}
		}
		System.out.print("TOTAL BOXES      NUMBER OF GIRL SCOUTS");
		System.out.print("\n0 to 10         " +  counters[0]);
		System.out.print("\n11 to 20         " + counters[1]);
		System.out.print("\n21 to 30         " + counters[2]);
		System.out.print("\n31 to 40         " + counters[3]);
		System.out.print("\n41 or more       " + counters[4]);		
	}	
}
