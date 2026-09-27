ArrayList<Account> accounts = new ArrayList();
Scanner scanner = new Scanner(System.in);

void main(String[] args) {

    int choice = 0;

    while (choice != 7) {


        IO.println("""
                ===== BANK SYSTEM =====
                Enter number from 1 to 7
                1. Create Account
                2. Display All Accounts
                3. Find Account
                4. Deposit
                5. Withdraw
                6. Transfer
                7. Exit
                """);

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        if(choice <= 0 || choice < 8){
            IO.println("Invalid choice. Please select 1-7.");
        }else if (choice == 1) {
            createAccount();
        } else if (choice == 2 && accounts.isEmpty()) {
            IO.println("No accounts available to display.");
        } else if (choice == 2) {
            displayAccounts();
        } else if (choice == 3 && accounts.isEmpty()) {
            IO.println("We don't have account to find");
        } else if (choice == 3) {
            IO.print("Enter the account number you want to find: ");
            int number = scanner.nextInt();
            findAccount(number);
        } else if (choice == 4 && accounts.isEmpty()) {
            IO.println("We don't have account to deposit");
        } else if (choice == 4) {
            IO.print("Pass your account number ");
            int numberOfAccount = scanner.nextInt();

            for (Account account : accounts) {
                if (account.getAccountNumber() == numberOfAccount) {
                    IO.print("Enter the deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);

                }
            }

        } else if (choice == 5 && accounts.isEmpty()) {
              IO.println("We don't have account to withdraw");
        } else if (choice == 5) {
              IO.print("Pass your account number ");
              int numberOfAccount = scanner.nextInt();

            for (Account account : accounts) {
                if (account.getAccountNumber() == numberOfAccount) {
                    IO.print("Enter the deposit withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                }

            }

        } else if(choice == 6){


            IO.print("Enter the sender account number: ");
            int senderNumber = scanner.nextInt();

            IO.print("Enter the receiver account number: ");
            int receiverNumber = scanner.nextInt();

            IO.print("Enter the transfer amount: ");
            double amount = scanner.nextDouble();


            Account sender= null;
            Account receiver= null;

            for(Account account : accounts) {
                if (receiverNumber == account.getAccountNumber()) {
                    receiver = account;
                }

                if (senderNumber == account.getAccountNumber()) {
                    sender = account;
                }
            }

                if (sender != null && receiver != null) {
                    sender.transfer(receiver, amount);
                } else {
                    IO.println("Sender or receiver not found.");

                }


        }

        }

    exit();

    }

public void displayAccounts() {

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