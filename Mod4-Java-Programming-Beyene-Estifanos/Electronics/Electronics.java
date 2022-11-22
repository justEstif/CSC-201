public class Electronics
{
   private String type;//type of electronic
   private double weight;
   private double cost;
   private double powerUsage;
   private double memory;
   private String manufacturer;
   
   public Electronics()//default constructor
   {
      type="";
      weight=0;
      cost=0;
      powerUsage=0;
      memory=0;
      manufacturer="";
   }
   public Electronics(String typ,double wei,double cos,double pow,double mem,String man)
   {
      type=typ;
      weight=wei;
      cost=cos;
      powerUsage=pow;
      memory=mem;
      manufacturer=man;
   }
   public void setElectronics(String typ,double wei,double cos,double pow,double mem,String man)//to be used with default constructor
   {
      type=typ;
      weight=wei;
      cost=cos;
      powerUsage=pow;
      memory=mem;
      manufacturer=man;
   }
   public String toString()//to print out attributes
   {
      return("Type: "+type+"\nWeight: "+weight+" kg\nCost: $"+cost+"\nPower Usage: "+powerUsage+" watts\nMemory: "+memory+" GB\nManufacturer: "+manufacturer);
   }
}