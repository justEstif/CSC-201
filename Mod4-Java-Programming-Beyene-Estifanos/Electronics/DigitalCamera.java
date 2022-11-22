public class DigitalCamera extends Electronics
{
   private double resolution;
   
   public DigitalCamera()//default constructor
   {
      super();
      resolution=0;
   }
   public DigitalCamera(String typ,double wei,double cos,double pow,double mem,String man,double res)
   {
      super(typ,wei,cos,pow,mem,man);
      resolution=res;
   }
   public void setElectronics(String typ,double wei,double cos,double pow,double mem,String man,double res)//method override
   {
      super.setElectronics(typ,wei,cos,pow,mem,man);
      resolution=res;
   }
   public String toString()
   {
      return(super.toString()+"\nResolution: "+resolution+" MP");
   }
}