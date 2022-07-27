package oops_part_1.Classes.Car;

public class Main {

  public static void main(String[] args)
  {
	  Car Santro = new Car();
	  Santro.setModel("xing");
	  Santro.setColour("Red");
	  Santro.setPrice(420000);
	  Santro.setSeats(5);
	  Santro.setWheeltype("Alloywheel");
	  
	  System.out.println("Santro Car details:");
	  System.out.println("Model: " + Santro.getModel() + "\nPrice: " + Santro.getPrice() 
	  + "\nColour: " + Santro.getColour() + "\nWheelType: " + Santro.getWheeltype() +
	  "\nSeats: "+ Santro.getSeats());
	  
      Car Alto = new Car();
	  
	  Alto.setModel("LXI");
	  Alto.setColour("White");
	  Alto.setPrice(350000);
	  Alto.setSeats(5);
	  Alto.setWheeltype("Alloywheel");
	  
	  System.out.println("\nAlto Car details:");
	  System.out.println("Model: " + Alto.getModel() + "\nPrice: " + Alto.getPrice() 
	  + "\nColour: " + Alto.getColour() + "\nWheelType: " + Alto.getWheeltype() + 
	  "\nSeats: "+ Alto.getSeats());
  }
}
