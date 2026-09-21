void main (){

    account1.deposit(200);
    account1.withdraw(100);
    account2.deposit(200);
    account2.withdraw(100);

    displayInfo();
}

Account account1 = new Account("Jack", 500, AccountType.CHECKING , AccountStatus.BLOCKED );
Account account2 = new Account("James", 5921, AccountType.CHECKING , AccountStatus.ACTIVE );

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