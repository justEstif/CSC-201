public class electronicsInventory
{
   public static void main(String[]args)
   {
      Electronics [] e1=new Electronics[10];//instantiate array of objects of type Electronics
      e1[0]=new Computer("Computer",2.4,379.50,90,1000,"Acer","Windows 10",3,"Laptop","Touch-screen","16.5");
      System.out.println(e1[0].toString());
      System.out.println();
      e1[1]=new Phone("Phone",0.14,1399.00,5,128,"Samsung",2,"Samsung Galaxy","Android");
      System.out.println(e1[1].toString());
      System.out.println();
      e1[2]=new DigitalCamera("Camera",3.6,1159.50,6,64,"Cannon",16.0);
      System.out.println(e1[2].toString());
      System.out.println();
   }
}