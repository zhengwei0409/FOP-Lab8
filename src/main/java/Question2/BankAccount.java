
package Question2;

public class BankAccount {
    private String name;
    private String ID;
    private Double balance = 0.0;
    
    BankAccount(String name, String ID, Double deposite_amount) {
        this.name = name;
        this.ID = ID;
        this.balance += deposite_amount;
    }
    
    public void deposite(double deposite_amount) {
        this.balance += deposite_amount;
    }
    
    public void withdraw(double withdraw_amount) {
        
        if(this.balance > withdraw_amount) {
            this.balance -= withdraw_amount;
        } else {
            System.out.println("Insufficient balance!");
        }
        
    }
    
    public void displayBalance() {
        System.out.printf("Your account balance : %.2f",this.balance);
    }
}
