package labpr;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal: Balance = " + balance);
        }
    }
}

class AccountHolder implements Runnable {
    private final BankAccount account;

    public AccountHolder(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.deposit(100);
            account.withdraw(50);
        }
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread holder1 = new Thread(new AccountHolder(account));
        Thread holder2 = new Thread(new AccountHolder(account));
        holder1.start();
        holder2.start();
    }
}
