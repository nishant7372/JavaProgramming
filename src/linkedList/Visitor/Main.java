package linkedList.Visitor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args)
	{
		LinkedList<String> monumentsToVisit = new LinkedList<>();
	    
		addInOrder(monumentsToVisit,"Taj Mahal");
		addInOrder(monumentsToVisit,"Taj Mahal");
		addInOrder(monumentsToVisit,"Hawa Mahal");
		addInOrder(monumentsToVisit,"Char Minar");
		addInOrder(monumentsToVisit,"Qutub Minar");
		addInOrder(monumentsToVisit,"Bhangarh Fort");
		addInOrder(monumentsToVisit,"Akshardham Temple");
		addInOrder(monumentsToVisit,"Char Minar");
		
		printList(monumentsToVisit);
	}
	
	private static boolean addInOrder(LinkedList<String> monumentsToVisit,String monument)
	{
		ListIterator<String> listIterator = monumentsToVisit.listIterator();
		while(listIterator.hasNext())
		{
			int cf = listIterator.next().compareTo(monument);
			if(cf==0)
			{
				System.out.println("Monument "+ monument + " is already added to the list");
				return false;
			}
			else if(cf>0)
			{
				listIterator.previous();
				listIterator.add(monument);
				return true;
			}
		}
		listIterator.add(monument);
		return true;
	}
	
	private static void printList(LinkedList<String> monumentsToVisit)     //use of iterator
	{
		Iterator<String> iter = monumentsToVisit.iterator();
		while(iter.hasNext())
		{
			System.out.println("Visiting monument "+ iter.next());
		}
	}
}
