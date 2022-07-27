package oops_part_2.encapsulation.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessingWindow {
    
	private Scanner scan = new Scanner(System.in);
	private List<BankAccount> bankAccountList = new ArrayList<>();
	private long lastAccountNumber=1000000000l;
	public void chooseOperation()
	{
		while(true)
		{
		System.out.println("1. Want to open a New Account?");
		System.out.println("2. Already have an Account?");
		System.out.print("Enter your choice:");
		
		switch(scan.nextInt())
		{
		case 1: create();
		        break;
		case 2: start(openExisting(0));
		        break;
		}
		}
	}
	
	private void create()
	{
		System.out.println("\n--------Form Section---------\n");
		System.out.print("Enter your First Name: ");
		String firstName = scan.next();
		System.out.print("Enter your Last Name: ");
		String lastName = scan.next();
		System.out.print("Enter your Age: ");
		int age = scan.nextInt();
		System.out.print("Enter your EmailAddress: ");
	    String emailAddress = scan.next();
	    System.out.print("Enter your Mobile Number: ");
	    String mobileNumber = scan.next();
	    String accNum = allotAccountNumber();
	    System.out.println("\nYour BankAccount Number: " + accNum);
	    System.out.println("Remember it or Forget your Money:)\n");
	    System.out.println("Enter your Account PassWord:");
	    String password = scan.next();
	    bankAccountList.add(new BankAccount(password,accNum,firstName,lastName,emailAddress,age,mobileNumber));
	    return;
	}
	
	private BankAccount openExisting(int attempts)
	{
		if(attempts>3)
		{
		System.out.println("Application Blocked...");
		System.exit(1);
		}
	    String accNumber = enterAccNumber();
	    String password = enterPassword();
	    for(int i=0;i<bankAccountList.size();i++)
	    {
	    	if(bankAccountList.get(i).getAccountNumber().equals(accNumber))
	    	{
	    		if(bankAccountList.get(i).getPassword().equals(password))
	    		{
	    			return bankAccountList.get(i);
	    		}
	    	}
	    }
	    System.out.println("Invalid Account Number or Wrong Password...Enter again. You have "+(3-attempts)+" attempt"+ ((3-attempts)<2? "":"s")+ " left");
	    return openExisting(attempts+1);
	}
	
	private String enterAccNumber()
	{
		System.out.print("\nEnter your AccountNumber: ");
	    return scan.next();
	}
	
	private String enterPassword()
	{
		System.out.print("\nEnter your Password: ");
	    return scan.next();
	}
	
	
	private void start(BankAccount bankAccount)
	{
		accountHolderDetails(bankAccount);
		boolean flag=true;
		while(flag)
		{
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. LogOut");
		System.out.print("Enter your choice: ");
		switch(scan.nextInt())
		{
		case 1: System.out.print("Enter Amount: ");
			    bankAccount.deposit(scan.nextDouble());
			    break;
		case 2: System.out.print("Enter Amount: ");
	            bankAccount.withdraw(scan.nextDouble());
	            break;
		case 3: System.out.println("Successfully Logged Out.\n");
		        flag = logout();
		        break;
		}
		}
		return;
	}
		
    private boolean logout()
    {
    	return false;
    }
    
    private String allotAccountNumber()
    {
    	lastAccountNumber++;
    	return lastAccountNumber+"";
    }
    
    private void accountHolderDetails(BankAccount bankAccount)
    {
    	System.out.println(bankAccount);
    }
}

