/*The user input the highest and lowest  temperature of months based on the order
 * of the String months. This goes in a loop is completed and forms an array. 
 * The program runs the array created and calculates the average high and low and find its indexes.
 * The resulting answer is output. */
import java.util.Scanner;
public class Temperature {

    static Scanner input;

    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int[][] temps = inputTempForYear(); // This would be for january
        int avgHigh = calculateAverageHigh(temps);
        int avgLow = calculateAverageLow(temps);
        int high = findHighestTemp(temps);
        int low = findLowestTemp(temps);
        System.out.println("Average High: " + avgHigh);
        System.out.println("Average Low: " + avgLow);
        System.out.println("High: " + months[high]);
        System.out.println("Low: " + months[low]);
    }
  
  	public static int findHighestTemp(int[][] array) {
      int max = array[0][0];
      int indexOfMax = 0;
      for(int i = 0; i < array.length; i++) {
        if(array[i][0] > max){
          	max = array[i][0];
        	indexOfMax = i;
        }
      }
      return indexOfMax;     
    }
  	public static int findLowestTemp(int[][] array) {
      int min = array[0][1];
      int indexOfMin = 0;
      for(int i = 0; i < array.length; i++) {
        if(array[i][1] < min){
          	min = array[i][1];
        	indexOfMin = i;
        }
      }
      return indexOfMin; 
    }
  

    public static void inputTempForMonth(int month, int[][] array) {
        System.out.println("Enter the highest and lowest temperature for " + months[month] + ".");
        System.out.print("Highest: ");
        array[month][0] = input.nextInt();
        System.out.print("Lowest: ");
        array [month][1] = input.nextInt();
    }

    public static int[][] inputTempForYear () {
        int[][] array = new int[12][2];
        for(int i = 0; i < array.length; i++) {
            inputTempForMonth(i, array);
        }
        return array;
    }

    public static int calculateAverageHigh(int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i][0];
        }
        return sum / 12;
    }

    public static int calculateAverageLow(int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i][1];
        }
        return sum / 12;
    }
}