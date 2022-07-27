package oops_part_1.Classes.VipCustomer;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public VipCustomer(){
		this("DefaultName",100000.00,"DefaultAddress");
	}
	
	public VipCustomer(String name,double creditLimit,String emailAddress){
		this.name=name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAddress;
	}

	public VipCustomer(String name,double creditLimit){
		this(name,creditLimit,"DefaultAddress");
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}	
}
