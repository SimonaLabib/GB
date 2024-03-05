import java.util.UUID;

public class Transaction {

    private final String transactionID = UUID.randomUUID().toString();
    private final long dateTransaction = System.currentTimeMillis();
    private final float amount;
    private final BankAccount originBankAccount;
    //private TransactionType;
    private final BankAccount destinationBankAccount;
    public Transaction(float amount, BankAccount originBankAccount, BankAccount destinationBankAccount){
        this.amount = amount;
        this.originBankAccount = originBankAccount;
        this.destinationBankAccount = destinationBankAccount;
    }

    public float getAmount() {
        return amount;
    }
    public String getTransactionID() {
        return transactionID;
    }
    public long getDateTransaction() {
        return dateTransaction;
    }
    public BankAccount getOriginBankAccount() {
        return originBankAccount;
    }

}
