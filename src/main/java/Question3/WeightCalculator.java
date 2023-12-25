
package Question3;

public class WeightCalculator {
    private int age;
    private double height;
    private double recommendWeight;
    
    WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        this.recommendWeight = calculateRecommendWeight();
    }
    
    public double calculateRecommendWeight() {
        return (this.height - 100 + this.age / 10) * 0.9;
    } 
   
    @Override
    public String toString() {
        return "Age : " + this.age + "\n" + "Height : " + this.height + "\n" + "Recommend Weight : " + this.recommendWeight; 
    }   
}
