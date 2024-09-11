package paie;

public class Encapsulation {

    public static void main(String[] args) {
        BankAccount b = new BankAccount("12342234", 12342.23, "John");
        System.out.println(b.getName());
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
        b.deposit(1000);
        System.out.println(b.getBalance());
        b.withdraw(1000);
        System.out.println(b.getBalance());

    }
}

class BankAccount {

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double b) {
        if (b > 0) {
            this.balance += b; 
        }else {
            System.out.println("Invalid deposit amount: " + b);
        }
    }

    public void withdraw(double b) {
        if (b > 0 && b <= this.balance) {
            this.balance -= b; 
        }else {
            System.out.println("Invalid withdraw amount: " + b);
        }
    }

}
