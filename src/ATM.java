import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.UUID;

public class ATM {
    private String idATM = UUID.randomUUID().toString();
    private Position position;
    private ArrayList<BankAccount> bankAccountsSupported;

    public ATM(String idATM, Position position, ArrayList<BankAccount> bankAccountsSupported) {
        this.idATM = idATM;
        this.position = position;
        this.bankAccountsSupported = bankAccountsSupported;
    }
}
