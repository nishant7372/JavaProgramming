package oops_part_1.Classes.Car;

public class Car {

	private int seats;
	private int price;
	private String model;
	private String wheeltype;
	private String colour;
	
	public void setSeats(int seats)
	{
		this.seats=seats;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setModel(String model)
	{
		String validModel = model.toLowerCase();
		if(validModel.equals("LXI")||validModel.equals("XING"))
		this.model=model;
		else
		this.model = "Unknown";
	}
	public void setWheeltype(String wheeltype)
	{
		this.wheeltype=wheeltype;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public int getSeats()
	{
		return this.seats;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getModel()
	{
		return this.model;
	}
	public String getWheeltype()
	{
		return this.wheeltype;
	}
	public String getColour()
	{
		return this.colour;
	}
}
