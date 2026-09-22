ArrayList<Account> accounts = new ArrayList();

void main(String[] args){

  accounts.add(account1);
  accounts.add(account2);
  findAccount(accounts , 2);

}

Account account1 = new Account("Jack",  AccountType.CHECKING , AccountStatus.ACTIVE );
Account account2 = new Account("James",  AccountType.CHECKING , AccountStatus.ACTIVE );


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


public static void findAccount(ArrayList<Account> accounts ,  int accountNumber){

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