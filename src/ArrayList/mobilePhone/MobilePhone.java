package ArrayList.mobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scan = new Scanner(System.in);
	private List<Contact> contactList = new ArrayList<>();
	
	public void startPhone()
	{
		boolean quit = false;
		availableActions();
		while(!quit)
		{
		System.out.print("\nEnter your choice(press 0 for available options): ");
		switch(scan.nextInt())
		{
		case 0: availableActions();
		        break;
		case 1: showContactList();
		        break;
		case 2: addNewContact();
		        break;
		case 3: removeExistingContact();
		        break;
		case 4: updateExistingContact();
		        break;
		case 5: getContact();
		        break;
		case 6: System.out.println("Shutting down...");
			    quit=true;
		        break;
		}
		}
	}
	
	private void availableActions()
	{
		System.out.println("Available Actions: \npress-");
		System.out.println("1 - to show Contact List" + 
		                   "\n2 - to add new Contact" + 
	                       "\n3 - to remove an Exisiting Contact" + 
		                   "\n4 - to update an existing contact" + 
		                   "\n5 - search Contact" + 
		                   "\n6 - quit");
	}
	private void addNewContact()
	{
		System.out.println("\n------Enter Details:------\n");
		System.out.print("Enter Name: ");
		String name = scan.next()+scan.nextLine();
		Contact contact = search(name);
		if(contact!=null)
		{
			System.out.println("\nContact Already Present:");
			showContactDetails(contact);
		}
		else
		{
		System.out.print("Enter Mobile Number: ");
		String mobileNumber = scan.next();
		contactList.add(new Contact(name,mobileNumber));
		System.out.println("Contact Successfully Added.");
		}
	}
	
	private void removeExistingContact()
	{
		System.out.print("Enter Name: ");
		String name = scan.next()+scan.nextLine();
		Contact contact = search(name);
		if(contact==null)
		{
			System.out.println("\nNo Contact Found...");
		}
		else 
		{
			showContactDetails(contact);
			System.out.println("\nTo Confirm: Press 1: ");
			System.out.println("To Deny: Press 2: ");
			if(scan.nextInt()==1)
			{
				contactList.remove(contact);
				System.out.println("Contact Successfully Deleted.");
			}
		}
	}
	
	private Contact search(String name)
	{
		for(Contact contact:contactList)
		{
			if(contact.getName().toLowerCase().equals(name.toLowerCase()))
				return contact;
		}
		return null;
	}
	
	private void showContactDetails(Contact contact)
	{
		System.out.println("Contact Details:");
		System.out.println("Name: "+ contact.getName());
		System.out.println("Mobile Number: (+91)" + contact.getMobileNumber());
	}
	
	private void getContact()
	{
		System.out.print("Enter Name: ");
		Contact contact = search(scan.next()+scan.nextLine());
		if(contact==null)
			System.out.println("\nNo contact Found!!!");
		else
			showContactDetails(contact);
	}
	
	private void showContactList()
	{
		if(contactList.isEmpty())
			System.out.println("Contact List is Empty....");
		else
		{
		System.out.println("\n-------Contact List-------\n");
		for(Contact contact:contactList)
		{
			System.out.println(contact.getName() + "--> (+91)" + contact.getMobileNumber());
		}
		}
	}
	
	private void updateExistingContact()
	{
		System.out.print("Enter Name: ");
		String name = scan.next()+scan.nextLine();
		Contact contact = search(name);
		if(contact==null)
		{
			System.out.println("\nNo Contact Found...");
		}
		else 
		{
			showContactDetails(contact);
			System.out.print("Enter New Name: ");
			String newName= scan.next();
			Contact existingContact = search(newName);
			if(existingContact!=null)
			{
				System.out.println("\nContact Already Present:");
				showContactDetails(existingContact);
			}
			else
			{
			System.out.print("Enter New Number: ");
			String newNumber = scan.next()+scan.nextLine();
			Contact newContact = new Contact(newName,newNumber);
			contactList.set(contactList.indexOf(contact),newContact);
			System.out.println("Contact Successfully Updated...");
			showContactDetails(newContact);
			}
		}
	}
}
