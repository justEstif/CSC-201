public class MathScience extends Curriculum
{
   public MathScience()//default constructor
   {
      super();
   }
   public MathScience(String ttl,int num,String des,String dep,int cred)
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