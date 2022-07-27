package oops_part_1.Classes.BankAccount;

public class BankAccount {

	private long accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNumber;

	public void setAccountNumber(long accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
    }

	public void setEmail(String email)
	{
	    this.email = email;
    }
	
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getCustomerName()
	{
		return this.customerName;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public long getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public long getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public void Deposit(double deposit)
	{
		 this.balance+=deposit;
	}
	
	public void Withdrawl(double withdraw)
	{
		if(this.balance-withdraw<0)
			System.out.println("InSufficient Amount! Withdrawl not processed...");
		else
		this.balance-=withdraw;
	}
}
