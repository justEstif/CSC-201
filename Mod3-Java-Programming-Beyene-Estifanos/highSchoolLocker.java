/*create a combination lock and test key
 * add and remove books*/
import java.util.Scanner;
public class highSchoolLocker {
	public static void main(String[] args) {
      
      	//create CombinationLock object here
      	CombinationLock mickeyMouseKey = new CombinationLock(28, 17, 39);
		CombinationLock donaldDuckKey = new CombinationLock( 35, 16, 27);
		Locker mickeyMouse = new Locker("Mickey Mouse", 100, 3, mickeyMouseKey);
		Locker donaldDuck = new Locker("Donald Duck", 275, 0, donaldDuckKey);
		
      // here call openLocker method, and when it ask for input pass 15,18,18
		mickeyMouse.openLocker();
      	
      //Add three books to Mickey Mouse’s locker.
      	mickeyMouse.putBookInLocker();
      	mickeyMouse.putBookInLocker();
      	mickeyMouse.putBookInLocker();
      	//remove book from locker
      	donaldDuck.openLocker();
      	donaldDuck.removeBookFromLocker();
      
      	//After all of these actions have been completed, print out the current state of both lockers to the console.
		System.out.println("\nMickey Mouse locker has " + mickeyMouse.numberOfBooks + " books.");
      	System.out.println("\nDonal Duck locker has " + donaldDuck.numberOfBooks + " books.");
	
	
	}

}