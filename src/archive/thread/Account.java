package archive.thread;

/**
 * @author Chandra Shekhar Paatni on 28/5/19
 */
public class Account {

    private String name;
    private String accountNumber;
    private double amount;

    public Account(String name, String accountNumber, double amount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class RunnableInterface implements Runnable {
    private Account account;

    public RunnableInterface(Account account) {
        this.account = account;
    }

    public RunnableInterface() {
    }

    @Override
    public void run() {
        withdraw();
    }

    private void withdraw() {
        for (int i = 0; i < 5 ; i++)
            if (account.getAmount() < 0)
                System.out.println("account is overdrawn");
            else
                makeWithdrawal(10);
    }

    private synchronized void makeWithdrawal(int i) {
        if (account.getAmount() >= i) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.setAmount(account.getAmount() - i);
            System.out.println(Thread.currentThread().getName() + " completes withdrawal" + account.getAmount());
        } else
            System.out.println("Not enough money in account for "+ Thread.currentThread().getName() +" to withdraw "+ account.getAmount());
    }

    public static void main(String[] args) {
        RunnableInterface runnableInterface = new RunnableInterface(new Account("Shekhar", "123456789", 50));
        Thread thread = new Thread(runnableInterface, "Lucy");
        Thread thread1 = new Thread(runnableInterface, "Fred");
        thread.start();
        thread1.start();
    }
}
