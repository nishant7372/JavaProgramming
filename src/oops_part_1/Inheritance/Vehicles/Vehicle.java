package oops_part_1.Inheritance.Vehicles;

public class Vehicle {
    private int wheels;
    private String colour;
    private String name;
    private String price;
    private String capacity;
    
	public Vehicle(int wheels, String colour, String name, String price, String capacity) {
		this.wheels = wheels;
		this.colour = colour;
		this.name = name;
		this.price = price;
		this.capacity = capacity;
	}

	public String getWheels() {
		return "Wheels: " + wheels;
	}

	public String getColour() {
		return "Color: "+colour;
	}

	public String getName() {
		return "Vehicle Name: "+name;
	}

	public String getPrice() {
		return "Price: "+ price;
	}

	public String getCapacity() {
		return "Seating Capacity: "+capacity;
	}	
}
