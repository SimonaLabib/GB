import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {

    private final String bankAccountID = UUID.randomUUID().toString();
    private float balance = 0;
    private Customer accountHolder;
    private ArrayList<Transaction> transactions;
    private BankAccountType bankAccountType;

    public BankAccount(Customer accountHolders, BankAccountType bankAccountType) {
        this.accountHolder = accountHolders;
        this.bankAccountType = bankAccountType;
    }

    public void CreateTransaction(){
        //Transaction newTransaction = new Transaction()
    }

    public float CalculateBalance(Transaction transaction){
        balance += transaction.getAmount();
        return balance;
    }

    public String getBankAccountID() {
        return bankAccountID;
    }

    public float getBalance() {
        return balance;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder=" + accountHolder +
                ", bankAccountID='" + bankAccountID + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                ", bankAccountType=" + bankAccountType +
                '}';
    }
}