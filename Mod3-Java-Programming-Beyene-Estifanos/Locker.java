/*add book and remove books once the locker has opened
 * it checks if it is opened based on the Locker class*/
import java.util.Scanner;
public class Locker {
  public int numberOfBooks;
  public CombinationLock LockerAttempt;
  private boolean isOpened;
  public Locker(String lockerName, int lockerNumber, int initalBooks, CombinationLock lock) {
    numberOfBooks = initalBooks;
    this.LockerAttempt = lock;
  }
  public Locker(int firstComboNumber, int secondComboNumber, int thirdComboNumber) {
	    LockerAttempt = new CombinationLock(firstComboNumber, secondComboNumber, thirdComboNumber); 

	  }

  public void openLocker(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter combination: ");
    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();
    int thirdNumber = input.nextInt();
    isOpened = LockerAttempt.openLock(firstNumber, secondNumber, thirdNumber);
    if(isOpened == true)
      System.out.print("\nThe combination is right. The locker has opened");
    else
      System.out.print("\nThe combination is wrong. The locker has not opened");
  }

  public void putBookInLocker() {
    if (isOpened == true) 
      numberOfBooks ++;
    else
      System.out.println("\nNot possible to add or remove books");
  }
  
  public boolean removeBookFromLocker() {
    if (isOpened == true){
      if (numberOfBooks != 0){
        numberOfBooks --;
        return true;
      }
      else
        return false;
    }
    else {
      System.out.println("\nNot possible to remove books.");
      return false;
    }
  }
  

}
