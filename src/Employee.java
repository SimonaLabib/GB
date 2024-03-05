import java.util.UUID;

public class Employee {
    private String employeeID = UUID.randomUUID().toString();
    private String name;
    //private RuoloDipendente
    private Bank homeBank;

    public Employee(String employeeID, String name, Bank homeBank) {
        this.employeeID = employeeID;
        this.name = name;
        this.homeBank = homeBank;
    }
}
