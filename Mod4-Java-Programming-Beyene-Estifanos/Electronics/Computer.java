public class Computer extends Electronics
{
   private String operatingSystem;
   private int usbPorts;//number of usb ports
   private String compType;//desktop or laptop
   private String screenType;//traditional or touchscreen
   private String screenInch;
   
   public Computer()//default constructor
   {
      super();
      operatingSystem="";
      usbPorts=0;
      compType="";
      screenType="";
      screenInch="";
   }
   public Computer(String typ,double wei,double cos,double pow,double mem,String man,String os,int usb,String comp,String screenT,String screenI)
   {
      super(typ,wei,cos,pow,mem,man);
      operatingSystem=os;
      usbPorts=usb;
      compType=comp;
      screenType=screenT;
      screenInch=screenI;
   }
   //method override
   public void setElectronics(String typ,double wei,double cos,double pow,double mem,String man,String os,int usb,String comp,String screenT,String screenI)
   {
      super.setElectronics(typ,wei,cos,pow,mem,man);
      operatingSystem=os;
      usbPorts=usb;
      compType=comp;
      screenType=screenT;
      screenInch=screenI;
   }
   public String toString()//to print out attributes
   {
      return(super.toString()+"\nOperating System: "+operatingSystem+"\nUSB ports: "+usbPorts+"\nComputer Type: "+compType+"\nScreen Type: "+screenType+"\nScreen Inches: "+screenInch+" inches");
   }
}