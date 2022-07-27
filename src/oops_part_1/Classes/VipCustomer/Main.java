package oops_part_1.Classes.VipCustomer;

public class Main {

	public static void main(String[] args)
	{
		VipCustomer nishant = new VipCustomer("nishant",2830.042,"nsbomb7@gmail.com");
		
		System.out.println(nishant.getName());
		System.out.println(nishant.getCreditLimit());
		System.out.println(nishant.getEmailAddress());
	}
}
