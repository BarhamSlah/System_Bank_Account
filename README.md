# 🏦 Bank Account System

A simple **console-based Bank Account Management System built with Java**.

This project was created as a Java learning project to practice **Object-Oriented Programming (OOP), classes, objects, encapsulation, enums, ArrayList, methods, loops, conditionals, and basic account operations**.

## 📌 Features

The system provides a simple menu with the following operations:

* 🏦 **Create Account**

  * Create a new bank account
  * Choose between `CHECKING` and `SAVING`
  * Automatically assign an account number
  * New accounts start with an `ACTIVE` status

* 📋 **Display All Accounts**

  * View all created accounts
  * Display account number, name, balance, type, and status

* 🔎 **Find Account**

  * Search for an account using its account number

* 💰 **Deposit**

  * Deposit money into an account
  * Prevent invalid or non-positive deposit amounts
  * Prevent deposits into inactive accounts

* 💸 **Withdraw**

  * Withdraw money from an account
  * Prevent invalid withdrawal amounts
  * Prevent withdrawing more than the available balance
  * Prevent withdrawals from inactive accounts

* 🔄 **Transfer**

  * Transfer money between two accounts
  * Check that both accounts exist
  * Prevent transfers to the same account
  * Prevent invalid transfer amounts
  * Prevent transfers when the sender has insufficient funds
  * Prevent transfers involving inactive accounts

* 🚪 **Exit**

  * Safely exit the bank system

## 🧠 Java Concepts Practiced

This project focuses on several important Java concepts:

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* `ArrayList`
* `for-each` loops
* `if / else` conditions
* `while` loops
* Methods
* Enums
* `static` fields
* `final` fields
* Access modifiers
* Object references
* Basic input handling with `Scanner`
* Basic validation
* Object-to-object interaction

## 🗂️ Project Structure

```text
System_Bank_Account/
│
├── src/
│   ├── Main.java
│   ├── Account.java
│   ├── AccountType.java
│   └── AccountStatus.java
│
├── README.md
└── .gitignore
```

### `Account.java`

Represents a bank account and contains the main account data and operations.

It manages:

* Account name
* Account number
* Balance
* Account type
* Account status
* Deposit
* Withdrawal
* Transfer

### `AccountType.java`

Defines the available account types:

* `SAVING`
* `CHECKING`

### `AccountStatus.java`

Defines the possible account statuses:

* `ACTIVE`
* `BLOCKED`
* `CLOSED`

### `Main.java`

Contains the main console menu and handles user interaction with the system.

## 🔄 How It Works

The program starts by displaying the main menu:

```text
===== BANK SYSTEM =====

1. Create Account
2. Display All Accounts
3. Find Account
4. Deposit
5. Withdraw
6. Transfer
7. Exit
```

The user selects an option, and the program performs the corresponding operation.

Accounts are stored in an `ArrayList<Account>` while the program is running.

Each new account receives an automatically generated account number.

## ▶️ How to Run

### Requirements

* Java Development Kit (JDK)
* IntelliJ IDEA or another Java IDE

### Steps

1. Clone the repository:

```bash
git clone https://github.com/BarhamSlah/System_Bank_Account.git
```

2. Open the project in your Java IDE.

3. Run `Main.java`.

4. Use the console menu to interact with the system.

## 🧪 Example Workflow

```text
1. Create Account
   ↓
2. Create another Account
   ↓
3. Deposit money
   ↓
4. Withdraw money
   ↓
5. Transfer money
   ↓
6. Display accounts
```

This allows you to see how balances change after deposits, withdrawals, and transfers.

## ⚠️ Current Limitations

This is a **learning project**, not a production banking application.

Currently:

* Account data is stored only in memory.
* Data is lost when the program stops.
* There is no database.
* There is no authentication or login system.
* Input handling is basic.
* It is a console application without a graphical interface.
* Financial amounts currently use `double` for simplicity.

## 🚀 Possible Future Improvements

Possible improvements for future versions include:

* Add PostgreSQL database storage
* Separate menu operations into dedicated methods
* Improve input validation
* Use `BigDecimal` for financial calculations
* Add account deletion/closing
* Add account blocking/unblocking
* Add transaction history
* Add customer login/authentication
* Add a transaction model
* Improve project architecture
* Add unit tests
* Build a REST API with Spring Boot

## 🎯 Purpose of the Project

The main purpose of this project is to practice Java by building a small system from scratch instead of only studying individual Java features.

It demonstrates how basic Java concepts can be combined to create a working application.

---

**Built with ☕ Java**

**Author:** [Barham Salahaddin](https://github.com/BarhamSlah)
