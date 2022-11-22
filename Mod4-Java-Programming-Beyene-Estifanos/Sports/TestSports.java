
public class TestSports {
	public static void main(String[] args) {
		Soccer soccer = new Soccer(11, 2, "World Cup", true);
		System.out.println("Soccer is a sport played between " + soccer.toString());
		System.out.println("The height of the goal is " 
				+ soccer.getHeightOfGoal() + " meters.");
		System.out.println("The width of the goal is " 
				+ soccer.getWidthOfGoal() + " meters.");
		System.out.printf("The area of the goal is %.2f", soccer.getArea());
		Basketball basketball = new Basketball(5, 2, "NBA playoffs", true);
		System.out.println("\nBasketball is a sport played between " 
				+ basketball.toString());
		System.out.println("The radius of the hoop is " 
				+ basketball.getRadiusOfHoop()	+ " inches.");
		System.out.println("The height of the hoop is " 
				+ basketball.getHeightOfBoardl() + " inches.");
		System.out.printf("The area of the hoop is %.2f", basketball.getArea());
	}
}
