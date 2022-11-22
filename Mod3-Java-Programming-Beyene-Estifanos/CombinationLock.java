/*check if the input matches the given
 * it return success or faliure*/
public class CombinationLock{
  private int firstComboNumber;
  private int secondComboNumber;
  private int thirdComboNumber;
  private int position = 0;
  
  public CombinationLock(int firstComboNumber, int secondComboNumber, int thirdComboNumber) {
    this.firstComboNumber = firstComboNumber;
    this.secondComboNumber = secondComboNumber;
    this.thirdComboNumber = thirdComboNumber;    
  }
  
  public int getPosition(){
    return position;
  }
  
  public void resetDial(){
    this.position = 0;
  }
  
  public void turnRight(int numberOfTicks){//takes the right ticks as =
    position = (position + numberOfTicks) % 40;
  }
  
  public void turnLeft(int numberOfLeftTicks){
    position = (position - numberOfLeftTicks) % 40;
    if(position < 0)
      position += 40;    
  }
  
  
  public boolean openLock(int firstNumber, int secondNumber, int thirdNumber){
    resetDial();
    turnRight(firstNumber);
    turnLeft(secondNumber);
    turnRight(thirdNumber);
    return firstNumber == firstComboNumber && secondNumber == secondComboNumber && thirdNumber == thirdComboNumber;
  }
}