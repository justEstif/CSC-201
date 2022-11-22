package Mod8;

import java.io.*;

public class TestFractionClass {

    public static void main(String[] args) throws IOException {
        FractionClass fraction1 = new FractionClass(1, 2);//create objects
        FractionClass fraction2 = new FractionClass(3, 4);
        FractionClass fraction3 = new FractionClass(4, 5);
        //create array of objects
        String[] fractions = {fraction1.toString(), fraction2.toString(), fraction3.toString()};
        try (//add string to dat
                 DataOutputStream output
                = new DataOutputStream(new FileOutputStream("SerialF.dat")) ;
                )
            {
                for (int i = 1; i < fractions.length; i++) {
                 output.writeUTF(fractions[i]);
                }
            }
            catch(IOException ex){
                    ex.printStackTrace();
                    }
        }
    
}
