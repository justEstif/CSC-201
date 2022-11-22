public class SubstitutionCipher implements MessageEncoder,MessageDecoder
{
   private int shift;
   
   public SubstitutionCipher(int shift)//constructor
   {
      this.shift = shift;
   }
   public String encode(String plainText)
   {
      String message = "";//to be used to build new string that has been shifted
      char replacement;
      for(int i = 0;i < plainText.length();i++)
      {
         replacement=(char)(plainText.codePointAt(i) + shift);//get unicode value of individual charachters and add shift value
         message = message + replacement;//build new the new charchters to build a string
      }
      return message;
   }
   public String decode(String cypherText)
   {
      String message = "";
      char replacement;
      for(int i = 0;i < cypherText.length(); i++)
      {
         replacement = (char)(cypherText.codePointAt(i) - shift);
         message = message + replacement;
      }
      return message;
   }

}