
package Question2;


public class Tester {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount("zhengwei", "0409",500.00);
        bk.deposite(500);
        bk.withdraw(500);
        bk.displayBalance();
    }
}
