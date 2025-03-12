class BankAccount {
    // Attribute
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Withdrawal method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Current Balance: " + balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
        account.withdraw(-50);
    }
}
