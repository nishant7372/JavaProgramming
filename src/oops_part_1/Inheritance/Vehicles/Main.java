package oops_part_1.Inheritance.Vehicles;

import oops_part_1.Inheritance.Vehicles.FourWheelers.Types.Car;
import oops_part_1.Inheritance.Vehicles.TwoWheelers.Types.Bike;

public class Main {

	public static void main(String[] args)
	{
		Bike bike1 = new Bike(2,"Black","TwoWheeler","86000.00","2 Seater","Bike","Personal Use",140,"Splendor","i3s");
		Bike bike2 = new Bike(2,"Silver","TwoWheeler","260000.00","2 Seater","Bike","Personal Use",250,"Royal Enfield 500cc","Classic");
		Car car1 = new Car(4,"Maroon","FourWheeler","500000.00","5 Seater","Car","Personal Use","Santro","xing");
		Car car2 = new Car(4,"White","FourWheeler","6000000.00","4 Seater","Car","Personal Use","Audi","Q7");
		
		System.out.println("Bike1 Information:");
		System.out.println("------------------");
		System.out.println(bike1.getName());
		System.out.println(bike1.getTwoWheelerName());
		System.out.println(bike1.getBikeName());
		System.out.println(bike1.getBikeModel());
		System.out.println(bike1.getCapacity());
		System.out.println(bike1.getColour());
		System.out.println(bike1.getPrice());
		System.out.println(bike1.getWheels());
		System.out.println(bike1.getType());
		System.out.println(bike1.getSpeed());
		
		System.out.println("\n\nBike2 Information:");
		System.out.println("------------------");
		System.out.println(bike2.getName());
		System.out.println(bike2.getTwoWheelerName());
		System.out.println(bike2.getBikeName());
		System.out.println(bike2.getBikeModel());
		System.out.println(bike2.getCapacity());
		System.out.println(bike2.getColour());
		System.out.println(bike2.getPrice());
		System.out.println(bike2.getWheels());
		System.out.println(bike2.getType());
		System.out.println(bike2.getSpeed());
		
		System.out.println("\n\nCar1 Information:");
		System.out.println("-----------------");
		System.out.println(car1.getName());
		System.out.println(car1.getFourWheelerName());
		System.out.println(car1.getCarName());
		System.out.println(car1.getCarModel());
		System.out.println(car1.getCapacity());
		System.out.println(car1.getColour());
		System.out.println(car1.getPrice());
		System.out.println(car1.getWheels());
		System.out.println(car1.getUseType());
		
		System.out.println("\n\nCar2 Information:");
		System.out.println("-----------------");
		System.out.println(car2.getName());
		System.out.println(car2.getFourWheelerName());
		System.out.println(car2.getCarName());
		System.out.println(car2.getCarModel());
		System.out.println(car2.getCapacity());
		System.out.println(car2.getColour());
		System.out.println(car2.getPrice());
		System.out.println(car2.getWheels());
		System.out.println(car2.getUseType());
		
	}
}
