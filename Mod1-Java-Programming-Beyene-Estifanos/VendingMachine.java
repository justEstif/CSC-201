import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MAX_Choices = 5.0;
		System.out.print("Enter the amount of $5 bills: ");
		double amount5d = input.nextInt();	
		double fiveDollar = 5.0 * amount5d;	//turn the $5 bills into $5
		System.out.print("Enter the amount of $1 bills: ");
		int oneDollar = input.nextInt();//same
		System.out.print("Enter the amount of quarters: ");
		int amount25c = input.nextInt();
		double quartercents = amount25c * 0.25;
		System.out.print("Enter the amount of dimes: ");
		double amount10c = input.nextDouble();
		double dimecents = amount10c * 0.1;
		System.out.print("Enter the amount of nickels: ");
		double amount5c = input.nextDouble();
		double nickelcents = amount5c * 0.05;
		System.out.print("Enter the amount of pennies: ");
		double amount1c = input.nextDouble();
		double pennycents = amount1c * 0.01;
		double totalAmount = (fiveDollar + oneDollar + quartercents + dimecents + nickelcents + pennycents);			
		System.out.println("You have $" + totalAmount + "." );
		int numberOfPurchase1 = 0;
		int numberOfPurchase2 = 0;
		int numberOfPurchase3 = 0;
		int numberOfPurchase4 = 0;
		int numberOfPurchase5 = 0;
		int numberOfChoices = 0;
		int totalCost = 0;
		System.out.print("What item do you wish to buy?");
		System.out.println("\n1 = item1 = $6\n2 = item2 = $2\n3 = item3 = $5\n4 = item4 = $4\n5 = item5 = $3\n6 = finished shopping\n0 = stop");
		while(numberOfChoices <= MAX_Choices) {
			int choice = input.nextInt();
			switch (choice) {
				case 1 : 
					numberOfPurchase1 ++;
					System.out.print("You have purchased item" + 1 + ". What other item do you wish to purchase?(Press 0 to stop)");break;
				case 2 :
					numberOfPurchase2 ++;
					System.out.print("You have purchased item" + 2 + ". What other item do you wish to purchase?(Press 0 to stop)");break;
				case 3 : 
					numberOfPurchase3 ++;
					System.out.print("You have purchased item" + 3 + ". What other item do you wish to purchase?(Press 0 to stop)");break;
				case 4 : 
					numberOfPurchase4 ++;
					System.out.print("\nYou have purchased item" + 4 + ". What other item do you wish to purchase?(Press 0 to stop)");break;
				case 5 : 
					numberOfPurchase5 ++;
					System.out.print("You have purchased item" + 5 + ". What other item do you wish to purchase?(Press 0 to stop)");break;
				case 0 : System.out.println("Thank you for you purchase. You inital input of $" + totalAmount + " will be returned to you.");		
			}
			
			numberOfChoices = (numberOfPurchase1 + numberOfPurchase2 + numberOfPurchase3 + numberOfPurchase4 + numberOfPurchase5);
					System.out.println("Current number of items in cart is " + numberOfChoices);
			totalCost = ((6 * numberOfPurchase1) + (2 * numberOfPurchase2) + (5 * numberOfPurchase3) + (4 * numberOfPurchase4) + (3 * numberOfPurchase5) );	
					System.out.println("Your total cost is $" + totalCost);// the 6,2,5,4, and 3 are the sample prices for the items
			if (choice == 0) {		
					System.out.println("\nYour refund is $" + (totalAmount));
			}
			if (choice == 6 ) {
					System.out.print("Thank you for your purchase of $" + totalCost);
					System.out.print("\nYour change is " + (totalAmount - totalCost));
					
			}
		}
	}
}