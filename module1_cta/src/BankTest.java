/**
 * Contains rudimentary unit tests for BankAccount and CheckingAccount classes
 */
public class BankTest {
	
	public static void main(String[] args) {
		
	// Unit tests for BankAccount and CheckingAccount
		BankAccount myBankAccount = new BankAccount();
		CheckingAccount myCheckingAccount = new CheckingAccount(0.05);
		double amountToAdd = 100.0;
		double amountToSubtract = 75.0;
		double amountOverdraft = 500.00;
		double testBalance = 0.00;
		
		// Set name and ID
		myBankAccount.setFirstName("Brian");
		myBankAccount.setLastName("Gunther");
		myBankAccount.setAccountID(999);
		
		// Initial balance should be zero
		System.out.print("Testing Initial Balance: ");
		checkMethod(myBankAccount.getBalance(), testBalance);
		
		// Test deposit method
		System.out.print("Testing deposit: ");
		myBankAccount.deposit(amountToAdd);
		testBalance += amountToAdd;
		checkMethod(myBankAccount.getBalance(), testBalance);
		
		// Test withdrawal method
		System.out.print("Testing withdrawl: ");
		testBalance -= amountToSubtract;
		try {
			myBankAccount.withdrawal(amountToSubtract);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		checkMethod(myBankAccount.getBalance(), testBalance);

		
		// Test the summary method
		myBankAccount.accountSummary();
		
	}
	
	/*
	 * Method to check for balance accuracy
	 */
	public static void checkMethod(double balance, double checkValue) {
		if (balance == checkValue) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.printf("Expected: %.2f / Actual: %.2f\n\n", checkValue, balance);
	}

}
