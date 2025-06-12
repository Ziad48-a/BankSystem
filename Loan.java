package bank;

import java.util.Date;

public class Loan {

    //Attributes
    long loanedMoney;
    long interest;
    long numberOfYears;
    double monthlyPaid;
    long totalMoneyBack;
    Date dateOfTakingLoan;
    Date dateOfEndingLoan;
    Account account;


    //methods
     void makeLoan(Account account, long loanedMoney, long numberOfYears) {

        if (account.customerScore >= loanedMoney) {

            this.numberOfYears = numberOfYears;
            this.account = account;
            this.loanedMoney = loanedMoney;
            dateOfTakingLoan = new Date();
            if (account.customerScore == loanedMoney)
                this.interest = (20 / 100);
            else if (account.customerScore <= 10 * this.loanedMoney)
                this.interest = (15 / 100);
            else if (account.customerScore >= 10 && account.customerScore <= 20)
                this.interest = (10 / 100);
            else if (account.customerScore >= 20 * this.loanedMoney)
                this.interest = (5 / 100);

            this.monthlyPaid =(double) (interest * loanedMoney + loanedMoney) / numberOfYears*12;
            this.totalMoneyBack = loanedMoney + interest * loanedMoney;
            dateOfEndingLoan=new Date(dateOfTakingLoan.getTime()) ;
            dateOfEndingLoan.setYear( (int) (dateOfEndingLoan.getYear()+numberOfYears));


        } else
            System.out.println("Your Score doesn't allow you to take this loan !");
    }


     void getLoanInfo(){

        System.out.println("Loaned money: "+loanedMoney);
        System.out.println("Number of years : "+numberOfYears);
        System.out.println("interest : "+ interest);
        System.out.println("Monthly Debt : "+monthlyPaid);
        System.out.println("Date of Ending Loan : "+dateOfEndingLoan);
        System.out.println("Total Money in Debt : "+totalMoneyBack);

    }



}
