package oops_part_2.encapsulation.BankAccount;

public class BankAccount {

	private String accountNumber;
	private double accountBalance;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private String mobileNumber;
	private String password;
	
	private BankAccount(String password, String accountNumber, double accountBalance, String firstName, String lastName,
			String emailAddress, int age, String mobileNumber) {
		this.password=password;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public BankAccount(String password,String accountNumber, String firstName, String lastName, String emailAddress, int age,
			String mobileNumber) {
		this(password,accountNumber,0.0,firstName,lastName,emailAddress,age,mobileNumber);
	}
	
	public void deposit(double amount)
	{
		this.accountBalance+=amount;
		System.out.println("\nRs. " + amount + " has been successfully deposited");
		System.out.println("Current Balance: Rs. " + this.accountBalance+"\n");
	}
	
	public void withdraw(double amount)
	{
		if(this.accountBalance-amount>=0)
			this.accountBalance-=amount;
		else
			System.out.println("\nInsufficient Balance. Withdrawl Not Processed");
		System.out.println("Available Balance: Rs. " + this.accountBalance+"\n");
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "\nAccount Holder Details: \n\nAvailable Balance: Rs." + accountBalance + ", \n\nName: "
				+ firstName +" "+ lastName + ", \nAge: " + age + ", \nEmail Address: " + emailAddress + ", \nMobile Number: (+91)" + mobileNumber+"\n";
	}
	
}
