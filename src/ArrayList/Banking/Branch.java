package ArrayList.Banking;

import java.util.ArrayList;

public class Branch {

	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name)
	{
		this.name=name;
		this.customers=new ArrayList<>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Customer> getCustomers()
	{
		return this.customers;
	}
	
	public boolean newCustomer(String customerName,double initialAmount)
	{
		if(findCustomer(customerName)==null)
		{
			customers.add(new Customer(customerName,initialAmount));
			return true;
		}
        System.out.println("Customer " + customerName +" is already on the file");
		return false;
	}
	
	private Customer findCustomer(String customerName)
	{
		for(int i=0;i<customers.size();i++)
		{
			if(customers.get(i).getName().equals(customerName))
				return customers.get(i);
		}
		return null;
	}
	
	public boolean addCustomerTransaction(String customerName,double amount)
	{
		Customer existingCustomer = findCustomer(customerName);
		
		if(existingCustomer!=null)
		{
			existingCustomer.addTransaction(amount);
			return true;
		}
		System.out.println("Customer " + customerName +" is not on the file");
		return false;
	}
}

