package ArrayList.mobilePhone;

public class Contact {

	private String name;
	private String mobileNumber;
	
	public Contact(String name,String mobileNumber)
	{
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
	
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	
	public String getName()
	{
		return name;
	}

}
