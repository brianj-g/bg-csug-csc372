import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class represents a bank account with first/last name, account ID, and current balance
 */
public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	/**
	 * Default constructor sets the balance to zero
	 */
	public BankAccount() {
		this.balance = 0.0;
	}
	
	/**
	 * Adds parameter value to existing balance
	 * @param amount The amount to add
	 */
	public void Deposit(double amount) {
		this.balance += amount;
	}
	
	/**
	 * Subtracts parameter value from existing balance
	 * @param amount The amount to subtract
	 */
	public void Withdrawal(double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		this.balance -= amount;
	}
	
	/**
	 * 
	 * @return Returns the current balance
	 */
	public double getBalance() {
		/**
		 * Use a BigDecimal object to ensure the returned value is properly rounded.
		 */
		BigDecimal balanceToRound = new BigDecimal(Double.toString(this.balance));
		balanceToRound = balanceToRound.setScale(2, RoundingMode.HALF_EVEN);
		return balanceToRound.doubleValue();
	}

	/**
	 * @return Returns the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName Sets the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return Returns the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName Sets the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return Returns the account ID
	 */
	public int getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID Sets the account ID
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	/**
	 * Prints the account details
	 */
	public void accountSummary() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.printf("Balance: %.2f\n", getBalance());
	}
	
}
