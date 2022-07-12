package src.classes_and_objects;

import static java.sql.Date.from;
import java.sql.Timestamp;

enum TransactionType {
    WITHDRAWAL,
    DEPOSIT
}

class Transaction {
    private final double amount;
    private final Timestamp timestamp;
    private final TransactionType type;

    public Transaction(final double amount, final Timestamp timestamp, final TransactionType type) {
        this.amount = amount;
        this.timestamp = timestamp;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public TransactionType getType() {
        return type;
    }

    // helper or utility methods
    public static Timestamp getCurrentTimestamp() {
        Long datetime = System.currentTimeMillis();
        return new Timestamp(datetime);
    }

}

class Account {
    // data members
    double accBalance;
    String accHolder;

    // constructor
    Account(double balance, String name) {
        accBalance = balance;
        accHolder = name;
    }

    private void sendTransactionMessage(Transaction transaction) {
        String message = String.format("Hello, %s. ", accHolder);
        String transactionMessageFormat = "Rs. " + transaction.getAmount() + " was %s your account on "
                + from(transaction.getTimestamp().toInstant())
                + ". Available balance is Rs. "
                + this.accBalance + ".";

        switch (transaction.getType()) {
            case WITHDRAWAL:
                message += String.format(transactionMessageFormat, "withdrawn from");
                break;
            case DEPOSIT:
                message += String.format(transactionMessageFormat, "deposited into");
                break;
            default:
                message += "An invalid transaction was attempted from your account on " + transaction.getTimestamp()
                        + ".";
                break;
        }

        // send a message with the transaction info
        System.out.println(message);
    }

    public double deposit(double amount) {
        if (amount > 0) {
            accBalance += amount;
        }

        sendTransactionMessage(
                new Transaction(amount, Transaction.getCurrentTimestamp(), TransactionType.DEPOSIT));
        return accBalance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= accBalance) {
            accBalance -= amount;
        }

        sendTransactionMessage(
                new Transaction(amount, Transaction.getCurrentTimestamp(), TransactionType.WITHDRAWAL));
        return accBalance;
    }

    // accessor or getter method
    public double getAccBalance() {
        return accBalance;
    }

    // toString() method
    @Override
    public String toString() {
        return "Account [accBalance=" + accBalance + ", accHolder=" + accHolder + "]";
    }
}

/**
 * Driver class
 */
public class ClassAndObjectDemo {
    public static void main(String[] args) {
        // Basic approach
        Account account1 = new Account(100, "Jack");
        Account account2 = new Account(200, "Jones");

        // account1.accBalance = 100;
        // account1.accHolder = "Jack";
        // account2.accBalance = 200;
        // account2.accHolder = "Jones";

        System.out.println("Account1 Details:: " + account1.accBalance + "\t" + account1.accHolder);
        System.out.println("Account2 Details:: " + account2.accBalance + "\t" + account2.accHolder);
        System.out.println();

        // Printing all the details of an object using toString() method
        System.out.println(account1);
        System.out.println(account2);
        System.out.println();

        System.out.println("Balance after deposit: " + account1.deposit(250));
        System.out.println("Balance after withdrawal: " + account1.withdraw(250));
        System.out.println(account1.getAccBalance());
        System.out.println();
    }
}