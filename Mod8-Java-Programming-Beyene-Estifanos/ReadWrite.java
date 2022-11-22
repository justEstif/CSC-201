package Mod8;

import java.io.*;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] args) throws IOException, IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        try (//create randomaccessfile
                RandomAccessFile inout = new RandomAccessFile("Stu.dat", "rw");)
        {//create multidimensional array of id and gpa
            double[][] student = new double[6][2];
            for (int row = 0; row < student.length; row++) {
                System.out.println("Enter student ID and GPA");
                for (int col = 0; col < student[row].length; col++) {
                    student[row][col] = input.nextDouble();
                }
            }//add to random access file
            for (int row = 0; row < student.length; row++) {
                for (int col = 0; col < student[0].length; col++) {
                    inout.writeDouble(student[row][col]);
                }
            }
            //show entire record
            System.out.println("Would you like to see the entire records?Y/N");
            String answer = input.next();
            if (answer.equals("Y")) {
                System.out.println("ID" + "\t" + "GPA");
                for (int row = 0; row < student.length; row++) {
                    for (int col = 0; col < student[0].length; col++) {
                        System.out.print(student[row][col] + "\t");
                    }
                    System.out.println();
                }
            }//check and display gpa from records
            Boolean tryAgain = true;
            Boolean found = true;
            double requiredGPA = 0;
            while (tryAgain) {
                System.out.println("Enter student ID to search: ");
                double search = input.nextDouble();
                do {
                    for (int row = 0; row < student.length; row++) {
                        for (int col = 0; col < student[0].length; col++) {
                            if (search == student[row][col]) {
                                requiredGPA = student[row][1];
                                found = false;
                                System.out.println("The gpa is " + requiredGPA);
                            } else {
                            }
                        }
                    }
                } while (found);
                System.out.println("Would you like to run again?\nY/N");
                tryAgain = input.next().equalsIgnoreCase("Y");
                input.nextLine();

            }

        } catch (IllegalArgumentException | IOException e) {//check errors
            e.getMessage();
        } finally {//final statment
            System.out.println("Thank you for using our service");
        }

    }
}
