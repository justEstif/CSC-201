//test class
import java.util.Scanner;//scanner class
public class TestUniv {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    Boolean tryAgain = true;//attribute to allow user to try again
    
    while(tryAgain)
    {
        System.out.println("What semester are you planning for? ");
        int semester = input.nextInt();//input semester
        System.out.println("What is your target univerity?");
        String target = input.next();//input acronym of target university
        
        try
        {
            //create object of ChoosingUni class
            ChoosingUni goals = new ChoosingUni(target, semester);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        //allow user to try again if there is an error or othrewise
        System.out.println("\nWould you like to run again?");
        tryAgain = input.next().equalsIgnoreCase("yes");
        input.nextLine();
    }
      
      System.out.println("Thank you for using the program.");//terminate 
        }
}