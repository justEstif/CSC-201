public class FineArts extends Curriculum
{
   public FineArts()
   {
      super();
   }
   public FineArts(String ttl,int num,String des,String dep,int cred)
   {
      super(ttl,num,des,dep,cred);
   }
   public void setCurriculum(String ttl,int num,String des,String dep,int cred)//method override
   {
      super.setCurriculum(ttl,num,des,dep,cred);
   }
   public String toString()
   {
    return(super.toString());
   }
}