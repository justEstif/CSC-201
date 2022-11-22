
package Mod8;

public class FractionClass implements java.io.Serializable {
    
    private int numerator;
    private int denominator;
    private static char slash = '/';
    public FractionClass(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
}

    public int getNumerator() {//getter and setter for numerator
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {//getter and setter for denominator
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static char getSlash() {
        return slash;
    }
    public String toString(){//to string
        return "fraction1 is " + (numerator + " " + slash + " " + denominator);
    }
}