package ArrayList.Banking;

import java.util.Scanner;

public class App {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
//    	Bank bank = new Bank("Nishant World Bank");
//    	System.out.println(bank.addBranch("Branch 1"));
//    	
//    	System.out.println(bank.addCustomer("Branch 1", "nishant", 220.60));
//    	System.out.println(bank.addCustomer("Branch 1", "nishu", 240.60));
//    	System.out.println(bank.addCustomer("Branch 1", "nishit", 200.60));
//    	
//    	bank.addBranch("Branch 2");
//    	bank.addCustomer("Branch 2","srishti",39.44);
//    	bank.addCustomer("Branch 2","punit",32.44);
//    	
//    	bank.addCustomerTransaction("Branch 1", "nishant", 37.45);
//    	bank.addCustomerTransaction("Branch 1", "nishant", 373.45);
//    	bank.addCustomerTransaction("Branch 1", "nishu", 327.45);
//    	
//    	bank.listCustomers("Branch 1", false);
    	System.out.println("Enter Bank Name:");
    	ProcessingWindow processingWindow = new ProcessingWindow();
    	processingWindow.chooseOperation(scan.nextLine());
    }
}
