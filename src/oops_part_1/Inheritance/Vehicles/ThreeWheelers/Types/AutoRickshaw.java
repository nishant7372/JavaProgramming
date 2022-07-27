package oops_part_1.Inheritance.Vehicles.ThreeWheelers.Types;

import oops_part_1.Inheritance.Vehicles.ThreeWheelers.ThreeWheeler;

public class AutoRickshaw extends ThreeWheeler{
    private String autoRickshawName;
    private String autoRickshawModel;
    
	public AutoRickshaw(int wheels, String colour, String name, String price, String capacity, String threeWheelerName,
			String useType, String autoRickshawName, String autoRickshawModel) {
		super(wheels, colour, name, price, capacity, threeWheelerName, useType);
		this.autoRickshawName = autoRickshawName;
		this.autoRickshawModel = autoRickshawModel;
	}

	public String getAutoRickshawName() {
		return autoRickshawName;
	}

	public String getAutoRickshawModel() {
		return autoRickshawModel;
	}
}
