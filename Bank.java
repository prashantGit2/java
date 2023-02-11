public class Bank {
    public int numberOfAccounts = 0;

    public static void main(String arg[]) {

        Account account1 = new Account("Prashant", "1000", 10000, "1234");
        Account account2 = new Account("Raj", "1001", 20000, "9999");
        Account account3 = new Account("Rajesh", "1002", 30000, "0000");

        // prashant.deposit(1000);
        // System.out.println(prashant.getBalance());
        // raj.getBalance();
        // prashant.printBalance();
        // raj.withdraw(500);
        // raj.printBalance();

        account1.printDetails();
        account2.printDetails();
        account3.printDetails();

        // account1.withdraw(500);
        // acc3.withdraw(1000);
        // acc3.deposit(7000);

        account3.updateName("Vaibhav", "0000");
        account3.printDetails();

        // acc3.printDetails();

    }
}

class Account {
    // int accountNumber = 1;
    private String name;
    private double balance;
    private int[] transactions;
    private int transactionCount;
    private String pin;
    private String accountNumber;

    Account(String name, String accountNumber, double balance, String pin) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
        this.transactionCount = 0;
        this.pin = pin;
        this.transactions = new int[20];
        // accountNumber++;
    }

    // transactions
    public void deposit(int amount) {
        balance += amount;
        transactions[transactionCount] = amount;
        transactionCount += 1;
    }

    public void withdraw(int amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            transactions[transactionCount] = -amount;
            transactionCount += 1;
        } else {
            System.out.println("Insufficient balance");
        }

    }

    // Account details Modifications
    public void updateName(String newName, String pin) {
        String oldName = name;
        if (this.pin == pin) {
            name = newName;
            System.out.println("Account No:- " + accountNumber + " Name changed from " + oldName + " to " + name);
        } else {
            System.out.println("Wrong PIN Entered");
        }
    }

    public void updatePin(String newPin, String pin) {
        if (this.pin == pin) {
            this.pin = newPin;
            System.out.println("Pin changed successfully for " + name);
        } else {
            System.out.println("Wrong PIN Entered");
        }
    }

    // details getter
    public double getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNumber;
    }

    public void printBalance() {
        System.out.println("balance for a/c no" + accountNumber + " is " + balance);
    }

    public void printTransactions() {
        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i] > 0) {
                System.out.println("Deposit: " + transactions[i]);
            } else {
                System.out.println("Withdraw: " + -transactions[i]);
            }
        }
        System.out.println("");
    }

    public void printDetails() {
        System.out.println("\nHello " + name);
        System.out.println("Your balance is " + getBalance());
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your transactions count is " + transactionCount + "\n");
        if (transactionCount > 0) {
            System.out.println("Your transactions are ");
            printTransactions();
        }

    }
}