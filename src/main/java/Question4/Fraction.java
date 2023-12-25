
package Question4;

public class Fraction {
    
    private int numerator;
    private int denominator;
    
    Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }
    
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public int getNumerator() {
        return this.numerator;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    
    public int findGCD(int a, int b) {
        
        // make sure a > b
        if(b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        // The Euclidean Algorithm
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return a;
    }
    
    public void DisplayFraction() {
        System.out.println("The original fraction: " + this.numerator + "/" + this.denominator);
    }
    
    public void DisplayReducedFraction() {
        
        int GCD = findGCD(this.numerator, this.denominator);
        
        System.out.println("The fraction reduced to lowest terms : " + this.numerator/GCD + "/" + this.denominator/GCD);
    }
}
