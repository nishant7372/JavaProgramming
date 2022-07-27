package oops_part_1.Classes.BankAccount;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
	   BankAccount b1 = new BankAccount();
	   b1.setAccountNumber(2001920100190l);
	   b1.setBalance(2927972.224);
	   b1.setCustomerName("Nishant Singh");
	   b1.setEmail("nst7372@gmail.com");
	   b1.setPhoneNumber(8447017372l);
	   
	   BankAccount b2 = new BankAccount();
	   b2.setAccountNumber(2001920100234l);
	   b2.setBalance(157453.30);
	   b2.setCustomerName("Rishu Tiwari");
	   b2.setEmail("risutwr7@gmail.com");
	   b2.setPhoneNumber(9876543210l);
	   
	   while(true)
	   {
	   System.out.println("Enter your Account Number:");
	   long l = scan.nextLong();	
	   
	   if(l==b1.getAccountNumber())
		   System.out.println("Available Balance: " + b1.getBalance());
	   else if(l==b2.getAccountNumber())
		   System.out.println("Available Balance: " + b2.getBalance());
	   else
	   {
		   System.out.println("Account not available");
	       System.exit(1);
	   }
	   System.out.println("\n1. Deposit");
	   System.out.println("2. Withdraw");
	   System.out.println("Enter your choice:");
	   int ch = scan.nextInt();
	   System.out.println("Enter Amount:");
	   double amount = scan.nextDouble();
	   if(l==b1.getAccountNumber())
	   {
	   switch(ch)
	   {
	   case 1: b1.Deposit(amount);
	           break;
	   case 2: b1.Withdrawl(amount);
	           break;
	   default: System.out.println("Invalid Choice\n\n");
	   }
	   System.out.println("Available Balance: " + b1.getBalance());
	   }
	   else if(l==b2.getAccountNumber())
	   {
	   switch(ch)
	   {
	   case 1: b2.Deposit(amount);
	           break;
	   case 2: b2.Withdrawl(amount);
	           break;
	   default: System.out.println("Invalid Choice\n\n");
	   }
	   System.out.println("Available Balance: " + b2.getBalance());
	   }
	}
	}
}
