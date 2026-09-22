void main(String[] args){

    displayInfo();
findAccount(accounts , 2);
}

Account account1 = new Account("Jack",  AccountType.CHECKING , AccountStatus.ACTIVE );
Account account2 = new Account("James",  AccountType.CHECKING , AccountStatus.ACTIVE );

Account[] accounts = new Account[]{account1 , account2};

public void displayInfo() {

    for (Account account : accounts) {
        IO.println("Account Number: " + account.getAccountNumber());
        IO.println("Name: " + account.getName());
        IO.println("Balance: " + account.getBalance());
        IO.println("Account Type: " + account.getAccountType());
        IO.println("Account Status: " + account.getAccountStatus());

        System.out.println();
    }

}


public static void findAccount(Account[] accounts , int accountNumber){

    for(Account account : accounts){

        if(account.getAccountNumber() == accountNumber){
            IO.println("Account Number: " + account.getAccountNumber());
            IO.println("Name: " + account.getName());
            IO.println("Balance: " + account.getBalance());
            IO.println("Account Type: " + account.getAccountType());
            IO.println("Account Status: " + account.getAccountStatus());
            return;
        }

    }

    IO.println("Account not founded");

}