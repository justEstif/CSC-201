public class socialScience extends Curriculum
{
   public socialScience()
   {
      super();
   }
   public socialScience(String ttl,int num,String des,String dep,int cred)
   {
      super(ttl,num,des,dep,cred);
   }
   public void setCurriculum(String ttl,int num,String des,String dep,int cred)//method override
   {
      super.setCurriculum(ttl,num,des,dep,cred);
   }

   public String toString()//print out attributes
   {
    return(super.toString());
   }
}