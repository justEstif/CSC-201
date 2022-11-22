public class Phone extends Electronics
{
   private int cameras;//number of cameras on phone
   private String name;//name of the phone
   private String operatingSystem;
   
   public Phone()//default constructor
   {
      super();
      cameras=0;
      name="";
      operatingSystem="";
   }
   public Phone(String typ,double wei,double cos,double pow,double mem,String man,int cam,String n,String os)
   {
      super(typ,wei,cos,pow,mem,man);
      cameras=cam;
      name=n;
      operatingSystem=os;
   }
   //method override
   public void setElectronics(String typ,double wei,double cos,double pow,double mem,String man,int cam,String n,String os)
   {
      super.setElectronics(typ,wei,cos,pow,mem,man);
      cameras=cam;
      name=n;
      operatingSystem=os;
   }
   public String toString()//to print out attributes
   {
      return(super.toString()+"\nName: "+name+"\nCameras: "+cameras+"\nOperating System: "+operatingSystem);
   }
}