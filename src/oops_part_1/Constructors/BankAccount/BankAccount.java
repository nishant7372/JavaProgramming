package oops_part_1.Constructors.BankAccount;

public class BankAccount {
	
	@SuppressWarnings("unused")
	private String accountNumber;
	@SuppressWarnings("unused")
	private String customerName;
	private double balance;
	@SuppressWarnings("unused")
	private String emailAddress;
	@SuppressWarnings("unused")
	private long phoneNumber;
	
	public BankAccount(String accountNumber, String customerName, double balance, String emailAddress, long phoneNumber) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public void Deposit(double amount)
	{
		this.balance+=amount;
		System.out.println("New Balance:" + this.balance);
	}
	public void withdrawl(double amount)
	{
		if(this.balance-amount<0)
			System.out.println("Only " + this.balance + " is available. Withdrawl not processed");
		else
			this.balance-=amount;
		System.out.println("New Balance:" + this.balance);
	}

	public double getBalance()
	{
		return balance;
	}
}
