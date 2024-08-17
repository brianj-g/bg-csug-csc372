public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	// Constant overdraftFee is set here
	private final double overdraftFee = 30.0;
	
	public CheckingAccount(double interestRate) {
		this.setInterestRate(interestRate);
		System.out.printf("A new BankAccount has been opened with balance of %.2f at %.4f interest rate.\n", getBalance(), this.interestRate);
	}
	
	/**
	 * Subtracts parameter from existing balance, and applies overdraft fee if 
	 * withdrawal amount is greater than the balance.
	 */
	@Override
	public void withdrawal(double amount) {
		if (amount > getBalance()) {
			processWithdrawal(amount);
		} else {
			setBalance(getBalance() - amount);
		}
	}
	
	public void processWithdrawal(double amount) {
		setBalance(getBalance() - (amount + overdraftFee));
		System.out.println("Account is overdrawn. A fee of $" + overdraftFee + " has been assessed." );
		System.out.println("Current Balance: " + getBalance());
	}


	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
