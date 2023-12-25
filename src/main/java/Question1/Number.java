package Question1;


import java.util.Random;

public class Number {
    
    private int[] numArray;
    private int MAX;
    
    Random rand = new Random();
    
    // constructor
    Number() {
        
        this.numArray = new int[10];
        this.MAX = 101;
        
        for(int i = 0; i<numArray.length; i++) {
            this.numArray[i] = rand.nextInt(MAX);
        }
    }
    
    Number(int length) {
        
        this.numArray = new int[length];
        this.MAX = 101;
        
        for(int i = 0; i<numArray.length; i++) {
            this.numArray[i] = rand.nextInt(MAX);
        }
    }
    
    Number(int length, int MAX) {
        
        this.numArray = new int[length];
        this.MAX = MAX + 1;
        
        for(int i = 0; i<numArray.length; i++) {
            this.numArray[i] = rand.nextInt(this.MAX);
        }
    }
    
    // method for displaying the items of array
    public void displayArrayItems() {
        
        System.out.print("Array Items : ");
        
        for(int i : this.numArray) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
    
    // method for displaying even number in array
    public void displayEven() {
        System.out.print("Even numbers : ");
        for(int i = 0; i < this.numArray.length; i++) {
            if(this.numArray[i] % 2 == 0) {
                System.out.print(this.numArray[i] + " ");
            }
        }
        System.out.println();
    }
    
    // method for displaying prime number in array
    public void displayPrime() {
        System.out.print("Prime Numbers : ");
        for(int i = 0; i < this.numArray.length; i++) {
            if(isPrime(this.numArray[i])) {
                System.out.print(this.numArray[i] + " "); 
            }
        }
        System.out.println();
    }
    
    public boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    } 
    
    // method for displaying the maximum number
    public void displayMax() {
        int max = 0;
        for(int i = 0; i < this.numArray.length; i++) {
            if(this.numArray[i] > max) {
                max = this.numArray[i];
            }
        }
        System.out.println("The maximum number is : " + max);
    }
    
    // method for displaying the minimum number
    public void displayMin() {
        int min = numArray[0];
        for(int i = 1; i < this.numArray.length; i++) {
            if(this.numArray[i] < min) {
                min = this.numArray[i];
            }
        }
        System.out.println("The minimum number is : " + min);
    }
    
    // method for displaying the average
    public void displayAverage() {
        int average = 0;
        
        for(int i = 0; i < this.numArray.length; i++) {
            average += this.numArray[i];
        }
        
        average = average / this.numArray.length;
        System.out.println("The average is : " + average);
    }
    
    // method for display square number 
    public void displaySquare() {
        System.out.print("Square number : ");
        for(int i = 0; i < this.numArray.length; i++) {
            if(isSquareNumber(this.numArray[i])) {
                System.out.print(this.numArray[i] + " ");
            }
        }
        System.out.println();
    }
    
    public boolean isSquareNumber(int num) {
        double squareRoot = Math.sqrt(num);
        
        return squareRoot == Math.floor(squareRoot);
    }
}
