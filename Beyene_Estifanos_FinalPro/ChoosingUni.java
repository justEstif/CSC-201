//class for choosing
public class ChoosingUni {
    private String target;
    private int semester;
    //create constructor from semster and target university
    public ChoosingUni(String targetIn, int semester){
        this.semester = semester;
        setTarget(targetIn);
      }
    public void setTarget(String targetIn)//target input has to be VT or UVA
        throws IllegalArgumentException{
                if("UVA".equals(targetIn) || "VT".equals(targetIn)){
                    target = targetIn;
                 }
                else{
                    throw new IllegalArgumentException
                            ("The only programs available are for UVA and VT");
        }
        if("VT".equals(target)){//if VT print VT object
            try {
		//create object of VT class using semester
                VT vt = new VT(semester);
		vt.print();
            }catch(IllegalArgumentException ex) {//catch error
		System.out.println(ex);
            }
        }      
        else if("UVA".equals(target)){
            try {
                //create object of UVA class using semester
		UVA uva = new UVA(semester);
		uva.print();
            }catch(IllegalArgumentException ex) {//catch error
		System.out.println(ex);
            }

        }
    }
    
   
    
}
