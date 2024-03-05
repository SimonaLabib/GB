import java.util.ArrayList;

public class Bank {
    private String name;
    private String address;
    private ArrayList <Employee> employees;
    private ArrayList <BankAccount> bankAccounts;
    // private PaymentSystem;


    public Bank(String name, String address, ArrayList<Employee> employees, ArrayList<BankAccount> bankAccounts) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.bankAccounts = bankAccounts;
    }
}
