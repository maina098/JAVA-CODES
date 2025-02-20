/* ANDERSON MAINA  CT101/G/20948/23*/

//INITIALIZING THE BASE CLASS
abstract class BankAccount {
    protected double balance;

  //A CONSTRUCTOR TO INITIALIZE BALANCE
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // A DEPOSIT METHOD
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   //WITHDRAWAL METHOD
    public abstract void withdraw(double amount);
}

//SAVINGS ACCOUNT SUBCLASS
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 required.");
        }
    }
}

//USING CONDITIONALS TO CHECK THE ACCOUNTS SUBCLASS
class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && balance >= totalAmount) {
            balance -= totalAmount;
            System.out.println("Withdrew: $" + amount + " (Transaction Fee: $1) | Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// DEMONSTRATING
public class BankingApplication {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(500);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(300); // Should succeed
        savingsAccount.withdraw(400); // Should fail due to balance limit

      
        CheckingAccount checkingAccount = new CheckingAccount(500);
        checkingAccount.deposit(150);
        checkingAccount.withdraw(200); // Should succeed with $1 fee
        checkingAccount.withdraw(450); // Should fail due to insufficient balance
    }
}
