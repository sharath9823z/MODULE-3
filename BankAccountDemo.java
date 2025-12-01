class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double amount) {
        this.accountHolder = name;
        this.balance = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.display();
    }
}
