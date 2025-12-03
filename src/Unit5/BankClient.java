package Unit5;

import java.sql.SQLOutput;

public class BankClient {
    private String name;
    private String id;
    public static final String BANK_NAME = "Bank of China";
    private String membership;

    private boolean isLocal;

    public static int totalClients = 0;

    public BankClient(String name, String id){
        this.name = name;//parameter name hides the attribute name
        this.id = id;
        totalClients++;
    }

    public BankClient(String name, String id, boolean isLocal, String m) {
        this(name, id);//calling a first constructor
        this.isLocal = isLocal;//this helps to avoid hiding
        membership = m;//Gold, Silver, Bronze
    }

    public void compareClients(BankClient another) {
        System.out.println("this client has status: " + this.membership +
                "another client has status: " + another.membership);
    }


    //you can use static variables (functions) inside instance methods
    public void printClientInfo() {
        System.out.println("Client name: " + this.name);
        System.out.println("Client id: " + this.id);

        System.out.println("Total clients: " + totalClients);
    }

    //you cannot use instance variables (methods) in static context
    public static int getTotalClients() {
        //System.out.println("Client name: " + name);
        return totalClients;
    }

    @Override
    public String toString() {
        return "The bank client. \nName: " + name + "\nID: " + id;
    }

    public static void main(String[] args) {
        BankClient bc = new BankClient("John", "12345");
        BankClient bc1 = new BankClient("Mary", "35232");
        bc.printClientInfo();
        bc1.printClientInfo();
        System.out.println(BankClient.getTotalClients());

        System.out.println(bc);
        System.out.println(BankClient.BANK_NAME);

    }
}
