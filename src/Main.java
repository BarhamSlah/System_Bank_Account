void main (){

    displayInfo();

}

Account account1 = new Account("Jack", 5244, AccountType.CHECKING , AccountStatus.ACTIVE );
Account account2 = new Account("James", 5921, AccountType.CHECKING , AccountStatus.ACTIVE );

Account[] accounts = new Account[]{account1 , account2};

public void displayInfo() {

    for (Account account : accounts) {
        IO.println("Name: " + account.getName());
        IO.println("Balance: " + account.getBalance());
        IO.println("Account Type: " + account.getAccountType());
        IO.println("Account Status: " + account.getAccountStatus());
        IO.println("Account Number: " + account.getAccountNumber());

        System.out.println();
    }

}