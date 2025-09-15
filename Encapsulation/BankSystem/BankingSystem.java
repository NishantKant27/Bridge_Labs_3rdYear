package BankSystem;
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        setAccountNumber(accountNumber);
        setHolderName(holderName);
        setBalance(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            this.accountNumber = 1;
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        if (holderName == null || holderName.trim().isEmpty()) {
            this.holderName = "Unknown";
        } else {
            this.holderName = holderName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private boolean loanApproved;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            loanApproved = true;
            System.out.println("Loan of " + amount + " approved for Savings Account.");
        } else {
            System.out.println("Loan not approved for Savings Account.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private boolean loanApproved;

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            loanApproved = true;
            System.out.println("Loan of " + amount + " approved for Current Account.");
        } else {
            System.out.println("Loan not approved for Current Account.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(401, "Alice", 8000);
        BankAccount acc2 = new CurrentAccount(402, "Bob", 15000);

        BankAccount[] accounts = { acc1, acc2 };

        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);
            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
                loan.applyForLoan(5000);
            }
            System.out.println("----------------------------");
        }
    }
}
