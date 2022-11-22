/*changes the case of the predefined input
 * */
public class CharacterArray
{
 public static void main(String[]args)
 {
  String word="6901 Sudley Road Manassas VA";
  char [] array=word.toCharArray();
  for(int i=0;i<array.length;i++)
  {
   System.out.print(array[i]);
  }
  System.out.println();
  for(int i=0;i<array.length;i++)
  {
   if(array[i]>='a'&&array[i]<='z')//test if it is lowercase letter
      {array[i]=Character.toUpperCase(array[i]);
      System.out.print(array[i]);}
   else if(array[i]>='A'&&array[i]<='Z')//test if it is an uppercase letter
      {array[i]=Character.toLowerCase(array[i]);
      System.out.print(array[i]);}
   else if(array[i]>='0'&&array[i]<='9') //test if it is a number
      {array[i]='*'; 
      System.out.print(array[i]);}
   else
     System.out.print(array[i]);  
  }
 }
}