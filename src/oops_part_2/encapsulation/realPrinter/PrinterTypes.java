package oops_part_2.encapsulation.realPrinter;

import java.util.Scanner;

public class PrinterTypes {
    private Scanner scan = new Scanner(System.in);
    private Printer duplexPrinter = new Printer(true);
	private Printer nonDuplexPrinter = new Printer(false);
	public void choosePrinter()
	{
		System.out.println("\n Available Printers:");
		System.out.println("1. Duplex Printer");
		System.out.println("2. Non-Duplex Printer");
		System.out.print("Select your printer:");
		switch(scan.nextInt())
		{
		case 1: start(duplexPrinter);
		        break;
		case 2: start(nonDuplexPrinter);
		        break;
		}
	}
		
	    private void start(Printer printer)
		{
	    System.out.println("--> Initial Toner Level:" + printer.getTonerLevel());
		System.out.println("--> Initial Pages Print:" + printer.getPagesPrint()+"\n");
		boolean main = true;
		while(main)
		{
		  System.out.println("1. Print");
		  System.out.println("2. Refill");
		  System.out.println("3. Turn Off");
		  System.out.print("Enter your choice: ");
		  int ch = scan.nextInt();
		  
		  switch(ch)
		  {
		  case 1: System.out.print("\nEnter number of pages: ");
		          int pages = scan.nextInt();
		          printer.print(pages);
		          break;
		  case 2: System.out.print("\nEnter Refill percentage: ");
		          double amount = scan.nextDouble();
		          printer.reFill(amount);
		          break;
		  case 3: System.out.println("Printer Turned Off...\n");
		          main=false;
		  }
		}
		System.out.println("1. Turn On Current Printer");
		System.out.println("2. Change your printer");
		System.out.print("Enter your choice: ");
		switch(scan.nextInt())
		{
		case 1:start(printer);
		       break;
		case 2:choosePrinter();
		       break;
		}
	}
}
