public enum BankAccountType {
    CHECKING("Checking Account", 0.06F),
    SAVING("Saving Account", 0.75F),
    MONEYMARKETACCOUNT("Money Market Account",1.25F),
    CD("CD", 1.625F),
    IRA("IRA", 0.06F),
    JOINT("Joint Account",null),
    BUSINESS("Business Account", 0.225F),
    STUDENT("Student Account", 0.2F),
    TRUST("Trust Account", 0.375F),
    SENIOR("Senior Account", null),
    CUSTODIAL("Custodial Account", 0.5F),
    ESCROW("Escrow Account", 0.2F),
    HSA("Health Savings Account ", 0.75F),
    POD("Payable on Death", 0.5F),
    OVERDRAFT("Overdraft Account", null);

    private String accountName;
    private Float interestRate;

    BankAccountType(String accountName, Float interestRate) {
        this.accountName = accountName;
        this.interestRate = interestRate;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String toString() {
        return
                "accountName: '" + accountName + '\'' +
                ", interestRate: " + interestRate +
                '}';
    }
}
