package bank;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    //Attributes
    private int accountNum;
    long balance;
    private Customer owner;
    private Date lastTransaction;
    int customerScore;
    int password;
    static long numberOfAccounts ;
    ArrayList<Loan> loans = new ArrayList<>(10);

    //constructor
    public Account(int accountNum, int customerScore, long balance, Customer owner, Date lastTransaction, int password) {
        this.accountNum = accountNum;
        this.customerScore = customerScore;
        this.balance = balance;
        this.owner = owner;
        this.lastTransaction = lastTransaction;
        this.password = password;
        numberOfAccounts++ ;
    }

    //methods
    public void getInfo() {
        System.out.println("Account Information:\n\n" +
                "Name: " + owner.name +
                "\nSocial Security Number: " + owner.id +
                "\nAcount Number: " + accountNum +
                "\nBalance: " + balance +
                "\n Last Transaction: " + lastTransaction +
                "\n Customer Score : " + customerScore);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
