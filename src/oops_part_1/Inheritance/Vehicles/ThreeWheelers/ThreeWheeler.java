package oops_part_1.Inheritance.Vehicles.ThreeWheelers;

import oops_part_1.Inheritance.Vehicles.Vehicle;

public class ThreeWheeler extends Vehicle {

	private String threeWheelerName;
	private String useType;
	
	public ThreeWheeler(int wheels, String colour, String name, String price, String capacity, String threeWheelerName,
			String useType) {
		super(wheels, colour, name, price, capacity);
		this.threeWheelerName = threeWheelerName;
		this.useType = useType;
	}

	public String getThreeWheelerName() {
		return threeWheelerName;
	}

	public String getUseType() {
		return useType;
	}
	
}
