public class CipherTest
{
   public static void main(String[]args)
   {
      String message="afbgchdie";
      SubstitutionCipher test1=new SubstitutionCipher(3);
      String encoded=test1.encode(message);
      String decoded=test1.decode(encoded);
      System.out.println("The encoded message: "+encoded);
      System.out.println("The decoded message: "+decoded);
      
      String message2="School";
      ShuffleCipher test2=new ShuffleCipher(3);
      String encoded2=test2.encode(message2);
      String decoded2=test2.decode(encoded2);
      System.out.println("The encoded message: "+encoded2);
      System.out.println("The decoded message: "+decoded2);

   }
}