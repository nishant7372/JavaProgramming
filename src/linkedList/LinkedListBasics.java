package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {

	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("nishant");
		linkedList.add("srishti");
		linkedList.add("nitin");
		linkedList.add("satin");
		linkedList.add("nishu");
		
		printList(linkedList);
		
		linkedList.remove(4);   //remove from specified index
		linkedList.remove("nishant"); //remove particular string
		linkedList.add(0, "nishu"); //add at specified index
		
		printList(linkedList);
		traverse(linkedList);
	}
	
	private static void printList(LinkedList<String> linkedList)     //use of iterator
	{
		System.out.println("\nPrinting LinkedList using iterator:\n");
		Iterator<String> iter = linkedList.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	private static void traverse(LinkedList<String> linkedList)     //use of listIterator(doubly linkedList)
	{
		ListIterator<String> listIter = linkedList.listIterator();
		System.out.println("\nForward traverse:\n");
		while(listIter.hasNext())
			System.out.println(listIter.next());
		System.out.println("\nBackward traverse:\n");
		while(listIter.hasPrevious())
			System.out.println(listIter.previous());
	}
}
