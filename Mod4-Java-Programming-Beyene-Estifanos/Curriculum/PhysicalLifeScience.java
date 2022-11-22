public class PhysicalLifeScience extends Curriculum
{
   private int LabCredit;
   private int totalCredit;//credit+labcredit
   public PhysicalLifeScience()//default constructor
   {
      super();
      LabCredit=0;
      totalCredit=0;
   }
   public PhysicalLifeScience(String ttl,int num,String des,String dep,int cred,int lcred)
   {
      super(ttl,num,des,dep,cred);
      LabCredit=lcred;
      totalCredit=cred+lcred;
   }
   public void setCurriculum(String ttl,int num,String des,String dep,int cred,int lcred)//method override
   {
      super.setCurriculum(ttl,num,des,dep,cred);
      LabCredit=lcred;
      totalCredit=cred+lcred;
   }
   public String toString()//print out attributes
   {
    return(super.toString()+"\nLab Credit: "+LabCredit+"\nTotal credit: "+totalCredit);
   }
}
