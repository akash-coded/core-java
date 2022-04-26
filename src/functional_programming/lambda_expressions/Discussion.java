package src.functional_programming.lambda_expressions;

interface Account<U extends Number> {
    void deposit(U amount);

    void withdraw(U amount);

    void showBalance();
}

class SavingsAccount<T extends Number> implements Account<T> {
    T balance;

    public SavingsAccount(T balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(T amount) {
        System.out.println("Rs. 5000 withdrawn");
    }

    @Override
    public void deposit(T amount) {
        System.out.println("Rs. 5000 deposited");
    }

    @Override
    public void showBalance() {
        System.out.println("Balance is " + this.balance);
        System.out.println("Interest earned is " + 0.04 * this.balance.intValue());
    }
}

class CurrentAccount<T extends Number> implements Account<T> {
    T balance;

    public CurrentAccount(T balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(T amount) {
        System.out.println("Rs. 5000 withdrawn");
    }

    @Override
    public void deposit(T amount) {
        System.out.println("Rs. 5000 deposited");
    }

    @Override
    public void showBalance() {
        System.out.println("Balance is " + balance);
    }
}

class Bank<V extends Number> {
    private Account<V> bankAccount;

    public Bank(Account<V> bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Account<V> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Account<V> bankAccount) {
        this.bankAccount = bankAccount;
    }

    void showAccountType() {
        System.out.println(bankAccount.getClass().getSimpleName());
    }
}

public class Discussion {
    public static void main(String[] args) {
        CurrentAccount<Double> myAccount = new CurrentAccount<>(1000.0);
        Bank<Double> bank = new Bank<>(myAccount);

        bank.showAccountType();
        bank.getBankAccount().showBalance();
    }
}