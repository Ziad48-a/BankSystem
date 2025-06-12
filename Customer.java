package bank;

public class Customer {

    // Attributes
    int id;
    String name;
    String address;
    int phoneNum;
    Account[] accounts;


    //constructor
    public Customer(int id, String name, String address, int phoneNum, Account[] accounts) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.accounts = accounts;

    }


}
