public class ComputerScienceCurriculum
{
   public static void main(String[]args)
   {
      Curriculum [] cs=new Curriculum[10];//instantiate array of objects of type Curriculum
      cs[0]=new MathScience("MTH",263,"Calculus I","MSE Division",4);
      System.out.println(cs[0].toString());
      System.out.println();
      cs[1]=new FineArts("CST",151,"Film Appreciation","LA Division",3);
      System.out.println(cs[1].toString());
      System.out.println();
      cs[2]=new socialScience("PSY",200,"Principles of Psychology","LA Division",3);
      System.out.println(cs[2].toString());
      System.out.println();
      cs[3]=new Languages("ENG",112,"College Composition II","LA Division",3);
      System.out.println(cs[3].toString());
      System.out.println();
      cs[4]=new PhysicalLifeScience("PHY",231,"University Physics","MSE Division",4,1);
      System.out.println(cs[4].toString());
      System.out.println();
   }
}