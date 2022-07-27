package ArrayList.Banking;

import java.util.Scanner;

public class ProcessingWindow {
    private static Scanner scan = new Scanner(System.in);
    private Bank bank;
	public void chooseOperation(String bankName)
	{
		this.bank = new Bank(bankName);
		availableActions();
		boolean quit = false;
		while(!quit)
		{
		System.out.println("Enter your choice(press 0 to view available actions):");
		int choice =scan.nextInt();
		scan.nextLine();
		switch(choice)
		{
		case 0: availableActions();
		        break;
		case 1: addBranch();
		        break;
		case 2: addCustomer();
		        break;
		case 3: addCustomerTransaction();
		        break;
		case 4: listCustomers();
		        break;
		case 5: System.out.println("Turning Off Application...");
		        quit = true;
		        break;
		}
		}
	}
	
	private void addBranch()
	{
		System.out.println("Enter Branch Name:");
		if(bank.addBranch(scan.nextLine()))
			System.out.println("Branch Added Successfully");
	}
	
	private void addCustomer()
	{
		System.out.println("Enter Branch Name:");
		String branchName = scan.nextLine();
		System.out.println("Enter Customer Name:");
		String customerName = scan.nextLine();
		System.out.println("Enter Initial Transaction:");
		double initialTransaction = scan.nextDouble();
		if(bank.addCustomer(branchName, customerName, initialTransaction))
			System.out.println("Customer Added Successfully");
	}
	
	private void addCustomerTransaction()
	{
		System.out.println("Enter Branch Name:");
		String branchName = scan.nextLine();
		System.out.println("Enter Customer Name:");
		String customerName = scan.nextLine();
		System.out.println("Enter Transaction Amount:");
		double amount = scan.nextDouble();
		if(bank.addCustomerTransaction(branchName, customerName, amount))
			System.out.println("Customer Transaction added Suceessfully");
	}
	
	public void availableActions()
	{
		System.out.println("Available Actions:\n press-");
		System.out.println("0. Show Available Actions");
		System.out.println("1. Add a Branch");
		System.out.println("2. Add new customer");
		System.out.println("3. Add Transaction for a customer");
		System.out.println("4. Show Customer List and their Transactions");
		System.out.println("5. Quit");
	}
	
	private void listCustomers()
	{
		System.out.println("Enter Branch Name:");
		String branchName = scan.nextLine();
		System.out.println("Show Transactions for Customers?(true/false)");
		boolean choice = scan.nextBoolean();
		bank.listCustomers(branchName, choice);
	}
}
