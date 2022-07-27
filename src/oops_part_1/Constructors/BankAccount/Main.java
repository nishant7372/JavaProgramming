package oops_part_1.Constructors.BankAccount;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
public static void main(String[] args)
{
	System.out.println("Enter Customer Name:");
	String customerName = scan.nextLine();
	System.out.println("Enter Email Address:");
	String emailAddress = scan.nextLine();
	System.out.println("Enter Mobile Number:");
	Long mobileNumber = scan.nextLong();
    BankAccount b = new BankAccount("2001920100190",customerName,0.00,emailAddress,mobileNumber);
    
    while(true)
    {
    System.out.println("\nAvailable Balance:" + b.getBalance()+"\n");
    System.out.println("1. Deposit");
    System.out.println("2. Withdrawl");
    System.out.println("Enter your choice");
    int ch = scan.nextInt(); 
    System.out.println("Enter amount");
    double amount = scan.nextDouble();
    switch(ch)
    {
    	case 1: b.Deposit(amount);
    	        break;
    	case 2: b.withdrawl(amount);
    	        break;
    	default: System.out.println("Invalid Choice\n");
    }
    }
}
}
