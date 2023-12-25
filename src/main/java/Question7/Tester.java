
package Question7;

public class Tester {
    public static void main(String[] args) {
        Money m1 = new Money(320.58);
        Money m2 = new Money(69.69);
        Money m3 = new Money(520.52);
        
        m1.subtract(m2);
        m1.add(m3);
        
        System.out.println("Total amount : " + m1.getAmount());
        m1.displayNotesAndCoints();
    }
}
