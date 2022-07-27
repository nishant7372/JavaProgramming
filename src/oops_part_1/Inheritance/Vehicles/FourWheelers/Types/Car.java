package oops_part_1.Inheritance.Vehicles.FourWheelers.Types;

import oops_part_1.Inheritance.Vehicles.FourWheelers.FourWheeler;

public class Car extends FourWheeler{

	private String carName;
	private String carModel;
	
	public Car(int wheels, String colour, String name, String price, String capacity, String fourWheelerName,
			String useType, String carName, String carModel) {
		super(wheels, colour, name, price, capacity, fourWheelerName, useType);
		this.carName = carName;
		this.carModel = carModel;
	}

	public String getCarName() {
		return "Car Name: "+carName;
	}

	public String getCarModel() {
		return "Car Model: "+carModel;
	}
	
}
