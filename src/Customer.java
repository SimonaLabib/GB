import java.util.ArrayList;
import java.util.UUID;
import input.In;

public class Customer {
    private final String customerID = UUID.randomUUID().toString();
    private String name;
    private String surname;
    private String address;
    private String contactDetails;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();


    public Customer() {

        System.out.println("Inserire il nome: ");
        this.name = In.scanner.nextLine();
        System.out.println("Inserire il cognome: ");
        this.surname = In.scanner.nextLine();
        System.out.println("Inserire l'indirizzo: ");
        this.address = In.scanner.nextLine();
        System.out.println("Inserire il numero di telefono: ");
        this.contactDetails = In.scanner.nextLine();
    }
    public void CreateBankAccount(){
        /*System.out.println("Scegli tra i seguenti tipi di conto bancario: ");
        for(BankAccountType element : BankAccountType.values()) {
            System.out.println(element);
        }*/
        String input = In.scanner.nextLine();
        for(BankAccountType element : BankAccountType.values()){

            if(input.equalsIgnoreCase(element.getAccountName())){
                BankAccount newBankAccount = new BankAccount(this, element);
                bankAccounts.add(newBankAccount);
            }
        }
    }

    public void PrintBankAccounts() {
        for(BankAccount element : bankAccounts){
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }
}
