import java.util.InputMismatchException;
import java.util.Scanner;
public class TestCycle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
	do {
		try {
			System.out.println("Enter the number of wheels and weight");
			double numberOfWheels = input.nextDouble();
			double weight = input.nextDouble();
			Cycle object1 = new Cycle(numberOfWheels, weight);
			Cycle object2 = new Cycle(); 
			System.out.println(object1);
			System.out.println(object2);
			continueInput = false;
	}catch(InputMismatchException ex) {
			System.out.println("Values cannot be less than or equal to zero");
			input.nextLine();
	}
	}while(continueInput);
}
}
	

