public class ShuffleCipher implements MessageEncoder, MessageDecoder
{
   private int times;//number of times to shuffle
   private String originalMessage;
   
   public ShuffleCipher(int n)
   {
      times = n;
      originalMessage = "";
   }
   public String encode(String plainText)
   {
        originalMessage = plainText;
        int count = 0;//keep track of the number of times message has been shuffled
        String message = plainText;
        String first = "";//first half of the message to be shuffled
        String last = "";//last half of message to be shuffled
        while(count < times)
        {
            String shuffle = "";
            if(message.length() % 2 == 0)//to test whether one half of the message will have more charachters than the other
            	{
            	first=message.substring(0,(message.length()/2));
            	last=message.substring((message.length()/2));
            	}
            else
            {
            	first=message.substring(0,(message.length()/2)+1);
            	last=message.substring((message.length()/2)+1);
            	}
            for(int i=0;i<message.length()/2;i++)//interchange charachters in the first and last half of the message 
            {
               shuffle=shuffle+first.substring(i,i+1)+last.substring(i,i+1);
            }
            if(message.length()%2!=0)//add the last charachter of the first half to the string shuffle if it has an odd number of charachters
               shuffle=shuffle+first.substring(first.length()-1);
            
            message=shuffle;//to ensure that it is the new shuffled message that is continued to be shuffled
            count++;//ensure that the loop eventually terminates
         }      
         return message;
   }
  public String decode(String cypherText)//reverse of encode method
   {
        int count = 0;
        String message=cypherText;
        String first="";
        String last="";
        while(!message.equalsIgnoreCase(originalMessage))//only stops if the decoded message is equal to original message
        {
            String shuffle="";
            if(message.length()%2==0)
            {
            	first=message.substring(0,(message.length()/2));
            	last=message.substring((message.length()/2));
            	}
            else
            {
            	first=message.substring(0,(message.length()/2)+1);
            	last=message.substring((message.length()/2)+1);
            	}
            for(int i=0;i<message.length()/2;i++)
            {
               shuffle=shuffle+first.substring(i,i+1)+last.substring(i,i+1);
            }
            if(message.length()%2!=0)
               shuffle=shuffle+first.substring(first.length()-1);
            
            message=shuffle;
            count++;
         }      
         return message;
   }

}