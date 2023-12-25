
package Question7;

public class Money {
    
    private double amount;
    
    // counstructor
    Money(double amount) {
        this.amount = amount;
    }
    
    // method for round the amount
    public double round(double amount) {
        
        // handle the case if the amount dont have the last cents eg. 3.5 / 12.8
        if(amount * 10 % 1 == 0) {
            return amount;
        }
        
        // let say 20.87 * 10 = 208.7 = 208
        double temp = Math.floor(amount * 10);

        // Convert the number to a string
        String tempStr = Double.toString(amount);
        // Get the last character (last digit)
        char lastChar = tempStr.charAt(tempStr.length() - 1);
        // Convert the character back to an integer
        int lastDigit = Character.getNumericValue(lastChar);
       
        // round the amount according to the question
        if(lastDigit == 1 || lastDigit == 2) {
            // 208/10 = 20.80
            return temp / 10;
        } else if (lastDigit == 3 || lastDigit == 4 || lastDigit == 6 || lastDigit == 7) {
            // 208.5 / 10 = 20.85
            return (temp + 0.5) / 10;
        } else {
            // 209 / 10 = 20.90
            return (temp + 1) / 10;
        }
    }
    
    // method for display number of notes & coints needed
    public void displayNotesAndCoints() {
        
        double roundedAmount = round(this.amount);
        
        System.out.println("Notes: ");
        System.out.printf("%.0f of notes RM100\n", Math.floor(roundedAmount / 100 ));
        roundedAmount %= 100;
        System.out.printf("%.0f of notes RM50\n", Math.floor(roundedAmount / 50 ));
        roundedAmount %= 50;
        System.out.printf("%.0f of notes RM10\n", Math.floor(roundedAmount / 10 ));
        roundedAmount %= 10;
        System.out.printf("%.0f of notes RM5\n", Math.floor(roundedAmount / 5 ));
        roundedAmount %= 5;
        System.out.printf("%.0f of notes RM1\n", Math.floor(roundedAmount / 1 ));
        roundedAmount %= 1;
        
        System.out.println("Coints: ");
        System.out.printf("%.0f of 50 cents\n", Math.floor(roundedAmount / 0.5 ));
        roundedAmount %= 0.5;
        System.out.printf("%.0f of 20 cents\n", Math.floor(roundedAmount / 0.2 ));
        roundedAmount %= 0.2;
        System.out.printf("%.0f of 10 cents\n", Math.floor(roundedAmount / 0.1 ));
        roundedAmount %= 0.1;
        System.out.printf("%.0f of 5 cents\n", Math.floor(roundedAmount / 0.05 ));
        roundedAmount %= 0.05;
        
    }
    
    // method for add amount of money from another object of Money class
    public void add(Money anotherMoney) {
        this.amount += anotherMoney.getAmount();
    }
    
    // method for subtract amount of money from another object of Money class
    public void subtract(Money anotherMoney) {
        this.amount -= anotherMoney.getAmount();
    }
    
    public double getAmount() {
        return this.amount;
    }
}
