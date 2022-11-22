
package Mod8;
import java.io.*;

public class ReadMe {
    public static void main(String[] args) throws IOException{
        char ap1 = '"';
        char ap2 = '"';
        try(//create rabdin access fuke
                RandomAccessFile inout = new RandomAccessFile("pledge.txt", "rw");
                ){
            System.out.println("length = " + inout.length());
            inout.seek(123);//seek 123
            System.out.println("the 124th is " + ap1 + inout.readLine() + ap2);
            inout.seek(134);//seek 134
            System.out.println("the 134th is " + ap1 + inout.readLine() + ap2);
        }catch(Exception ex){//catch exception
           System.out.println("Error in opening file");
           ex.printStackTrace();
        }finally{//final statment
            System.out.println("This is the final statment");
    }
    
    }   
}
