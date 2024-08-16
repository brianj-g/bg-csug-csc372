### Option #1: Implementing a Superclass Bank Account

#### Part 1: Implement a Superclass `BankAccount`
Implement a superclass `BankAccount` that has the following fields and methods:

##### Fields:
- `string firstName`
- `string lastName`
- `int accountID`
- `double balance`

##### Methods:
- **constructor()**: Initializes `balance` to zero.
- **deposit(double amount)**: Accepts a single value `double` parameter; the parameter value is added to the existing balance.
- **withdrawal(double amount)**: Accepts a single value `double` dollar amount; the parameter value is subtracted from the existing balance.
- Setters and getters for `firstName`, `lastName`, and `accountID`.
- **getBalance()**: Getter to return the balance.
- **accountSummary()**: Prints all account information.

#### Part 2: Implement a `CheckingAccount` Class
Implement a `CheckingAccount` class that inherits from the `BankAccount` class, with the following features:

- Has an `interestRate` attribute.
- Allows overdraft withdrawals and charges a $30 fee.

##### Methods:
- **processWithdrawal(double amount)**: Displays a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed.
- **displayAccount()**: Displays all superclass attributes and provides an additional interest rate.

Ensure that your program has the two required classes and a test class.

Place each Java class into a separate Java source file.

---

### Additional Requirements
- Students must use appropriate version control for all programmatic assignments created. GIT repositories should be established, and screen captures of repositories should be submitted with each assignment.
- Submit screenshots of your program's execution and output.
- Include all appropriate source code in a zip file.
