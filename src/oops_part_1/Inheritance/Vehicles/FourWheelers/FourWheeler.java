package oops_part_1.Inheritance.Vehicles.FourWheelers;

import oops_part_1.Inheritance.Vehicles.Vehicle;

public class FourWheeler extends Vehicle{
	private String fourWheelerName;
	private String useType; //Private use or Business use
	
	public FourWheeler(int wheels, String colour, String name, String price, String capacity, String fourWheelerName,
			String useType) {
		super(wheels, colour, name, price, capacity);
		this.fourWheelerName = fourWheelerName;
		this.useType = useType;
	}
    
	@Override //Overriding the super class method to add some extra information
	public String getWheels(){
		return super.getWheels()+" main wheels with 1 extra wheel for replacement";
	}
	
	public String getFourWheelerName() {
		return "Four Wheeler Name: "+ fourWheelerName;
	}

	public String getUseType() {
		return "UseType: " + useType;
	}
	

}
