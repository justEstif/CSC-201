/*The user inputs the scores given by the 1 judge and this is ran through a so 
 * that the scores all 8 judges can become accepted. This is used to create an array
 *  the degree of difficulty is inputed once the loop has been terminated
 * the program then calculates the score of the diver based on the given formula
 it displays the result as an output*/
import java.util.*;
public class Diving{
  public static void main(String[] args){
    float[] scores = inputAllScores();
    float difficulty = inputValidDegreeOfDifficulty();
    float score = calculateScore(scores, difficulty);
    System.out.println("The diver's score is " + score);
  }
  public static float inputValidScore(){
    Scanner input = new Scanner(System.in);
    System.out.print("Input valid score for one judge for one diver: ");
    float validScore = input.nextFloat();
    return validScore;
    
  }
  public static float[] inputAllScores(){
    float[] scores = new float[7];
    for (int i = 0; i < 7; i++){
      scores[i] = inputValidScore();//the value of the arrays are called 7 times from inputvalidScore method
    }
    return scores;
  }
	public static float inputValidDegreeOfDifficulty (){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the degree of difficulty: ");
      float validDegreeOfDifficulty = input.nextFloat();
      return validDegreeOfDifficulty;
    }
	public static float calculateScore(float[] scores, float difficulty){//the parameters are the other methods
      float sum = 0;
      float min = 0;
      float max = 0;
      for (int i = 0; i < 7; i++){
        sum += scores[i];
        if (scores[i] >= max)
        {
        	max = scores[i];//find the max 
        }
        if (scores[i] <= min)
        {
            min = scores[i];//find the min
        }
      }
      sum -= (max + min);//find the total and subtract the max and min
      return(float) (sum * difficulty * 0.6);
    }

  
}