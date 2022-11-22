/*the amount of the input is displayed as output*/
import java.util.Scanner;
public class Builder
{
 public static void main(String[]args)
 {
  Scanner input=new Scanner(System.in);
  System.out.print("Input word: ");
  StringBuilder word=new StringBuilder(input.nextLine());
  word.append("I love it!");
  String extraWord="";
  System.out.print("Input Yes!: ");
  extraWord=input.next();
  System.out.println();
  word.replace(11,12,". ");
  word.insert(12,extraWord);
  word.replace(15,16,",");
  System.out.println(word);
  System.out.println("The capacity of the string is: "+word.capacity());
 }
}