public class Curriculum
{
   private String title;
   private int courseNumber;
   private String description;
   private String department;
   private int credits;
   
   public Curriculum()//default constructor
   {
      title="";
      courseNumber=0;
      description="";
      department="";
      credits=0;
   }
   public Curriculum(String ttl,int num,String des,String dep,int cred)
   {
      title=ttl;
      courseNumber=num;
      description=des;
      department=dep;
      credits=cred;
   }
   public void setCurriculum(String ttl,int num,String des,String dep,int cred)//to be used with default constructor
   {
      title=ttl;
      courseNumber=num;
      description=des;
      department=dep;
      credits=cred; 
   }
   public String toString()//print out attributes
   {
      return("Title: "+title+"\nNumber: "+courseNumber+"\nDescription: "+description+"\nDepartment: "+department+"\nCredits: "+credits);
   }
}