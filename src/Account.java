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

    public void withdraw(double withdrawMoney) {

        if (accountStatus != AccountStatus.ACTIVE) {
            System.out.println("You can't deposit from this account because this account is " + accountStatus.name());
        } else if (withdrawMoney <= 0) {
            IO.println("Invalid withdrawal amount");
        } else if (withdrawMoney > balance) {
            IO.println("Withdrawal amount is larger than balance");
        } else {
            balance -= withdrawMoney;
        }
    }

    public void deposit(double depositMoney){
        if(AccountStatus.ACTIVE != accountStatus){
            System.out.println("You can't deposit from this account because this account is " + accountStatus.name());
        } else if(depositMoney <= 0){
            IO.println("Invalid deposit amount");
        } else {
         balance += depositMoney;
        }

    }


    }








