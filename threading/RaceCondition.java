
public class RaceCondition {

    public static void main(String[] args) {
        BankingAccount b = new BankingAccount("Sintu", "123456789", 0);
        System.out.println(b.getBalance());
        Runnable debitCard = () -> {
            for (int i = 0; i < 10000; i++) {
                b.dayDeposit();
            }
        };
        Runnable followupCard = () -> {
            for (int i = 0; i < 10000; i++) {
                b.dayDeposit();
            }
        };
        Thread t1 = new Thread(debitCard);
        Thread t2 = new Thread(followupCard);
        t1.start();
        t2.start();
        // System.out.println("Final Balance 1: " + b.getBalance());
        try {
            t1.join();
            t2.join();
            System.out.println("Final Balance 2: " + b.getBalance());

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

// class DebitCard implements Runnable{
//   @Override
//   public void run(){
//   }
// }
class BankingAccount {

    private int balance;
    private String name;
    private String accountNumber;

    public BankingAccount(String name, String accountNumber, int balance) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public synchronized void  dayDeposit() {
        this.balance++;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    // withdraw account

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    // deposit account

    public void deposit(int amount) {
        balance = balance + amount;
    }
}
