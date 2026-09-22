ArrayList<Account> accounts = new ArrayList();
Scanner scanner = new Scanner(System.in);

void main(String[] args){



  createAccount();
  displayInfo();
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

    IO.println("Account not founded");

}

public  void createAccount() {

    IO.println("enter your name ");
    String name = scanner.nextLine();



    Account newAccount = new Account(
            name,
            AccountType.CHECKING,
            AccountStatus.ACTIVE
    );

    accounts.add(newAccount);
}


