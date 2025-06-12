package bank;

import java.util.Date;
import java.util.Scanner;


public class Teller {


    Scanner input = new Scanner(System.in);

    //methods
    private void withdrawMoney(Account account) {

        //Authentication
        System.out.print("Enter your bank Account : ");
        int accountNum = input.nextInt();

        System.out.print("Enter your Password: ");
        int password = input.nextInt();

        //Authorization
        if (account.password == password) {

            //withdraw process
            System.out.println("Amount of money to withdraw :");
            long gottenMoney = input.nextLong();

            if (gottenMoney <= account.balance) {
                account.balance = account.balance - gottenMoney;
                System.out.println("Successful Process, withdraw your money");
            } else
                System.out.println("Not Enough Money");

        } else
            System.out.println("Invalid Password ");
    }

    private void setMoney(Account account) {

        System.out.println("Enter the amount of money you want ot set :");
        int amountOfMoney = input.nextInt() ;

        account.balance+=amountOfMoney ;

        System.out.println("Successful set , Balance now is "+account.balance);

    }

//    private void getAccountInfo(Account account){
//
//        //Delegation
//        account.getInfo();
//
//    }

    private void takeLoan(Account account,long loanedMoney,long numberOfYears ){
            Loan myLoan = new Loan() ;

            //Delegation
            myLoan.makeLoan(account,loanedMoney,numberOfYears);
            account.loans.add(myLoan);

            //print info
            myLoan.getLoanInfo();
    }

    private void createAccount(Customer owner,int password){
        Account account= new Account((int)Account.numberOfAccounts+1,0,0,owner,new Date(),password);
        
    }

}
