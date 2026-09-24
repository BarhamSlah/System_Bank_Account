ArrayList<Account> accounts = new ArrayList();
Scanner scanner = new Scanner(System.in);

void main(String[] args){



}

public void displayInfo() {

    for (Account account : accounts){
        IO.println("Account Number: " + account.getAccountNumber());
        IO.println("Name: " + account.getName());
        IO.println("Balance: " + account.getBalance());
        IO.println("Account Type: " + account.getAccountType());
        IO.println("Account Status: " + account.getAccountStatus());
        IO.println();
    }

}

public void findAccount(int accountNumber){

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

    IO.println("Account not found");

}

public void createAccount() {

    IO.println("Enter your name: ");
    String name = scanner.nextLine();

    IO.println("Enter number: ");
    IO.println("1 = CHECKING & 2 = SAVING");
    int choice = scanner.nextInt();
    scanner.nextLine();


    while (choice != 1 && choice != 2) {
        System.out.println("Invalid choice! Enter 1 or 2: ");
        choice = scanner.nextInt();
        scanner.nextLine();
    }

    AccountType accountType;
    if (choice == 1) {
        accountType = AccountType.CHECKING;
    } else {
        accountType = AccountType.SAVING;
    }


    Account newAccount = new Account(
            name,
            accountType,
            AccountStatus.ACTIVE
    );

    accounts.add(newAccount);
}

public void exit(){
    IO.println("Thank you for choosing our bank system!");
}