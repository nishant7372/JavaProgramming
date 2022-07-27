package ArrayList.Banking;

import java.util.ArrayList;

public class Bank {
	
	@SuppressWarnings("unused")
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name)
	{
		this.name=name;
		this.branches=new ArrayList<>();
	}
	
	public boolean addBranch(String branchName)
	{
		if(findBranch(branchName)==null)
		{
			this.branches.add(new Branch(branchName));
			return true;
		}
		System.out.println("Branch " + branchName + " is already on the file");
		return false;
	}
	
	public boolean addCustomer(String branchName,String customerName,double initialAmount)
	{
		Branch branch = findBranch(branchName);
		
		if(branch!=null)
		{
			return branch.newCustomer(customerName, initialAmount);
		}
		System.out.println("Branch " + branchName + " is not on the file");
		return false;
	}
	
	private Branch findBranch(String branchName)
	{
		for(int i=0;i<branches.size();i++)
		{
			if(branches.get(i).getName().equals(branchName))
				return branches.get(i);
		}
		return null;
	}
	
	public boolean addCustomerTransaction(String branchName,String customerName,double amount)
	{
		Branch branch = findBranch(branchName);
		
		if(branch!=null)
		{
			return branch.addCustomerTransaction(customerName, amount);
		}
		System.out.println("Branch " + branchName + " is not on the file");
		return false;
	}
	
	public boolean listCustomers(String branchName,boolean showTransactions)
	{
		Branch branch = findBranch(branchName);
		if(branch!=null)
		{
			System.out.println("Customer details for branch '"+ branch.getName()+"':");
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			int i=1;
			for(Customer customer:branchCustomers)
			{
				System.out.println("\nCustomer #" + i++ +": "+customer.getName());
				
				if(showTransactions)
				{
					int j=1;
					ArrayList<Double> transactions = customer.getTransactions();
					System.out.println("\nTransactions:");
					for(double transaction:transactions)
					{
						System.out.println("#" + j++ +": " +  transaction);
					}
				}
			}	
			return true;
		}
		else
		{
			System.out.println("Branch " + branchName + " is not on the file");
			return false;
		}
	}
}
