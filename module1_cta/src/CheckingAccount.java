public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	// Constant overdraftFee is set here
	private final double overdraftFee = 30.0;
	
	public CheckingAccount(double interestRate) {
		this.setInterestRate(interestRate);
	}
	
	/**
	 * Subtracts parameter from existing balance, and applies overdraft fee if 
	 * withdrawal amount is greater than the balance.
	 */
	@Override
	public void withdrawal(double amount) {
		if (amount > getBalance()) {
			// FIXME
		}
	}
	
	public void processWithdrawal(double amount) {
		//FIXME
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
