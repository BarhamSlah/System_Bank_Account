import java.util.Scanner;


public class Account {

    private String name;
    private int accountNumber;
    private static int nextAccountNumber = 1;
    private double balance;
    private AccountType accountType;
    private AccountStatus accountStatus;

    public  Account(String name, double balance, AccountType accountType, AccountStatus accountStatus){
        this.name = name;
        this.accountNumber = nextAccountNumber++;
        this.balance = balance;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
    }

    void setName(String name){
        this.name = name;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }

    void setAccountStatus(AccountStatus accountStatus){
        this.accountStatus = accountStatus;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }


    public AccountStatus getAccountStatus(){
        return this.accountStatus;
    }

}






