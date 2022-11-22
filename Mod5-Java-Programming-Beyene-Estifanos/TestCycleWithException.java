
import java.util.Scanner;
public class TestCycleWithException {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of wheels and weight");
	double numberOfWheels = input.nextDouble();
	double weight = input.nextDouble();
	try {
		CycleWithException object1 = new CycleWithException(numberOfWheels, weight);
		CycleWithException object2 = new CycleWithException(); 
		System.out.println(object1);
		System.out.println(object2);
	}catch(IllegalArgumentException ex) {
			System.out.println(ex);

	}
	}
}
