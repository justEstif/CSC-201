
import java.io.File;
import java.util.Scanner;
public class CycleFileOutput {
	public static void main(String[] args) throws java.io.IOException{
	java.io.File Cycle = new java.io.File("Cycle.txt");
	if (Cycle.exists()) {
		System.out.println("File already exists");
		System.exit(1);
	}
	java.io.PrintWriter output = new java.io.PrintWriter(Cycle);
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of wheels and weight");
	double numberOfWheels = input.nextDouble();
	double weight = input.nextDouble();
	try {
		CycleWithException object1 = new CycleWithException(numberOfWheels, weight);
		CycleWithException object2 = new CycleWithException(); 
		output.println(object1.toString());
		output.print(object2.toString());
	}catch(IllegalArgumentException ex) {
			System.out.println(ex);
	}
	output.close();
	}
}
