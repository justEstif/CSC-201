import java.util.Scanner;
public class ComplexNumbers{
   public static void main(String[]args){
      char i='i';
      float a1,a2;
      float b1,b2;
      float z1,z2;
      float addition;
      float subtraction;
      float division;
      float multiplication;
      Scanner input = new Scanner(System.in);
      System.out.print("Please in put real part of first number a1: ");
      a1=input.nextFloat();
      System.out.print("Please in put imaginary part of first number b1: ");
      b1=input.nextFloat();
      System.out.print("Please in put real part of second number a2: ");
      a2=input.nextFloat();
      System.out.print("Please in put imaginary part of second number b2: ");
      b2=input.nextFloat();
      z1 = a1 + i*b1;
      z2 = a2 + i*b2;
      addition=(a1+a2)+i*(b1+b2);
      subtraction=(a1-a2)+i*(b1-b2);
      multiplication=(a1*a2-b1*b2)+i*(a1*b2+b1*a2);
	  division=(a1*a2+b1*b2)/(a2*a2+b2*b2)+i*(b1*a2-a1*b2)/(a2*a2+b2*b2);
      System.out.println("Addition:"+z1+"+"+z2+"= "+addition);
      System.out.println("Subtraction:"+z1+"-"+z2+"= "+subtraction);
      System.out.println("Multiplication:"+z1+"*"+z2+"= "+multiplication);
      System.out.println("Division:"+z1+"/"+z2+"= "+division);
   }
}