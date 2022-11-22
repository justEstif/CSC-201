public class UVA {//class for the University of Virginia
	private final String [] semester1 = {"SDV 100", "ENG 111", "CST 100",
				"MTH 263", "Social Science Elective",
				"Humanities/Fine Arts Elective", "EGR 121 and ENGR 164"};
	private final String[] semester2 = {"ENG 112", "MTH 264", "PHY 231", 
				"CHM 111"};
	private final String[] semester3 = {"MTH 265", "PHY 232", "CSC 201", 
				"MTH 288","Social Science Elective"}; 
	private final
                String[] semester4 = {"MTH 267 and APMA 2131", "CSC 202", "MTH 266",
			"MTH 288", "Humanities/Fine Arts Elective", "CSC 205"};
	private int current;
	
	public UVA(int currentIn) {//constructor
		setCurrent(currentIn);
	}
	public void setCurrent(int currentIn)//method for handling exception
		throws IllegalArgumentException{
			if (currentIn == 1 || currentIn == 2
					||currentIn == 3 ||currentIn == 4){
				current = currentIn;
			}
			else {
				throw new IllegalArgumentException
					("The input must be 1, 2, 3, or 4");
			}
	}
	public void print (){//print based on semester
		System.out.println("The follwing program is ideal for your transfer goals: ");
		if (current == 1) {
			System.out.println("\nSemester 1");
			for( int i = 0; i < semester1.length; i++) {
				System.out.print(semester1[i] + "  ");
			}
			System.out.println("\nSemester 2");	
			for( int j = 0; j < semester2.length; j++) {
				System.out.print(semester2[j] + "  ");
			}
			System.out.println("\nSemester 3");		
			for(int k = 0;k < semester3.length; k++) {
				System.out.print(semester3[k] + "  ");
			}
			System.out.println("\nSemester 4");			
			for( int l = 0; l < semester4.length; l++) {
				System.out.print(semester4[l] + "  ");
			}
		}
		else if( current == 2) {
			System.out.println("\nSemester 2");	
			for( int j = 0; j < semester2.length; j++) {
				System.out.print(semester2[j] + "  ");
			}
			System.out.println("\nSemester 3");		
			for(int k = 0;k < semester3.length; k++) {
				System.out.print(semester3[k] + "  ");
			}
			System.out.println("\nSemester 4");			
			for( int l = 0; l < semester4.length; l++) {
				System.out.print(semester4[l] + "  ");
			}
		}
		else if(current == 3) {
			System.out.println("\nSemester 3");		
			for(int k = 0;k < semester3.length; k++) {
				System.out.print(semester3[k] + "  ");
			}
			System.out.println("\nSemester 4");			
			for( int l = 0; l < semester4.length; l++) {
				System.out.print(semester4[l] + "  ");
			}
		}
		else if(current == 4) {
			System.out.println("\nSemester 4");			
			for( int l = 0; l < semester4.length; l++) {
				System.out.print(semester4[l] + "  ");
			}
		}

	}
}
