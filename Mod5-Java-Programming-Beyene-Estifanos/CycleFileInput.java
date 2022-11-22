import java.io.File;
import java.util.Scanner;
public class CycleFileInput {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("Cycle.txt");
		Scanner input = new Scanner (file);
		while(input.hasNext()) {
			double numberOfWheels1 = input.nextDouble();
			double weight1 = input.nextDouble();
			double numberOfWheels2 = input.nextDouble();
			double weight2 = input.nextDouble();
			System.out.println(numberOfWheels1 + "  " +weight1);
			System.out.print(numberOfWheels1 + "  " + weight2);
		}
		input.close();
	}

}
